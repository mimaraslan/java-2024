package com.mimaraslan._01;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// Kalıp - Model
public class Personel {

    private String  adi;
    private String  soyadi;
    private String  tc;
    private String  sicilno;
    private String  departman;
    private int dogumYili;
    private boolean medeniDurum;
    private int cocukSayisi;
/*
    public Personel() {
    }

    public Personel(String adi, String soyadi, boolean medeniDurum) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.medeniDurum = medeniDurum;
    }

    public Personel(String soyadi, String tc, String sicilno, String departman, int dogumYili, boolean medeniDurum, int cocukSayisi) {
        this.soyadi = soyadi;
        this.tc = tc;
        this.sicilno = sicilno;
        this.departman = departman;
        this.dogumYili = dogumYili;
        this.medeniDurum = medeniDurum;
        this.cocukSayisi = cocukSayisi;
    }

    public Personel(String adi,
                    String soyadi,
                    String tc,
                    String sicilno,
                    String departman,
                    int dogumYili,
                    boolean medeniDurum,
                    int cocukSayisi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tc = tc;
        this.sicilno = sicilno;
        this.departman = departman;
        this.dogumYili = dogumYili;
        this.medeniDurum = medeniDurum;
        this.cocukSayisi = cocukSayisi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getSicilno() {
        return sicilno;
    }

    public void setSicilno(String sicilno) {
        this.sicilno = sicilno;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public boolean isMedeniDurum() {
        return medeniDurum;
    }

    public void setMedeniDurum(boolean medeniDurum) {
        this.medeniDurum = medeniDurum;
    }

    public int getCocukSayisi() {
        return cocukSayisi;
    }

    public void setCocukSayisi(int cocukSayisi) {
        this.cocukSayisi = cocukSayisi;
    }


    @Override
    public String toString() {
        return "Personel{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", tc='" + tc + '\'' +
                ", sicilno='" + sicilno + '\'' +
                ", departman='" + departman + '\'' +
                ", dogumYili=" + dogumYili +
                ", medeniDurum=" + medeniDurum +
                ", cocukSayisi=" + cocukSayisi +
                '}';
    }
*/
}
