package com.Sample.LibraryManagementSystem.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "billing_id")
    private Integer billingId;
    private Double bookingCost;
    private String billingAddress;
    private String cardNumber;
    private String zipCode;
    private String state;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}