package com.mimaraslan._03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {
/*
        Vector vectorList = new Vector<>();

        vectorList.add("Sefa");
        vectorList.add(10);
        vectorList.add(null);
        vectorList.add(true);
        vectorList.add(Boolean.FALSE);
        vectorList.add(10.2f);

        System.out.println(vectorList);
*/

        long start_time = System.currentTimeMillis();

          Vector <String> myRecord = new Vector();  // add 549         add + read :  740   // 1054
        //  ArrayList <String> myRecord = new ArrayList(); // add 437    add + read :  470      // 890
        //  LinkedList<String> myRecord = new LinkedList(); // add 3235     add + read : 3247  // 3362


        for (int i = 0; i < 10_000_000 ; i++){
            myRecord.add(""+i);
        }

        for (int i = 0; i < 100 ; i++){
            myRecord.add(1,""+i);
        }

        for (String item : myRecord){
           // System.out.println(item);
        }


        long end_time = System.currentTimeMillis();

        System.out.println(end_time-start_time);



    }
}
