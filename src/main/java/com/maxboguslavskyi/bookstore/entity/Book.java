package com.maxboguslavskyi.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code", length = 25)
    private String code;

    @Column(name = "price", length = 5)
    private String price;

    @Column(name = "authors")
    private String authors;

    @Column(name = "isbn", length = 25)
    private String isbn;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "published_date")
    private Date publishedOn;

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    @Override
    public String toString() {
        return "Book {" +
                "id = " + id +
                ", name = '" + name +
                ", code = " + code +
                ", price = " + price +
                ", authors = " + authors +
                ", isbn = " + isbn +
                ", publisher = " + publisher +
                ", publishedOn = " + publishedOn +
                '}';
    }
}
