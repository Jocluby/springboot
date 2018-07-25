package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {
/*	@Value(value = "${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private  String bookName;
	@Value("${book.pinyin}")
	private  String bookPinYin;*/
	@Autowired
	private  BookBean bookbean;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	/*@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String  lp(){
		return "lptest that bookname"+bookName+"bookauthor is "+bookAuthor+" book pinyin is "+bookPinYin;
	}*/
	@RequestMapping("'/book")
	public String book(){
		return "lptest that bookname"+bookbean.getBookName()+"bookauthor is "+bookbean.getBookAuthor()
				+" book pinyin is "+bookbean.getBookPinYin();
	}

}
