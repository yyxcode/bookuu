package com.bookuu.service.Impl;

import com.bookuu.entity.Book;
import com.bookuu.mapper.BookMapper;
import com.bookuu.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public Book book(String bookName) {
        return bookMapper.book(bookName);
    }

    @Override
    public List<Book> newBooks() {
        return bookMapper.newBooks();
    }

    @Override
    public List<Book> authorBook() {
        return bookMapper.authorBook();
    }

    @Override
    public List<Book> heatBooks() {
        return bookMapper.heatBooks();
    }

    @Override
    public PageInfo<Book> modelBooks(Integer mid,int pageSize,int pageNumber) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Book> modelBooks=bookMapper.modelBooks(mid);
        return new PageInfo<>(modelBooks);
    }

    @Override
    public PageInfo<Book> allBooks(int pageSize,int pageNumber) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Book> allBooks=bookMapper.allBooks();
        return new PageInfo<>(allBooks);
    }

    @Override
    public PageInfo<Book> seachBooks(String bookName, int pageSize, int pageNumber) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Book> seachBooks=bookMapper.seachBooks(bookName);
        return new PageInfo<>(seachBooks);
    }
}
