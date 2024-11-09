package com.mimaraslan._02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {

        List <Product> productsList1 = new ArrayList<>();

        Product product1 = new Product(); // Normal Object

        productsList1.add(new Product(1, "Ekmek", 7.0f,"Beyaz")); // Anonim Object
        productsList1.add(new Product(2, "Süt", 2.1f, "Yağlı"));
        productsList1.add(new Product(3,"Su", 0.5f, "Mineralli"));
        productsList1.add(new Product(4,"Elma", 2.1f ,"Yeşil"));
        productsList1.add(new Product(5,"Çikolata",1.2f, "Sütlü"));
        productsList1.add(new Product(6,"Domates",3.3f, "Sera"));



        List <Product> productsList2 =  productsList1.stream()
                .filter(product -> product.getPrice() > 2 && product.getPrice() < 5)
                .limit(2)
                .collect(Collectors.toList());
             // .toList();

        System.out.println(productsList2);



        List<Product> productsList3 = productsList1.stream()
                .filter(product -> product.getPrice() > 2 && product.getPrice() < 5)
                .limit(10)
                .toList();

        Double total = productsList3.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println(total);




    }
}
