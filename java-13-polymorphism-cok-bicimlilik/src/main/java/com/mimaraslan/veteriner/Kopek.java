package com.mimaraslan.veteriner;

import com.mimaraslan.base.Hayvan;

public class Kopek extends Hayvan {


    public Kopek() {
        super();
        System.out.println("Kopek");
    }


    @Override
    public void sesVer(){
        System.out.println("Kopek : hav hav");
    }


}
