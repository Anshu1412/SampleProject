package com.Sample.LibraryManagementSystem.Controller;

import com.Sample.LibraryManagementSystem.Entity.Book;
import com.Sample.LibraryManagementSystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    public BookService bookService;


    @PostMapping(value = "saveBook")
    public Book saveAuthor(@RequestBody Book book){
        System.out.println("Book Saved!!");
        bookService.saveBook(book);
        return book;
    }

    @PutMapping(value = "updateBook")
    public Book updateBook(@RequestBody Book book){
        System.out.println("Book Saved!!");
        return bookService.updateBook(book);

    }

    @GetMapping(value="getAllBooks")
    public List<Book> findAllBook(){
        return  bookService.findAllBook();
    }

    @DeleteMapping(value="deleteBook")
    public String deleteBook(@RequestParam int id){
        bookService.deleteBook(id);
        return "Book Deleted!!";
    }

    @GetMapping(value = "getBookById")
    public String findBookById(@RequestParam int id){
        bookService.findBookByID(id);
        return "Book Found!!";
    }

    @GetMapping(value = "getAllBooksByPublisherId")
    public Long getNumberOfBooksByPublisherId(@RequestParam int id){
        Long stream=bookService.findAllBook()
                .stream()
                .filter(publisher->publisher.getPublisher().getPublisherId()==id)
                .count();
        return stream;
    }

    @GetMapping(value = "getAllBooksByAuthorId")
    public Long getNumberOfBooksByAuthorId(@RequestParam int id){
        Long stream=bookService.findAllBook()
                .stream()
                .filter(author->author.getAuthor().getAuthorId()==id)
                .count();
        return stream;
    }
}
