package com.mimaraslan._03;

import java.util.ArrayList;

public class AppMain {


    public static void main(String[] args) {




       Personel  <Integer, String>  personel = new Personel();
     //   Personel  <String, Integer>  personel2 = new Personel();

    //    Personel  <Number, String, Boolean>  personel = new Personel();

    //    Personel  <Number, String, Boolean, String, Departman>  personel = new Personel();

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

        personel.ekranaYaz((short) 5, "Bilal");
        personel.cizgiCek();



    }
}
