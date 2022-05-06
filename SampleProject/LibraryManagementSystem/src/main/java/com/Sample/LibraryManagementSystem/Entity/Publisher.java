package com.Sample.LibraryManagementSystem.Entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id")
    private Integer publisherId;
    private String publisherName;
    private String publisherAddress;
    private String publisherCountry;
    private String publisherState;
    private Date publishDate;
    private String publisherEmail;
    private String publisherPhone;



}