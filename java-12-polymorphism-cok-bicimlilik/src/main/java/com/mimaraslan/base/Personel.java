package com.mimaraslan.base;

import com.mimaraslan.departman.Muhasebe;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Personel {
   private String adi;
   private String soyadi;
   private String telefonNo;
   private String departmani;
   private int sicilNo;
   private String tahsilDurumu;
   private String adres;
   private float maasi;
   private boolean medeniDurumu;

   public void bilgisiniYaz(Personel personel){
      System.out.println(personel.getAdi() + " " + personel.getSoyadi());
      System.out.println(personel.getTelefonNo());
      System.out.println(personel.getDepartmani());
      System.out.println(personel.getSicilNo());
      System.out.println("Medeni Durumu: " +  (personel.isMedeniDurumu() ? "Evli": "Bekar") );
   }


   public void hesapla(){ // paramete sayisi 0
   }

   public void hesapla(int yil){ // paramete sayisi 1       int
   }


   public void hesapla(int yil, int ay){ // paramete sayisi 2   int int
   }

   public void hesapla(float ay, int yil){ // paramete sayisi 2   float  int
   }



   public void hesapla(int yil, int ay, int gun){ // paramete sayisi 3   int int int
   }



   public void hesapla(int yil, short ay){ // paramete sayisi 2   int  short
   }


   public void hesapla(int yil, short ay, int gun){ // paramete sayisi 3   int short int
   }

   public void hesapla(int yil, short ay, short gun){ // paramete sayisi 3   int short short
   }

   public void hesapla(short yil, short ay, int gun){ // paramete sayisi 3   short short int
   }


}
