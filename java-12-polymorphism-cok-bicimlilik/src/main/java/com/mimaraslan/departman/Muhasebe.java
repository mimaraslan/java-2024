package com.mimaraslan.departman;


import com.mimaraslan.base.Personel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Muhasebe extends Personel {

        private Boolean yeminDurumu;
        private String unvani;


    public void bilgisiniYaz(Muhasebe muhasebe){
        System.out.println(muhasebe.getAdi() + " " + muhasebe.getSoyadi());
        System.out.println(muhasebe.getTelefonNo());
        System.out.println(muhasebe.getDepartmani());
        System.out.println(muhasebe.getSicilNo());
        System.out.println("Medeni Durumu: " +  (muhasebe.isMedeniDurumu() ? "Evli": "Bekar") );
    }
}
