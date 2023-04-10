package com.likai.api.myproject.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author admin
 */
@Getter
@Setter
public class User {
    long userId;
    String userName;

    String password;

    String sex;
}
