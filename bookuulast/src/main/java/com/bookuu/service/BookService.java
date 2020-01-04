package com.bookuu.service;

import com.bookuu.entity.Book;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    Book book(String bookName);
    List<Book> newBooks();
    List<Book> authorBook();
    List<Book> heatBooks();
    PageInfo<Book> modelBooks(Integer mid,int pageSize,int pageNumber);
    PageInfo<Book> allBooks(int pageSize,int pageNumber);
    PageInfo<Book> seachBooks(@Param("bookname") String bookName,int pageSize,int pageNumber);
}
