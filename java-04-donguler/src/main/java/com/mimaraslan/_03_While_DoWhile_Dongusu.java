package com.mimaraslan;

public class _03_While_DoWhile_Dongusu {

    public static void main(String[] args) {

        System.out.println("======= FOR DONGUSU =========");
            // BASLANGIC    SART    ARTIS_MIKTARI
        for (int i = 0;     i < 5;      i++) {
            System.out.println(i);
        }


        System.out.println("======= WHILE DONGUSU =========");

        int i = 0;   // BASLANGIC

        while ( i < 5 ) {   // SART
            System.out.println(i);

                 i++ ; // ARTIS_MIKTARI
        }

        System.out.println("======= DO WHILE DONGUSU =========");

        int j = 1000;   // BASLANGIC

        do {
            System.out.println(j);
            j++ ; // ARTIS_MIKTARI

        }  while ( j < 5 ); // SART



    }



}