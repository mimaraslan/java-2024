package com.mimaraslan._03;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Kalıp - Model
                     // Number ,                String,         Boolean
public class Personel <GelenTip1 extends Number, GelenTip2 > {

    private GelenTip2 adi;
    private GelenTip2 soyadi;
    private boolean medeniDurum;
    private GelenTip1 sira;



    public void cizgiCek(){
        System.out.println("==================");
    }

    public void ekranaYaz(){
       System.out.println("EKRANA YAZ");
    }

/*
    public void ekranaYaz(Integer sira, String adi){
        System.out.println("Sira: " + sira  + " --  " + sira.getClass());
        System.out.println("Adi: " + adi +  "  --  " + adi.getClass());
    }

    public void ekranaYaz(Double sira, String adi){
        System.out.println("Sira: " + sira  + " --  " + sira.getClass());
        System.out.println("Adi: " + adi +  "  --  " + adi.getClass());
    }

    public void ekranaYaz(Float sira, String adi){
        System.out.println("Sira: " + sira  + " --  " + sira.getClass());
        System.out.println("Adi: " + adi +  "  --  " + adi.getClass());
    }

    public void ekranaYaz(Long sira, String adi){
        System.out.println("Sira: " + sira  + " --  " + sira.getClass());
        System.out.println("Adi: " + adi +  "  --  " + adi.getClass());
    }
*/
                        // Number
    public void ekranaYaz(Number sira, GelenTip2 adi){
        System.out.println("Sira: " + sira  + " --  " + sira.getClass());
        System.out.println("Adi: " + adi +  "  --  " + adi.getClass());
    }


}
