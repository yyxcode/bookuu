package com.bookuu.Controller;

import com.alibaba.fastjson.JSON;
import com.bookuu.entity.Book;
import com.bookuu.service.Impl.BookServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    HttpServletRequest request;


    @GetMapping("/Books")
    @ResponseBody
    public String books(int pageSize,int pageNumber){
        pageSize=Integer.parseInt(request.getParameter("pageSize"));
        pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
        PageInfo<Book> bookPageInfo=bookService.allBooks(pageSize,pageNumber);
        List<Book> bookList = bookPageInfo.getList();
        String bookInfo = JSON.toJSONString(bookList);
        return bookInfo;
    }
    @GetMapping("/ModelBook")
    @ResponseBody
    public String modelBook(Integer mid,int pageSize,int pageNumber){
        pageSize=Integer.parseInt(request.getParameter("pageSize"));
        pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
        mid=Integer.parseInt(request.getParameter("mid"));
        PageInfo<Book> bookPageInfo = bookService.modelBooks(mid, pageSize, pageNumber);
        List<Book> bookList = bookPageInfo.getList();
        String bookInfo = JSON.toJSONString(bookList);
        return bookInfo;
    }

    @GetMapping("/SeachBook")
    @ResponseBody
    public String SeachBook(String name,int pageSize,int pageNumber){
        pageSize=Integer.parseInt(request.getParameter("pageSize"));
        pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
        name=request.getParameter("name");
        PageInfo<Book> bookPageInfo = bookService.seachBooks(name, pageSize, pageNumber);
        List<Book> bookList = bookPageInfo.getList();
        String bookInfo = JSON.toJSONString(bookList);
        return bookInfo;
    }
}
