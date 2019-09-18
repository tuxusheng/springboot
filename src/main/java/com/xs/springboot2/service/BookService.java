package com.xs.springboot2.service;

import com.xs.springboot2.pojo.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookService {

    /**
     * 查询所有书本信息
     */
    public List<Book> findAll();

    /**
     * 分页查询书本信息
     * @return
     */
    public Page<Book> findAllByPage();
}
