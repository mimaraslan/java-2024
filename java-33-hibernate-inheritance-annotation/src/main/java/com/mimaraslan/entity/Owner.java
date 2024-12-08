package com.mimaraslan.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "OWNERS")
@AttributeOverrides({
        @AttributeOverride(name = "firstname", column = @Column(name = "FIRST_NAME")),
        @AttributeOverride(name = "lastname", column = @Column(name = "LAST_NAME")),
        @AttributeOverride(name = "address", column = @Column(name = "ADDRESS"))
})
public class Owner extends Person {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OWNER_ID")
    */
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
