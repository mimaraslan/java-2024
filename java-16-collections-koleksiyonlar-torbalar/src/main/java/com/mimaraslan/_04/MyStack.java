package com.mimaraslan._04;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {

        Stack <String> stackList = new Stack<>();


        stackList.add("Volkan");
        stackList.push("Serdar");
        stackList.push("Betül");
        stackList.push("Fatih");
        stackList.push(null);
        stackList.push("Ali");
        stackList.push("Serdar");
        stackList.push("Haluk");

        System.out.println(stackList);

        System.out.println(stackList.peek());

        System.out.println(stackList.search("Betül"));

        System.out.println(stackList.empty());

        System.out.println(stackList.isEmpty());




    }
}
