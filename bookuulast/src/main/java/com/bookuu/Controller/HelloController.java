package com.bookuu.Controller;

import com.bookuu.entity.*;
import com.bookuu.service.Impl.*;
import com.bookuu.service.OrderService;
import com.bookuu.util.RedisUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
public class HelloController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    ModelServiceImpl modelService;
    @Autowired
    TypeServiceImpl typeService;
    @Autowired
    HttpSession session;
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    OrderServiceImpl orderService;
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        redisUtil.set("k1","k1");
        redisUtil.del("k1");
        return (String) redisUtil.get("k1");
    }

    @GetMapping("/getCart")
    public String getCart(Model model){
        User user= (User) session.getAttribute("user");
        if  (user!=null){
        Set<String> keys = redisUtil.keys("*"+user.getUid());
        Object[] objects = keys.toArray();
        List<Map<Object,Object>> bookCarts;
        bookCarts = new ArrayList<>();
        for (Object o:objects){
            bookCarts.add(redisUtil.hmget(o.toString()));
        }
        int number=0;
        for (Map<Object,Object> book:bookCarts){
            int i = (int) book.get("bookPrice") * (int)book.get("bookNumber");
            number+=i;
        }
        model.addAttribute("bookCarts",bookCarts);
        model.addAttribute("number",number);
        return "cart";
        }else {
            return "404";
        }
    }


    /**
     * 登录方法
     * @param user HTML传送至的用户信息
     * @return user
     */
    @PostMapping("/login")
    public String login( User user) throws IOException {
        Integer count = userService.count(user.getUsername());
        if (count == 1){
            User user1 = userService.user(user.getUsername(), user.getUserpass());
            session.setAttribute("user",user1);
            return "redirect:/";
        }else {
            return "404";
        }
    }
    @GetMapping("/modelBooks")
    public String getModel(Model model, int mid, HttpServletRequest request){
        mid = Integer.parseInt(request.getParameter("mid"));
        request.getSession().setAttribute("mid",mid);
        List<Type> types = typeService.types();
        PageInfo<Book> bookPageInfo = bookService.modelBooks(mid,8,1);
        List<Book> bookList = bookPageInfo.getList();
        long total = bookPageInfo.getPages();
        int nowPage = bookPageInfo.getPrePage()+1;
        model.addAttribute("types",types);
        model.addAttribute("bookList",bookList);
        model.addAttribute("total",total);
        model.addAttribute("nowPage",nowPage);
        return "modelShop";
    }

    @GetMapping("/checkout.html")
    public String checkout(Model model){
        User user= (User) session.getAttribute("user");
        List<Order> odres = orderService.odres(user.getUid());
        model.addAttribute("odres",odres);
        return "checkout";
    }

    /**
     * 搜索图书
     */
    @GetMapping("/seachBooks")
    public String seachBooks(Model model, HttpServletRequest request){
        String bookName = request.getParameter("bookName");
        request.getSession().setAttribute("bookName",bookName);
        List<Type> types = typeService.types();
        PageInfo<Book> bookPageInfo = bookService.seachBooks(bookName,8,1);
        List<Book> bookList = bookPageInfo.getList();
        long total = bookPageInfo.getPages();
        int nowPage = bookPageInfo.getPrePage()+1;
        model.addAttribute("types",types);
        model.addAttribute("bookList",bookList);
        model.addAttribute("total",total);
        model.addAttribute("nowPage",nowPage);
        return "seachShop";
    }

    /**
     * 获取单个图书的信息
     * @param model 视图
     * @param bookname 图书名字
     * @return product-details.html
     */
    @GetMapping("/book")
    public String getBook(Model model, String bookname){
        Book book = bookService.book(bookname);
        model.addAttribute("book",book);
        return "product-details";
    }

    /**
     * 书城
     * @return shop
     */
    @GetMapping("/shop")
    public String getShop(Model model){
        List<Type> types = typeService.types();
        PageInfo<Book> bookPageInfo = bookService.allBooks(8, 1);
        List<Book> bookList = bookPageInfo.getList();
        long total = bookPageInfo.getPages();
        int nowPage = bookPageInfo.getPrePage()+1;
        model.addAttribute("types",types);
        model.addAttribute("bookList",bookList);
        model.addAttribute("total",total);
        model.addAttribute("nowPage",nowPage);
        return "shop";
    }

    /**
     * 获取所有图书信息
     * @param model 视图
     * @return main.html
     */
    @GetMapping
    public String books(Model model){
        User user= (User) session.getAttribute("user");
        if (user!=null){
            Set<String> keys = redisUtil.keys("*"+user.getUid());
            Object[] objects = keys.toArray();
            List<Map<Object,Object>> bookCarts;
            bookCarts = new ArrayList<>();
            for (Object o:objects){
                bookCarts.add(redisUtil.hmget(o.toString()));
            }
            int number=0;
            for (Map<Object,Object> book:bookCarts){
                int i = (int) book.get("bookPrice") * (int)book.get("bookNumber");
                number+=i;
            }
            session.setAttribute("bookCarts",bookCarts);
            session.setAttribute("number",number);
            session.setAttribute("size",keys.size());
        }
        List<Book> books=bookService.newBooks();
        List<Book> authorBooks=bookService.authorBook();
        List<Book> heatBooks=bookService.heatBooks();
        Author author=bookService.authorBook().get(0).getAuthor();
        com.bookuu.entity.Model bookModel=bookService.authorBook().get(0).getModel();
        model.addAttribute("books",books);
        model.addAttribute("authorBooks",authorBooks);
        model.addAttribute("heatBooks",heatBooks);
        model.addAttribute("author",author);
        model.addAttribute("bookModel",bookModel);
        return "main";
    }

    /**
     * 注册
     */
    @PostMapping("/register")
    public String register(HttpServletRequest request){
        String firstName= request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String companyName=request.getParameter("companyName");
        String emailAddress=request.getParameter("emailAddress");
        int Phone=Integer.parseInt(request.getParameter("Phone"));
        String countryName=request.getParameter("countryName");
        String cityName=request.getParameter("cityName");
        String streetName=request.getParameter("streetName");
        String password=request.getParameter("password");
        String userName=firstName+lastName;
        String Address=countryName+cityName+streetName;
        userService.insertUser(userName,password,Phone,emailAddress,companyName,Address);
        return "login";
    }

    /**
     * 退出
     * @return shop
     */
    @GetMapping("/exit")
    public String exit( HttpServletResponse response) throws IOException {
        if (session.getAttribute("user") ==null){
            PrintWriter out=response.getWriter();
            response.setContentType("text/html;charset=UTF-8");
            out.print("<script>alert('您未登录，请您先登录');</script>");
            return "redirect:/";
        }else {
            session.invalidate();
            return "redirect:/";
        }
    }
}
