package com.mimaraslan;

import com.mimaraslan.tasit.Taksi;
import com.mimaraslan.tasit.Ucak;

public class AppMain {

    public static void main(String[] args) {


        Ucak ucak = new Ucak();

        ucak.setMarka("Airbus");
        ucak.setKoltukSayi((short) 150);
        ucak.setTekerSayisi((byte) 16);
        ucak.setMotorHacmi(80000);
        ucak.setYakitTipi("Kerosen");

        // IKanun
        ucak.hizSiniri(3000);
        ucak.bakimDurumu("Kasım 2024");
        ucak.tasitVergisi(20000.25f);
        ucak.emisyonDegeri((byte) 15);

        // IInternationalAirTransportAssociation
        ucak.kurumUyeDurumu(true);
        ucak.aidat(1000);
       boolean ucusDurumu = ucak.vizeIzinDurumu(true);
        ucak.yolcuKapasitesi((short) 150);


        System.out.println(ucak.getMarka());
        System.out.println(ucak);

        if (ucusDurumu) {
            System.out.println("Her şey onaylanmıştır. Uçabilir.");
        } else {
            System.out.println("Uçuş için vize alınmamıştır. Uçamaz!");
        }


        System.out.println("---------------------------");

        Taksi taksi = new Taksi();
        taksi.setMarka("Tesla");
        taksi.setKoltukSayi((short) 4);
        taksi.setTekerSayisi((byte) 4);
        taksi.setMotorHacmi(10_000);
        taksi.setYakitTipi("Hibrid");

       byte emisyonDegeri =  taksi.emisyonDegeri((byte) 3);
       float acilisUcreti =  taksi.acilisUcreti(100.25f);

        System.out.println(taksi);
        System.out.println("ruhsatDurumu: "+ (taksi.ruhsatDurumu(true) ? "Var" : "Yok"));
        System.out.println("ehliyetDurumu: "+ (taksi.ehliyetDurumu(false) ? "Var" : "Yok"));
        System.out.println("emisyonDegeri: "+ emisyonDegeri);
        System.out.println("acilisUcreti: "+ acilisUcreti);

    }


}
