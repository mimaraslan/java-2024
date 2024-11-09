package com.mimaraslan._02;

public class AppMain {


    public static void main(String[] args) {

        Personel  personel = new Personel();

        personel.ekranaYaz();
        personel.cizgiCek();

        personel.ekranaYaz(1, "Bilal");
        personel.cizgiCek();

        personel.ekranaYaz(2.0, "Bilal");
        personel.cizgiCek();

        personel.ekranaYaz(3.0f, "Bilal");
        personel.cizgiCek();

        personel.ekranaYaz(4L, "Bilal");
        personel.cizgiCek();



    }
}
