package com.mimaraslan._01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {

    public static void main(String[] args) {

        System.out.println("--bosKayit--------------------------");
        Stream <String> bosKayit = Stream.empty();
        System.out.println(bosKayit.count());

        System.out.println("--tekBirKayit--------------------------");
        Stream <String> tekBirKayit = Stream.of("Erhan");
        System.out.println(tekBirKayit.count());

        System.out.println("--cokluKayit--------------------------");
        Stream <String> cokluKayit = Stream.of("Erhan", "Mahmut", "Emrehan");
        System.out.println(cokluKayit.count());

        System.out.println("----------------------------");

        List      <String> myStudentList1 = new LinkedList<>();
        ArrayList <String> myStudentList2 = new ArrayList<>();
        myStudentList1.add("Burhan");
        myStudentList1.add("Cuneyt");
        myStudentList1.add("Haluk");
        System.out.println(myStudentList1);
        System.out.println("----------------------------");

        List  <String>  myStudentList3 = List.of("Burhan", "Cuneyt", "Haluk");
        System.out.println(myStudentList3);

        for (String item : myStudentList3){
            System.out.println(item);
        }

        System.out.println(myStudentList3);

        System.out.println("----LIST------------------------");

        List  <String>  myStudentList4 = new ArrayList<>( List.of("Burhan", "Erhan", "Cuneyt", "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut") );
        myStudentList4.add("Cemre");
        myStudentList4.add("Betul");
        myStudentList4.remove("Mahmut");
        myStudentList4.remove(0);
        myStudentList4.add(1, "Nezih");

        System.out.println("----Stream------------------------");

        // Streamler tek kullanımlıktır!
        Stream <String> myStudentsStream  = myStudentList4.stream();
        //  System.out.println(myStudentsStream.count());   // 8 olur.
        //  System.out.println(myStudentsStream.count());   // Burada 8 olmaz! Çünkü Streamler tek kullanımlıktır! Stream akar, gider, biter.

       // myStudentsStream.forEach(System.out::println);
        myStudentsStream.forEach(ogrenci -> System.out.println(ogrenci));


        System.out.println("----ARRAY------------------");

        var myStudentsArr = new String [] {"Burhan", "Erhan", "Cuneyt", "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut"};

        for (String student : myStudentsArr){
            System.out.println(student);
        }


    }
}
