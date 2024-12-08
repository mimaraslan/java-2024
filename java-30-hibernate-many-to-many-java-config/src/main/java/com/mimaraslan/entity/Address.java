package com.mimaraslan.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ADDRESSES")
public class Address {

    // M -M
    @ManyToMany (mappedBy = "addresses")
    Set<Customer> customer = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private  int addressId;

    @Column(name = "COUNTRY", length = 100, nullable = false)
    private String country;

    @Column(name = "CITY", length = 50)
    private String city;

    @Column(name = "STATE", length = 75)
    private String state;

    @Column(name = "STREET", length = 200)
    private String street;

    @Column(name = "ZIP_CODE", length = 20)
    private String zip;

}
