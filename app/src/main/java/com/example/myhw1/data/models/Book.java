package com.example.myhw1.data.models;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String desc;

    public Book(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}