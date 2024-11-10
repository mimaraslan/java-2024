package com.mimaraslan;

import java.util.Optional;

public class AppMain {

    public static void main(String[] args) {


        System.out.println("---null-----------------------------");
        Student student1 = new Student();
        System.out.println(student1);
        System.out.println("id: " + student1.getId());
        System.out.println("firstName: " +student1.getFirstName());
        System.out.println("lastName: " +student1.getLastName());
        System.out.println("email: " +student1.getEmail());
        System.out.println("phone: " +student1.getPhone());
        System.out.println("registerStatus: " +student1.getRegisterStatus());

        System.out.println("--------------------------------");

        Student student2 = new Student("İsa");

        System.out.println("ilk durum: " + student2);

        System.out.println("id: " + student2.getId());
        System.out.println("firstName: " +student2.getFirstName());
        System.out.println("lastName: " +student2.getLastName());
        System.out.println("email: " +student2.getEmail());
        System.out.println("phone: " +student2.getPhone());
        System.out.println("registerStatus: " +student2.getRegisterStatus());


        System.out.println("Null atama öncesi: "+ student2);
        student2 = null;
        System.out.println("Son durum: "+ student2);

        // NullPointerException
 //       System.out.println("firstName: " +student2.getFirstName());
 /*
        if(student2.getFirstName() == null)
            System.out.println("Bunu yazamam!");
*/

        try {
            System.out.println("firstName: " +student2.getFirstName());
        }catch (Exception e) {
            System.out.println ("Hata: " + e);
        }


        System.out.println("-----------------------------");



        String [] myStudentArr = new String[10];
        myStudentArr[0] = "Ahmet";

        String myFirstName =  myStudentArr[0].toUpperCase();
        System.out.println("firstName: " + myFirstName);



        myStudentArr[9] = "Süleyman";
        myFirstName =  myStudentArr[9].toUpperCase();
        System.out.println("firstName: " + myFirstName);

        for (int i = 0; i < myStudentArr.length; i++) {
            System.out.println( myStudentArr[i]);
        }


        System.out.println("Dizinin ilk durumu: "+ myStudentArr);
        myStudentArr = null;
        System.out.println("Dizinin null atama sonrası durumu: "+myStudentArr);

       try {
           for (int i = 0; i < myStudentArr.length; i++) {
               System.out.println(myStudentArr[i]);
           }
       } catch (Exception e) {
           System.out.println ("Hata: " + e);
       }

       System.out.println("------Optional--null kontrolü içindir----");
        Optional <String[]> nullKontrol = Optional.ofNullable(myStudentArr);
        System.out.println("nullKontrol: "+ nullKontrol);


        if(nullKontrol.isPresent()) {
            System.out.println("Dizi var. Dolu.");
        }else {
            System.out.println("Dizi null'dır ama ben onu sana boş diyeceğim.");
        }


        // !HAYIR  ====> EVET
        if(!nullKontrol.isEmpty()) {
            System.out.println("Dizi var. Dolu.");
        }else {
            System.out.println("Dizi null'dır ama ben onu sana boş diyeceğim.");
        }


    }
}
