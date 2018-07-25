package com.example.springboot;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "book")
@PropertySource("classpath:config/book.properties")
public class BookBean {
    private String bookAuthor;
    private  String bookName;
    private  String bookPinYin;
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPinYin() {
        return bookPinYin;
    }

    public void setBookPinYin(String bookPinYin) {
        this.bookPinYin = bookPinYin;
    }


}
