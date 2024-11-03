package com.mimaraslan._01;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
/*
        int myNumber1 = 10;
        int myNumber2 = 20;
        int myNumber3 = 30;

        int [] myNumbers = { 10, 20, 30 };  // 3 items, eleman
*/
/*
        Integer myNumber1 = 10;
        Integer myNumber2 = 20;
        Integer myNumber3 = 30;

        Integer [] myNumbers = { 10, 20, 30 };  // 3 items, eleman
*/

/*
      List <Integer> myList;  // nesne referansi

        // nesne oldu
        myList = new ArrayList<Integer>();
*/

        List <Integer> myList1 = new ArrayList<>();

        myList1.add(10);   // index 0
        myList1.add(5);    // index 1
        myList1.add(25);   // index 2
        myList1.add(13);   // index 3
        myList1.add(null); // index 4

        System.out.println(myList1);

        System.out.println("---------------------------------");


        ArrayList <String> myList2 = new ArrayList<>();
        myList2.add("Serdar");
        myList2.add("Betül");
        myList2.add("Fatih");
        myList2.add(null);
        myList2.add("Ali");
        myList2.add("Serdar");
        myList2.add("Haluk");

        System.out.println(myList2);

        System.out.println(myList2.get(4));
        System.out.println(myList2.getFirst());
        System.out.println(myList2.getLast());
        System.out.println(myList2.contains("Omer"));
        System.out.println(myList2.contains("Ali"));

        System.out.println("List1 ile List2 eşit midir? -->  "+ myList1.equals(myList2));

        System.out.println("List1 eleman sayısı: "+ myList1.size());
        System.out.println("List2 eleman sayısı: "+ myList2.size());

        myList2.add("Sefa");
        System.out.println("List2 eleman sayısı: "+ myList2.size());
        System.out.println(myList2);

        myList2.remove(3);
        System.out.println(myList2);
        System.out.println("List2 eleman sayısı: "+ myList2.size());
        System.out.println(myList2.hashCode());


        myList2.remove(5);
        System.out.println("List2 eleman sayısı: "+ myList2.size());
        System.out.println(myList2);
        System.out.println(myList2.hashCode());



        //    System.out.println("List1 eleman sayısı: "+ myList1.length());

/*
        String adi = "Korcan";
        System.out.println(adi.length());

        Integer [] myNumbers = { 10, 20, 30 };  // 3 items, eleman
        System.out.println(myNumbers.length);
*/

        System.out.println("List2 dolu mu? : "+ !myList2.isEmpty());

        myList2.add(1, "Süleyman");
        System.out.println(myList2);
        System.out.println(myList2.hashCode());

        myList2.remove(1);
        System.out.println(myList2);
        System.out.println(myList2.hashCode());

        myList2.clear();
        System.out.println(myList2);
        System.out.println(myList2.hashCode());


    }
}
