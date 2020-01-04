package com.bookuu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
public class Cart {
    private String bookName;
    private Integer bookPrice;
    private String bookImage;
    private Integer bookNumber;

}
