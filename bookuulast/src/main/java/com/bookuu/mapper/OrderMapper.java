package com.bookuu.mapper;

import com.bookuu.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface OrderMapper {
    List<Order> odres(@Param("uid")Integer uid);
    @Insert("INSERT `order`(uid,orderName,orderType) VALUES(#{uid},#{orderName},#{orderType})")
    void insertOrder(@Param("uid")Integer uid,@Param("orderName")String orderName,@Param("orderType")Integer orderType);
}