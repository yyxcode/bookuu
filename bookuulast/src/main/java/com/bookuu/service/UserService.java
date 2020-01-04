package com.bookuu.service;

import com.bookuu.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * User的服务接口
 */
public interface UserService {
    Integer count(@Param("username")String username);
    User user(String userName,String userPass);
    void insertUser(@Param("username") String username,@Param("password") String password,@Param("phone") Integer phone,@Param("useremail") String useremail,@Param("usercompany") String usercompany,@Param("useraddress") String useraddress);
}
