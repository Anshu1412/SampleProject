package com.Sample.LibraryManagementSystem.Controller;


import com.Sample.LibraryManagementSystem.Entity.Author;
import com.Sample.LibraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    public AuthorService authorService;


    @PostMapping(value = "saveAuthor")
    public Author saveAuthor(@RequestBody Author author){
        System.out.println("Author Saved!!");
        authorService.saveAuthor(author);
        return author;
    }


    @PutMapping(value = "updateAuthor")
    public Author updateAuthor(@RequestBody Author author){
        System.out.println("Author Saved!!");
        return authorService.updateAuthor(author);

    }

    @GetMapping(value = "getAllAuthor")
    public List<Author> findAllAuthor(){
        return  authorService.findAllAuthor();
    }

    @DeleteMapping("deleteAuthor")
    public String deleteAuthor(@RequestParam int id){
        authorService.deleteAuthor(id);
        return "Publisher Deleted!!";
    }
}
