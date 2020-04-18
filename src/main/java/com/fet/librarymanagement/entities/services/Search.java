package com.fet.librarymanagement.entities.services;

import com.fet.librarymanagement.entities.book.Book;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@RequestMapping("/searchbook")
public interface Search {
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPubDate(Date publishDate);

}
