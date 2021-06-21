package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message = "nhap vao")
    @Email(message = "loi cmnr")
    @Size(min = 2, max = 30)
    private String name;


    @Min(value = 18,message = "trên 18 tuổi")
    @Max(value = 50, message = "{message-age}")
    private int age;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 30) String name, @Min(18) @Max(50) int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}