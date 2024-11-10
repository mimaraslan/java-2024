package com.mimaraslan._03_ic_ice;

import java.util.Date;

public class AppMain {

    static int sayi1 = 10;
    static int sayi2 = 0;

    static int toplam = 0;
    static int bolme = 0;

    public static void main(String[] args) {

        try {

            // içteki try catch
            hesapYap();

             toplam = sayi1 + sayi2;
             System.out.println("DIŞ Toplama: " + toplam);

             bolme = sayi1 / sayi2;
             System.out.println("DIŞ Bolme: " + bolme);


        } catch (Exception e) {
            System.out.println("DIŞ Hata: " + e);
        }finally {
            System.out.println("DIŞ Teşekkür ederiz. : " + new Date());
        }

    }

    private static void hesapYap() {

        try {

            toplam = sayi1 + sayi2;
            System.out.println("İÇ Toplama: " + toplam);

            bolme = sayi1 / sayi2;
            System.out.println("İÇ Bolme: " + bolme);

        } catch (Exception e) {
            System.out.println("İÇ Hata: " + e);
        }finally {
            System.out.println("İÇ Teşekkür ederiz. : " + new Date());
        }
    }
}

