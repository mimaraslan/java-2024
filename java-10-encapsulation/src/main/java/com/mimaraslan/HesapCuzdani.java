package com.mimaraslan;

// POJO - MODEL
public class HesapCuzdani {

    private String adi;
    private String soyadi;
    private String  subeAdi;
    private int subeNo;
    private long hesapNo;
    private String ibanNo;
    private String hesapParaCinsi;
    private float hesapTutari;


    public HesapCuzdani() {
        System.out.println("HesapCuzdani - parametresiz");
    }


    public HesapCuzdani(String adi, String soyadi, String subeAdi,
                        int subeNo, long hesapNo, String ibanNo,
                        String hesapParaCinsi, float hesapTutari) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.subeAdi = subeAdi;
        this.subeNo = subeNo;
        this.hesapNo = hesapNo;
        this.ibanNo = ibanNo;
        this.hesapParaCinsi = hesapParaCinsi;
        this.hesapTutari = hesapTutari;
        System.out.println("HesapCuzdani - bütün parametreler dahil");
    }


    public HesapCuzdani(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        System.out.println("HesapCuzdani - 2 parametreli");
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



    public String getSubeAdi() {
        return subeAdi;
    }

    public void setSubeAdi(String subeAdi) {
        this.subeAdi = subeAdi;
    }



    public int getSubeNo() {
        return subeNo;
    }

    public void setSubeNo(int subeNo) {
        this.subeNo = subeNo;
    }



    public long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(long hesapNo) {
        this.hesapNo = hesapNo;
    }



    public String getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }



    public String getHesapParaCinsi() {
        return hesapParaCinsi;
    }

    public void setHesapParaCinsi(String hesapParaCinsi) {
        this.hesapParaCinsi = hesapParaCinsi;
    }



    public float getHesapTutari() {
        return hesapTutari;
    }

    public void setHesapTutari(float hesapTutari) {
        this.hesapTutari = hesapTutari;
    }


    @Override
    public String toString() {
        return "HesapCuzdani{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", subeAdi='" + subeAdi + '\'' +
                ", subeNo=" + subeNo +
                ", hesapNo=" + hesapNo +
                ", ibanNo='" + ibanNo + '\'' +
                ", hesapParaCinsi='" + hesapParaCinsi + '\'' +
                ", hesapTutari=" + hesapTutari +
                '}';
    }



    public void getBilgiVer() {
        System.out.println("Bilgi ver metodu.");
    }


}
