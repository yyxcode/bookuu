package com.bookuu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private Integer aid;

    private String authorname;

    private String authorbrief;
    private Integer authorheat;
}