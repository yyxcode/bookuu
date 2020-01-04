package com.bookuu.mapper;

import com.bookuu.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    @Select("SELECT\n" +
            "Count(1)\n" +
            "FROM\n" +
            "`user`\n" +
            "WHERE \n" +
            "userName=#{username}")
    int count(@Param("username") String username);
    @Select("SELECT\n" +
            "*\n"+
            "FROM\n" +
            "`user`\n" +
            "WHERE\n" +
            "`user`.userName =#{username}  AND\n" +
            "`user`.userPass =#{password} ")
    User user(@Param("username") String username,@Param("password") String password);

    @Insert("INSERT `user`(userName,userPass,userEmail,phone,userCompany,userAddress) VALUES (#{username},#{password},#{useremail},#{phone},#{usercompany},#{useraddress})")
    void insertUser(@Param("username") String username,@Param("password") String password,@Param("phone") Integer phone,@Param("useremail") String useremail,@Param("usercompany") String usercompany,@Param("useraddress") String useraddress);
}