package com.mimaraslan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "OWNERS") // JOINED - TABLE_PER_CLASS
// @DiscriminatorValue("OWNERS")  // SINGLE_TABLE
public class Owner extends Person {

    // FIXME Id değerini otomatik sıralı vermeye bakılacak.
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OWNER_ID")
    */
    // @Transient // Bu alanı kolon yapma
    private Long ownerId;

    private String title;

    public Owner() {
        super();
    }


    public Owner(String firstname, String lastname, String address,
                 String title) {
        super(firstname, lastname, address);
        this.title = title;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
