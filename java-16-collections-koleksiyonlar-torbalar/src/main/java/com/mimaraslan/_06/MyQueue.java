package com.mimaraslan._06;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MyQueue {

    public static void main(String[] args) {

        Queue<String> studentList1 = new ArrayBlockingQueue<>(25);
        studentList1.add("Serdar");
        studentList1.add("Betül");
        studentList1.add("Fatih");
       // studentList1.add(null); // Olmaz!!
        studentList1.add("Ali");
        studentList1.add("Serdar");
        studentList1.add("Haluk");
        System.out.println(studentList1);

        System.out.println("----------------------");

        Queue<String> studentList2 = new PriorityQueue<>();
        studentList2.add("Serdar");
        studentList2.add("Betül");
        studentList2.add("Fatih");
        // studentList1.add(null); // Olmaz!!
        studentList2.add("Ali");
        studentList2.add("Serdar");
        studentList2.add("Haluk");
        System.out.println(studentList2);


    }
}
