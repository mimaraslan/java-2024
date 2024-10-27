package com.mimaraslan;

public class _01_For_Dongusu { // SINIFA AIT SCOPE kapsami

    public static void main(String[] args) { // main metodunun scope kapsami



        // Dongu   //Baslangic    // sart       // attirim ya da azaltim miktari
            for   ( int i = 0;      i < 5;        i++    ) {  //dongu scope kapsam

                System.out.println(i + " ----------------------");

            }


        System.out.println(" i++ ========================================");

                  // baslangic  //sart  //artis
            for ( int i = 3;  i <= 7;  i++ ) {

                System.out.println(i);

            }


        System.out.println(" i=i+2 ========================================");

        // baslangic  //sart  //artis
        for ( int i = 3;  i <= 7;  i=i+2 ) {

            System.out.println(i);

        }


        System.out.println(" i+=2 ========================================");

        // baslangic  //sart  //artis
        for ( int i = 3;  i <= 7;  i+=2 ) {

            System.out.println(i);

        }



        System.out.println(" i-- ========================================");

           // baslangic    //sart   //azaltim
        for ( int i = 10;  i >= 6;   i-- ) {

            System.out.println(i);

        }

        System.out.println("========================================");

        for (int i = 1; i <= 5; i++) {

            System.out.println("--------");
            System.out.println("i: " + i);
            System.out.println("---");

            System.out.println("Fiyat: "+ i );


            for (int j = 1; j <= i; j++) {

                System.out.println("j: " + j);
            }

        }


        System.out.println("==== SONSUZ DONGU ======================");

        // Normal
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("-----------");

        // Sonsuz döngü
     /*
        for (   ;    ;   ) {

        }
        */



        // Sonsuz döngü
 /*       for (int i = 0;        ; i++) {

           // şart karar kontrol mekanizmaları
            System.out.println(i);
        }
*/

        // Bu koda asla gidilemez cunku ustte sonsuz dongu var.
       // int a = 100;


    }

}