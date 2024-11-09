package com.mimaraslan._02;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int  id;
    private String productName;
    private String productDescription;
    private float  price;

    public Product(int id, String productName, float price, String productDescription) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    /*
    public Product() {
    }

    public Product(int id, String productName, float price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
    */
}
