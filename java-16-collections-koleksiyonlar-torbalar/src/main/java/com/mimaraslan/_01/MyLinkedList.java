package com.mimaraslan._01;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> myList1 = new LinkedList();
        myList1.add(10);
        myList1.add(2);
        myList1.add(13);
        myList1.add(4);
        myList1.add(null);
        System.out.println(myList1);

        System.out.println("----------------");


        LinkedList<String> myList2 = new LinkedList();
        myList2.add("Serdar");
        myList2.add("Betül");
        myList2.add("Fatih");
        myList2.add(null);
        myList2.add("Ali");
        myList2.add("Serdar");
        myList2.add("Haluk");
        System.out.println(myList2);

        myList2.add(1, "Mehmet");
        myList2.set(0, "Volkan");

        System.out.println(myList2);

        myList2.addFirst("Selam");
        myList2.addLast("Tuana");
        System.out.println(myList2);

        System.out.println("---------------");

        for (int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.get(i));
        }
        System.out.println("---------------");

          // TEKIL   COGUL
        for (String item  : myList2){
           // System.out.println( item);
            System.out.print( item + " - ");
        }

        System.out.println("---------------");
        System.out.println(myList2.get(0));
        System.out.println(myList2.getFirst());

        System.out.println("---------------");
        System.out.println(myList2.get( myList2.size()-1  ));
        System.out.println(myList2.getLast());

    }
}














