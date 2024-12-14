package com.mimaraslan.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data // ====> @Setter  +  @Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "students")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;


   @Column(name = "firstname")
   private String firstName;

   // FIXME
   private String lastName;


   @Email
   private String email;

   private String phone;

/*
    public Student() {
    }

    public Student(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    */
}
