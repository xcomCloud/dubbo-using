package com.xue.study.model;

import java.io.Serializable;

/**
 * Author: mf015
 * Date: 2020/6/15 0015
 */
public class Book implements Serializable {
    private String book;
    private String author;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
