package com.bookuu.Controller;

import com.bookuu.entity.User;
import com.bookuu.util.RedisUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CartController {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    HttpSession session;

    @GetMapping("/addCart")
    public String addCart(@Param("bookName") String bookName,@Param("bookPrice") Integer bookPrice,@Param("bookImage") String bookImage,@Param("bookNumber") Integer bookNumber){
        User user = (User) session.getAttribute("user");
        if (user==null){
            return "您未登录不能添加购物车";
        }else {
            boolean book = redisUtil.hasKey(bookName+String.valueOf(user.getUid()));
            if (book){
                redisUtil.hincr(bookName+String.valueOf(user.getUid()),"bookNumber",bookNumber);
            }else {
                Map<String,Object> bookMap=new HashMap<>();
                bookMap.put("bookName",bookName);
                bookMap.put("bookPrice",bookPrice);
                bookMap.put("bookImage",bookImage);
                bookMap.put("bookNumber",bookNumber);
                redisUtil.hmset(bookName+String.valueOf(user.getUid()),bookMap,3600*24*30);
            }
            return "添加成功";
        }
    }
    @GetMapping("/inCart")
    public String inCart(@Param("bookName") String bookName,@Param("bookPrice") Integer bookPrice,@Param("bookImage") String bookImage,@Param("bookNumber") Integer bookNumber){
        User user = (User) session.getAttribute("user");
        boolean book = redisUtil.hasKey(bookName);
        if  (book){
            redisUtil.hdecr(bookName+String.valueOf(user.getUid()),"bookNumber",bookNumber);
            return "成功";
        }else {
            return "商品不存在";
        }
    }

    @GetMapping("/delCart")
    public String delCart(@Param("bookName") String bookName){
        User user = (User) session.getAttribute("user");
        redisUtil.del(bookName+String.valueOf(user.getUid()));
        return "删除成功";
    }
}
