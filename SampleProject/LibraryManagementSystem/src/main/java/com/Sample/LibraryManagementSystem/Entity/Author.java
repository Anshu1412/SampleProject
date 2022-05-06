package com.Sample.LibraryManagementSystem.Entity;




import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Author{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Integer authorId;
    private String authorName;
    private String authorAddress;
    private String authorCountry;
    private String authorState;
    private String authorEmail;
    private String authorPhone;

}
