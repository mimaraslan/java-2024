package com.mimaraslan._02;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        try {
           /// int sonuc = urunlerinKilosunuAlUnchecked(250, 85);

            int sonuc = urunlerinKilosunuAlChecked(250, 85);


            System.out.println("Ürünlerin sayısı: "+ sonuc);

        } catch (Exception e) {
            System.out.println("Hata: " + e);
        }finally {
            System.out.println("Teşekkür ederiz. : " + new Date());
        }

    }

    // Unchecked
    private static int urunlerinKilosunuAlUnchecked(int siloNo, int uretilenUrunlerinKilosu) {

        if(siloNo < 1 || siloNo > 50){
            throw new ArithmeticException("Silo sayısnı lütfen doğru giriniz!");
        } else {
            return uretilenUrunlerinKilosu;
        }
    }


   // Checked
   private static int urunlerinKilosunuAlChecked(int siloNo, int uretilenUrunlerinKilosu) throws ArithmeticException {

       if(siloNo < 1 || siloNo > 50){
           throw new ArithmeticException("Silo sayısnı lütfen doğru giriniz!");
       } else {
           return uretilenUrunlerinKilosu;
       }
   }



}
