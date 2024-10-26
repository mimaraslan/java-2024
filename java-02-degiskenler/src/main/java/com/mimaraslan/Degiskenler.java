package com.mimaraslan;

public class Degiskenler { // Scope - Kapsam
/*
    cay kasigi
    corba kasigi
    kepce
    tabak
    bardak
    tencere
    kazan
*/


    public static void main(String[] args) {

        int myInt = 10;
        byte myByte = 20;
        short myShort = 30;
        long myLong = 40;
        float myFloat = 50.123456f;
        double myDouble = 60.123456789012345;
        char myChar = 'A';
        boolean myBoolean = true; // false

        System.out.println(myInt);

        myInt = 1000000000;
        System.out.println(myInt);

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);

        System.out.println("------------------------");

        Integer myInt2 = 10;
        Byte myByte2 = 20;
        Short myShort2 = 30;
        Long myLong2 = 40L;
        Float myFloat2 = 50.123456F;
        Double myDouble2 = 60.123456789012345;
        Character myChar2 = 'A';
        Boolean myBoolean2 = true; // false

        System.out.println(myInt2);

        myInt2 = 1000000000;
        System.out.println(myInt2);

        System.out.println(myByte2);
        System.out.println(myShort2);
        System.out.println(myLong2);
        System.out.println(myFloat2);
        System.out.println(myDouble2);
        System.out.println(myChar2);
        System.out.println(myBoolean2);



    }


}
