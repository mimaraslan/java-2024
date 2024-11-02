package com.mimaraslan;

public class Arac {

    short yili= 2025;
    String marka = new String("BMW");

    public Arac() {
        System.out.println("Arac Constructor");
    }
 /*

 Motor
 Ayna
 Depo
 Direksiyon
 Koltuk
 Teker

 * */




    public static void main(String[] args) {
        Motor motor = new Motor();
        Ayna ayna = new Ayna();
        Depo depo = new Depo();
        Direksiyon direksiyon = new Direksiyon();
        Teker teker = new Teker();
        Koltuk koltuk = new Koltuk();

        motor.motorGucu = 6000;
        ayna.turu = "Yan";
        depo.depoKapsitesi = 55_000;
        depo.yakitTuru=  "Electric";
        direksiyon.capi = 30;
        teker.tekerSayisi = 4;
        koltuk.koltukSayisi = 4;

        Arac arac = new Arac();

    }


}
