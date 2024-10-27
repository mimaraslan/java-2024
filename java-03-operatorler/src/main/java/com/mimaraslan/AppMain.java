package com.mimaraslan;

// tek satirlik aciklama

/*
birden  fazla
satirda aciklama
*/


public class AppMain {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = a + b;


        System.out.println("Toplam: " + c); // Toplam: 12

        System.out.println("Toplam: " + a); // Toplam: 10

        System.out.println("Toplam: " + a + b); // Toplam: 102

        System.out.println("Toplam: " + (a + b)); // Toplam: 12


        int sonuc = a/b;
        System.out.println("Sonuc: " + sonuc); // 5


        float d = 2.123456f;
        double e = 13.0123456;
        double f = e/d;
        System.out.println("Sonuc: " + f);


        float g = 2.123456f;
        float h = 13.0123456f;
        float k = h/g;
        System.out.println("Sonuc: " + k);

        System.out.println("Sonuc: " + (h * g) );


        int sayi1 = 20;
        int sayi2 = 3000;

     //   sayi2 sayi1 den büyük mü?

      System.out.println("Sayı1,  Sayı2'den küçük mü? : " + (sayi1  <  sayi2));

        System.out.println(sayi1  <  sayi2); // true   1   yes
        System.out.println(sayi1  >  sayi2); // false  0   no

        //Ternary operator
        System.out.println(   (sayi1  >  sayi2)   ?    "EVET"     :  "HAYIR"        ); // false

                                 // true               // true olursa        // false olursa
        System.out.println(   (sayi1  <  sayi2)   ?    "EVET doğru."     :  "HAYIR doğru değil."        ); // true


                                // true değil            // true                // false
        System.out.println(   !(sayi1  <  sayi2)   ?    "EVET doğru."     :  "HAYIR doğru değil."        ); // true


        int i = 0;
      //  int j = 0;
      //  j = i + 2;
      //  System.out.println(j);


        i = i + 1;
      /*
        0 = 0 + 1
        0 = 1
        1 = 1
       */
        System.out.println("i+1: " + i);

      int j = 0;
      //j = j + 1;
      j++;
      System.out.println("j++: " + j);



      int p = 0;
      ++p;
      System.out.println("++p: " + p);


      int m = 0;
//    System.out.println("m++: " + m++); //
      System.out.println(m++); // 0
        System.out.println(m); //  1

      int y = 0;
//    System.out.println("++y: " + ++y); // 1
      System.out.println(++y); // 1
        System.out.println(y); // 1




        int x = 0;
//    System.out.println("x--: " + x--); // 0
        System.out.println(x--); // 0
        System.out.println(x); //  -1

        int z = 0;
//    System.out.println("--z: " + --z); // -1
        System.out.println(--z); // -1
        System.out.println(z); // -1


        System.out.println("Mod alma: " +  (10 % 4)  +  " operatörü" );  // 2




    }


}