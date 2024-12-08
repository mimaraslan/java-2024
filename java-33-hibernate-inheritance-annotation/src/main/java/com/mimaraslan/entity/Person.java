package com.mimaraslan.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "PERSONS")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {

  @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PERSON_ID")
  private Long personId;

  @Column(name = "FIRST_NAME")
  private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Column(name = "ADDRESS")
    private String address;


    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public Person(String firstname, String lastname, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
