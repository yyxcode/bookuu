package com.bookuu.mapper;

import com.bookuu.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface BookMapper {
    Book book(@Param("bookname") String bookName);
    List<Book> newBooks();
    List<Book> authorBook();
    List<Book> heatBooks();
    List<Book> modelBooks(@Param("bookmodel") Integer mid);
    List<Book> allBooks();
    List<Book> seachBooks(@Param("bookname") String bookName);
}