package com.bookuu.service.Impl;

import com.bookuu.entity.Order;
import com.bookuu.mapper.OrderMapper;
import com.bookuu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> odres(Integer uid) {
        return orderMapper.odres(uid);
    }

    @Override
    public void insertOrder(Integer uid, String orderName, Integer orderType) {
        orderMapper.insertOrder(uid, orderName, orderType);
    }
}
