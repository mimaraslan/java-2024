package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Murat");
        mudur.setSoyadi("Özyürek");
        mudur.setMaasi(8_000f);
        mudur.setMakamAraci(true);
        mudur.setTelefonNo("322432432");
        mudur.setSicilNo(123);
        mudur.setDepartmani("Arge");

        mudur.bilgisiniYaz(mudur);

        System.out.println("----------");


        Muhasebe muhasebe = new Muhasebe();
        muhasebe.setAdi("Emre");
        muhasebe.setSoyadi("Cananoğlu");
        muhasebe.setMaasi(4_000f);
        muhasebe.setYeminDurumu(true);
        muhasebe.setTelefonNo("2323");
        muhasebe.setSicilNo(999);
        muhasebe.setDepartmani("Finans");

        muhasebe.bilgisiniYaz(muhasebe);

        System.out.println("----------");


        Yazilimci yazilimci = new Yazilimci();
        yazilimci.setAdi("Serdar");
        yazilimci.setSoyadi("Çakır");
        yazilimci.setMaasi(9_000f);
        yazilimci.setUzmanlikAlani("Java");
        yazilimci.setTelefonNo("8888");
        yazilimci.setSicilNo(5555);
        yazilimci.setDepartmani("Arge");

        yazilimci.bilgisiniYaz(yazilimci);





    }
}
