package com.mimaraslan.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data // ====> @Setter  +  @Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name = "teachers")
public class Teacher {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private String id;

   @Column(name = "FIRST_NAME",  length = 100)
   private String firstName;

   @Column(name = "LAST_NAME",  length = 150)
   private String lastName;

   @Email
   @Column (name = "EMAIL", unique = true)
   private String email;

   @Column (name =  "PHONE" )
   private String phone;


/*
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String email, String phone) {
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
