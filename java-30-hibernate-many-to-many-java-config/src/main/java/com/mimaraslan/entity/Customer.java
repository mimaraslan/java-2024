package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

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


    // M -M
    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)

            @JoinTable(
                    name = "CUSTOMERS_ADDRESSES",

                    joinColumns = {
                        @JoinColumn (name = "CUSTOMER_ID", nullable = false)
                    },
                    inverseJoinColumns = {
                       @JoinColumn (name = "ADDRESS_ID", nullable = false)
                    }
            )

    Set<Address> addresses = new HashSet<>();


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
