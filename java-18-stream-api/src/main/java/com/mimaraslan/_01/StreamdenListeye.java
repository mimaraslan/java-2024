package com.mimaraslan._01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamdenListeye {

    public static void main(String[] args) {

        System.out.println("----collect------------------------------");
        Stream <String> myStream1 = Stream.of("Burhan", "Erhan", "Cuneyt", "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");

        TreeSet <String> myTreeSet1 = myStream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myTreeSet1);

        System.out.println("----collect Collectors.toCollection --------------------------------");
        Stream <String> myStream2 = Stream.of("Burhan", "Erhan", "Cuneyt", "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");

        TreeSet <String> myTreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);

        System.out.println("---Streamler tek kullanımlıktır!!!-------------------------------");
        Stream <String> myStream3 = Stream.of("Burhan", "Erhan", "Cuneyt", "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");

       // myStream3.forEach(System.out::println); // Tüketti.

        TreeSet <String> myTreeSet3 = myStream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet3);

        System.out.println("---Streamler akarken uzerinde birden fazla islem yapabiliriz!!!-------------------------------");
        Stream <String> myStream4 = Stream.of("Burhan", "Erhan", "Cuneyt","Cemre", "Cemre",  "Haluk", "Emrehan", "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");

        myStream4
                .distinct()  // benzersiz tekil olsun
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------------------------------");
        Stream <String> myStream5 = Stream.of("Burhan", "Erhan", "Cuneyt","Cemre", "Cemre",  "Haluk", "Emrehan",
                                                     "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");
        myStream5
              //  .sorted()
              //  .distinct()
                .filter(isim -> isim.contains("e"))
                .forEach(System.out::println);

        System.out.println("----------------------------------");
        Stream <String> myStream6 = Stream.of("Burhan", "Erhan", "Cuneyt","Cemre", "Cemre",  "Haluk", "Emrehan",
                "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");
        myStream6
                  .sorted()
                //  .distinct()
                .filter(isim -> isim.contains("e") && isim.contains("E")   )
                .forEach(System.out::println);


        System.out.println("----------------------------------");
        Stream <String> myStream7 = Stream.of("Burhan", "Erhan", "Cuneyt","Cemre", "Cemre",  "Haluk", "Emrehan",
                "Emre", "Mahmut", "Mahmut", "Cemre", "Betul", "Nezih", "Kevser");
     /*   myStream7
                .sorted()
                //  .distinct()
                .filter(isim -> isim.contains("e") || isim.startsWith("H")   )
                .forEach(System.out::println);
        */

        HashSet<String> myHashSet = myStream7.collect(Collectors.toCollection(HashSet::new));

     //   System.out.println(myHashSet);

        for (String student: myHashSet) {
            System.out.println(student);
        }

        System.out.println("----MAP------------------------------");

        HashMap <String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Burhan", 100);
        myHashMap.put("Erhan", 50);
        myHashMap.put("Cuneyt", 180);

        Map.Entry<String, Integer> maxEntry =
                myHashMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(maxEntry.getKey());
        System.out.println(maxEntry.getValue());



        System.out.println("----MAP 2------------------------------");


        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Ahmet", 25);
        myMap.put("Mehmet", 30);
        myMap.put("Ali", 20);
        myMap.put("Garip", 35);
        myMap.put("Tuana", 22);
        myMap.put("Fatma", 28);
        myMap.put("Emre", 32);
        myMap.put("Hakan", 38);
        myMap.put("Metin", 24);
        myMap.put("Cemre", 29);

        System.out.println("Yaşı 25'ten büyük olanlar:");
        myMap.entrySet().stream()
                        .filter(entry -> entry.getValue() > 25)
                        .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nTüm isimler:");
        myMap.keySet().stream()
                        .forEach(System.out::println);

        System.out.println("\nTüm yaşlar:");
        myMap.values().stream()
                        .forEach(System.out::println);

        System.out.println("\nTüm girişler:");
        myMap.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);



    }
}
