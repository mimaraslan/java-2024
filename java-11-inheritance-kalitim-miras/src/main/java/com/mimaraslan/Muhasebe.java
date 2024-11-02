package com.mimaraslan;


import lombok.*;

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
        System.out.println("Araç: " +  (muhasebe.isMedeniDurumu() ? "Var": "Yok") );
    }
}
