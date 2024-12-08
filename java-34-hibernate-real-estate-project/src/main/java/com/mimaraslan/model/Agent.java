package com.mimaraslan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "AGENTS")
public class Agent {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;
    private String email;
    private String phone;
    private float rating;
    private String username;
    private String password;
    private String officeAddress;

  //    1     -     M
  //  Agent   -  Property
  //   One    to    Many

//   private List<Property> properties = new ArrayList<>();

    @OneToMany (mappedBy = "agent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Property> properties = new HashSet<>();

}
