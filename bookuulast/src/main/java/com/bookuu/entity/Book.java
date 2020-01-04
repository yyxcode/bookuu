package com.bookuu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer bid;

    private String bookname;

    private BigDecimal bookprice;

    private Integer bookmodel;

    private String bookbrief;

    private Integer bookauthor;

    private Integer booktype;

    private String bookpress;

    private Long bookdiscount;

    private String bookimage;
    private Integer bookheat;
    private Date bookday;
    private Type  type;
    private Model  model;
    private Author author;

}