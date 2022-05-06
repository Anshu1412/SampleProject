package com.Sample.LibraryManagementSystem.Service;


import com.Sample.LibraryManagementSystem.Entity.Author;
import com.Sample.LibraryManagementSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }

    public List<Author> findAllAuthor() {
        return (List<Author>) authorRepository.findAll();
    }
}
