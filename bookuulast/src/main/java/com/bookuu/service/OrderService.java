package com.bookuu.service;

import com.bookuu.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    List<Order> odres(@Param("uid")Integer uid);
    void insertOrder(@Param("uid")Integer uid,@Param("orderName")String orderName,@Param("orderType")Integer orderType);
}
