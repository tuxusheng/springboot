package com.xs.springboot2.controller;

import com.xs.springboot2.pojo.Book;
import com.xs.springboot2.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Book> list = bookService.findAll();
        System.out.println("=====" + list.size() + "=====");

        for (Book book : list) {
            System.out.println(book.getId());
            System.out.println(book.getCreateDate() + book.getAuthor() + book.getBookName());
        }
        return "JpaTest";
    }

    @RequestMapping("/findBookById")
    public String findBookById(Model model) {
//        Book book = bookService.findById(1).get();
//        System.out.println(book.getId() + book.getBookName());
        return "JapTest";
    }
}
