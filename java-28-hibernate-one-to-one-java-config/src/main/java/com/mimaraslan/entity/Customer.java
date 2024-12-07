package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;

// Entity - Sınıfının veritabanında bir tablo karşılığı vardır.
// Model - Sınıfının tablosu yoktur. Katmanlar arası veri taşımaktır.

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @OneToOne (mappedBy = "customer",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    CustomerDetail customerDetail;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "FIRST_NAME", length = 100, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 120)
    private String lastName;



    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
