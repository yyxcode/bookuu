package com.bookuu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer oid;

    private Integer uid;

    private String ordername;
    private OrderType orderType;
}