package com.mimaraslan._01;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        try { // scope
            // kodda hatanın meydana gelebileceği yerler
        } catch (Exception e) { // scope
            // hata meydana gelirse bu kapsam çalışır
        } finally {
            // her iki durumda da bu kodlar çalıştırılır.
        }


        System.out.println("---try 1--------------------------------");

        try {
         // code 1
            int sonuc = 2/0;
            System.out.println(sonuc);

            System.out.println("---------------");

        } catch (Exception e) {
            // code 2
            System.out.println("Hata : " + e);
        }


        System.out.println("---try 2--------------------------------");

        try {
            // code 1  // hata meydana gelebilecek kodlar
            int sonuc = 2/0;
            System.out.println(sonuc);

            System.out.println("Çalıştı.");

        } catch (Exception e) {
            // code 2  // hata meydana gelirse
            System.out.println("Çalışmadı.");
            System.out.println("Hata : " + e);
        } finally {
            //code 3 // her durumda calisir.
            System.out.println("Teşekkür ederiz. : " +  new Date());
        }


        System.out.println("---try 3--------------------------------");

        try {
            // code 1  // hata meydana gelebilecek kodlar
          //  int sonuc = 2/0;
          //  System.out.println(sonuc);



        //    throw new Exception("HATA MEYDANA GELDİ.");
            throw new ArithmeticException("ArithmeticException HATASI MEYDANA GELDİ.");


            //    System.out.println("Çalıştı.");

        } catch (Exception e) {
            // code 2  // hata meydana gelirse
            System.out.println("Çalışmadı.");
            System.out.println("Hata : " + e);
        } finally {
            //code 3 // her durumda calisir.
            System.out.println("Teşekkür ederiz. : " +  new Date());
        }

        System.out.println("---try 4------------------------------");

        try {
          bolme(10, 0);
        } catch (Exception e) {
            System.out.println("Hata : " + e);
        } finally {
            System.out.println("Teşekkür ederiz. : " +  new Date());
        }


    }



    private static void bolme(double sayi1, double sayi2) {
          int sonuc =  (int) sayi1/ (int)sayi2;
          System.out.println(sonuc);
        //  throw new ArithmeticException("ArithmeticException HATASI MEYDANA GELDİ.");
    }


}
