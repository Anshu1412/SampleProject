package com.Sample.LibraryManagementSystem.Entity;



import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Integer bookId;
    private String bookName;
    private String bookGenre;
    private Double bookPrice;
    private Integer numberOfPages;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;


}

