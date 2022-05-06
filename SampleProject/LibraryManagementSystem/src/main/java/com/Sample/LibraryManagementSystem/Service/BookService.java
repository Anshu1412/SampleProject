package com.Sample.LibraryManagementSystem.Service;


import com.Sample.LibraryManagementSystem.Entity.Book;
import com.Sample.LibraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    
    @Autowired
    public BookRepository bookRepository;
    
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBook() {
        return (List<Book>) bookRepository.findAll();
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public void findBookByID(int id) {
        bookRepository.findById(id).get();
    }
}
