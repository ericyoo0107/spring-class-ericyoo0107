package com.jscode.jscode.week3;

import lombok.Data;

@Data
public class User {
    private String Name;
    private Integer age;
    private String sex;

    public User(String name, Integer age, String sex) {
        Name = name;
        this.age = age;
        this.sex = sex;
    }
}
