package com.bookuu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * user实体类
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer uid;

    private String phone;

    private String username;

    private String useremail;

    private String userpass;

    private String usercompany;

    private String useraddress;
}