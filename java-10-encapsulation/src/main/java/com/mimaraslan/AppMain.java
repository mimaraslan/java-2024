package com.mimaraslan;

public class AppMain {

    public static void main(String[] args) {

        HesapCuzdani hesapCuzdani1 = new HesapCuzdani();
        hesapCuzdani1.setAdi("Ahmet");
        hesapCuzdani1.setSoyadi("Gülbaz");
        hesapCuzdani1.setSubeAdi("Merkez");
        hesapCuzdani1.setSubeNo(1000);
        hesapCuzdani1.setHesapNo(123456789L);
        hesapCuzdani1.setIbanNo("1111-2222-3333-4444");
        hesapCuzdani1.setHesapParaCinsi("TL");
        hesapCuzdani1.setHesapTutari(1_000_000.15f);
        System.out.println(hesapCuzdani1);

        System.out.println("-------------------------");

        HesapCuzdani hesapCuzdani2 = new HesapCuzdani("Mücahit","Özcan");
        hesapCuzdani2.setSubeNo(2000);
        hesapCuzdani2.setHesapNo(3333456789L);
        hesapCuzdani2.setIbanNo("5555-2222-3333-4444");
        hesapCuzdani2.setHesapParaCinsi("USD");
        hesapCuzdani2.setHesapTutari(10_000.25f);
        System.out.println(hesapCuzdani2);

        System.out.println("-------------------------");

        HesapCuzdani hesapCuzdani3 = new HesapCuzdani("Selam", "İğde", "Merkez",
                3000, 333333L,
                "4444-2131-3222-3234", "GBP", 1234.67F  );
        System.out.println(hesapCuzdani3);

        System.out.println("-------------------------");

        System.out.println(hesapCuzdani1.getAdi() + " " + hesapCuzdani1.getSoyadi() + " ---> Şube:  " + hesapCuzdani1.getSubeAdi());

        hesapCuzdani3.getBilgiVer();
    }


}
