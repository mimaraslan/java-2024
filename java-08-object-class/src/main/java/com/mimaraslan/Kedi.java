package com.mimaraslan;

public class Kedi {

    // declaration - deklere - bildiri bildirmek
    int yas ;
    String cinsi;
    String rengi ;


    // Constructor - hazırlayıcı- yapıcı - ilk hazirligi yapar
    public Kedi() {

         yas = 0;
         cinsi = "Bilinmiyor";
         rengi = "Belirtilmedi";

        System.out.println("-------Constructor---------");
      /*  System.out.println(cinsi);
        System.out.println(yas);
        System.out.println(rengi);
        System.out.println("-------------------");
        */

    }

    public Kedi(int yas, String cinsi, String rengi) {
        this.yas = yas;
        this.cinsi = cinsi;
        this.rengi = rengi;
    }


    /*
    // normal babadan kalma metot
    public void Kedi() {
    }
    */


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }




    public static void main(String[] args) {


        Kedi    kediNesne   =  new Kedi();

        System.out.println(kediNesne.cinsi);
        System.out.println(kediNesne.yas);
        System.out.println(kediNesne.rengi);

        System.out.println("-----------------------");


        kediNesne.cinsi = "Van";
        kediNesne.yas = 2;
        kediNesne.rengi = "Beyaz";

        System.out.println(kediNesne.cinsi);
        System.out.println(kediNesne.yas);
        System.out.println(kediNesne.rengi);

        System.out.println("-----------------------");


        kediNesne.cinsi = "Ankara";
        kediNesne.yas = 4;
        kediNesne.rengi = "Beyaz";

        System.out.println(kediNesne.cinsi);
        System.out.println(kediNesne.yas);
        System.out.println(kediNesne.rengi);

        System.out.println("-----------------------");

        Kedi kedi1 = new Kedi(8, "Tekir", "Alacalı" );
        System.out.println("Tür: " + kedi1.cinsi + "  - Yaşı: "+ kedi1.yas + " - Rengi: " + kedi1.rengi);

        Kedi kedi2 = new Kedi(3, "", "Sarı" );
        System.out.println("Tür: " + kedi2.cinsi + "  - Yaşı: "+ kedi2.yas + " - Rengi: " + kedi2.rengi);

        Kedi kedi3 = new Kedi(10, "", "Siyah" );
        System.out.println("Tür: " + kedi3.cinsi + "  - Yaşı: "+ kedi3.yas + " - Rengi: " + kedi3.rengi);

        System.out.println("-----------------------");


        kedi1.setYas(3);

        System.out.println("Tür: " + kedi1.cinsi + "  - Yaşı: "+ kedi1.yas + " - Rengi: " + kedi1.rengi);
        System.out.println("Tür: " + kedi1.cinsi + "  - Yaşı: "+ kedi1.getYas() + " - Rengi: " + kedi1.rengi);


    }

}
