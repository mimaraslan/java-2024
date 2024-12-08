package com.mimaraslan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "SELLERS")
public class Seller {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;
    private String email;
    private String phone;
    private String username;
    private String password;

/*
    //    1     -     M
    //  Seller   -  Property
    //   One    to    Many
    @OneToMany (mappedBy = "seller",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Property> properties = new HashSet<>();

*/


    //    1      -     1
    //  Seller   -  Property
    //   One    to    One
    @OneToOne (mappedBy = "seller",
              cascade = CascadeType.ALL)
    private Property property;



}
