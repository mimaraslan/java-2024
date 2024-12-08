package com.mimaraslan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "PROPERTIES")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PROPERTY_NAME")
    private String propertyName;
    private String title;
    private String description;
    private String type;
    private String location;
    private BigDecimal price;

   /*
    private short bedroom;
    private short bathroom;
    private float area;
    */


    //     M       -      1
    //   Property  -    Agent
    //   Many      to    One
    @ManyToOne
    @JoinColumn(name = "agent_id")
    Agent agent;



    //    M      -     M
    //   Property - Buyer
    //   Many    to    Many
    @ManyToMany
    @JoinTable (name = "PROPERTIES_BUYERS",
     joinColumns = @JoinColumn(name = "property_id"),
            inverseJoinColumns = @JoinColumn(name = "buyer_id")
    )
    private Set<Buyer> buyers = new HashSet<>();

/*
    //     M       -      1
    //   Property  -    Seller
    //   Many      to    One
    @ManyToOne
    @JoinColumn(name = "seller_id")
    Seller seller;
*/


    //    1       -     1
    //  Property  -  Seller
    //   One    to    One
    @OneToOne
    @JoinColumn
    private Seller seller;

}
