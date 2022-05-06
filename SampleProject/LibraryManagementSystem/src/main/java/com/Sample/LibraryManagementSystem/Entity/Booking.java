package com.Sample.LibraryManagementSystem.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
public class Booking {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private Integer bookingId;
    private Date bookingDate;
    private Date returnDate;
    private Boolean isReturned;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
