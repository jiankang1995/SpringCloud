package com.jkli.springbootdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//将pojo实例化到Spring容器
@Component
public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}