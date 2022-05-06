package com.Sample.LibraryManagementSystem.Entity;




import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Integer customerId;

    private String customerName;

    private String customerAddress;
    private String customerCountry;
    private String customerState;
    private String customerEmail;
    private String customerPhone;


}