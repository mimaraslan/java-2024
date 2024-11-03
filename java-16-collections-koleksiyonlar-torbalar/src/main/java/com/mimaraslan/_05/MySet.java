package com.mimaraslan._05;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        System.out.println("--- HashSet rastgele -------------");


        Set<String> studentList1 = new HashSet<String>(10);
        HashSet<String> studentList2 = new HashSet<String>(10);
        studentList2.add("Serdar");
        studentList2.add("Betül");
        studentList2.add("Fatih");
        studentList2.add(null); // olur
        studentList2.add("Ali");
        studentList2.add("Serdar");
        studentList2.add("Haluk");

        System.out.println(studentList2);

        System.out.println("\n\n----TreeSet sıralı  ve null olmaz!!!--------------");


        Set<String> studentList3 = new TreeSet<>();
        TreeSet<String> studentList4 = new TreeSet<>();

        studentList4.add("Serdar");
        studentList4.add("Betül");
        studentList4.add("Fatih");
      //  studentList4.add(null); // OLMAZ!!!
        studentList4.add("Ali");
        studentList4.add("Serdar");
        studentList4.add("Haluk");

        System.out.println(studentList4);

        System.out.println("\n\n---LinkedHashSet bizim girdigimiz sırada---------------");




        Set<String> studentList5 = new LinkedHashSet<>();
        LinkedHashSet<String> studentList6 = new LinkedHashSet<>();
        studentList6.add("Serdar");
        studentList6.add("Betül");
        studentList6.add("Fatih");
        studentList6.add(null);
        studentList6.add("Ali");
        studentList6.add("Serdar");
        studentList6.add("Haluk");

        System.out.println(studentList6);

        System.out.println("------------------");


    }
}
