package com.xs.springboot2.service.impl;

import com.xs.springboot2.mapper.BookDao;
import com.xs.springboot2.pojo.Book;
import com.xs.springboot2.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;


    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Page<Book> findAllByPage() {
        return null;
    }
}
