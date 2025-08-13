package org.Pratham.BookAPI.entity;

import java.security.PrivateKey;

public class Book {

    private  Long Id;

    private  String Title;

    private String Author;

    private Double Price;

    public Book(){

    }

    public Book(String author, Double price, String title, Long id) {
        Author = author;
        Price = price;
        Title = title;
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
