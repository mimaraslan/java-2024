package com.mimaraslan.entity;

public class Owner extends Person {

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
