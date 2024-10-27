package com.mimaraslan;

public class _02_ForEach_Dongusu {

    public static void main(String[] args) {

        String student1 = "A h m e t         K o r a y";
        String student2 = "Sefa Küçükaslan";
        String student3 = "Mücahit Özcan";
        String student4 = "Süleyman Kesik";
        String student5 = "Cemre Gök";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        System.out.println("------Arrays Diziler-----------");

                              // 0       1        2          3          4        5          6
        String students [] = { "Ahmet", "Sefa", "Mücahit", "Süleyman", "Cemre", "Tuana", "Volkan" };

        System.out.println(students);


        students[0] =  "Koray";

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);



       // ArrayIndexOutOfBoundsException
      //  System.out.println(students[-5]); // index eksi olamaz!
      //  System.out.println(students[5]); // index sınırı aşamazsın.


        //  length()  vs length
        System.out.println(student1.length()); // 11 karakter
        System.out.println(students.length); // dizinin sınırı 5


        System.out.println("----- FOR ----------");

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }

        System.out.println("----");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("----- FOR EACH -----String -----");

        for (String student : students) {
            System.out.println(student);
        }


        System.out.println("----- FOR EACH -----int -----");

        int [] arrYears = { 2024, 2017, 2022, 2018, 2015, 2019, 2016};

        for (int year : arrYears) {
            System.out.println(year);
        }


    }


}