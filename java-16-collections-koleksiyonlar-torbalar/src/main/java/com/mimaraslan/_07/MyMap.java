package com.mimaraslan._07;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {

        System.out.println("---HashMap rastgele yazar------");

        Map<String, String> mapList1 = new HashMap<String, String>();

                     //  Key   Value
        mapList1.put("Ankara", "06");
        mapList1.put("İzmir", "35");
        mapList1.put("Balıkesir", "10");
        mapList1.put("Ağrı", null);
        mapList1.put("Trabzon", "61");
        mapList1.put("Sivas", "58");
        mapList1.put(null, null);
        mapList1.put(null, "01");


        System.out.println(mapList1);


        System.out.println("---LinkedHashMap bizim yazdığımız sırayla girişleri yapar------");

        Map<String, String> mapList2 = new LinkedHashMap<>();

        //  Key   Value
        mapList2.put("Ankara", "06");
        mapList2.put("İzmir", "35");
        mapList2.put("Balıkesir", "10");
        mapList2.put("Ağrı", null);
        mapList2.put("Trabzon", "61");
        mapList2.put("Sivas", "58");
        mapList2.put(null, "01");

        System.out.println(mapList2);


        System.out.println("---TreeMap------");

       // Map<String, String> mapList3 = new TreeMap<>();
        TreeMap<String, String> mapList3 = new TreeMap<>();


        //  Key   Value
        mapList3.put("Ankara", "06");
        mapList3.put("İzmir", "35");  // FIXME TR karakterine göre sırala
        mapList3.put("Balıkesir", "10");
        mapList3.put("Ağrı", null);  // FIXME TR karakterine göre sırala
        mapList3.put("Trabzon", "61");
        mapList3.put("Sivas", "58");
     //   mapList3.put(null, "01");  // key null olamaz!!!
        mapList3.put("Adana", "01");  // key null olamaz!!!

        System.out.println(mapList3);


        System.out.println("---------");

        for (String key : mapList3.keySet()) {
           System.out.println(key + " : " + mapList3.get(key));
            //    System.out.println(key);
         //   System.out.println( mapList3.get(key)); // value
        }

        System.out.println("---Hashtable Key ve Value null olamaz!!------");


        Map<String, String> mapList4 = new Hashtable<>();
        //  Hashtable<String, String> mapList4 = new Hashtable<>();



        //  Key   Value
        mapList4.put("Ankara", "06");
        mapList4.put("İzmir", "35");  //
        mapList4.put("Balıkesir", "10");
      //  mapList4.put("Ağrı", null);  // value null olamaz!!!
        mapList4.put("Trabzon", "61");
        mapList4.put("Sivas", "58");
     //   mapList4.put(null, "01");  // key null olamaz!!!
        mapList4.put("Adana", "01");
      //  mapList4.put(null, null);  // key ve value null olamaz!!!

        System.out.println(mapList4);


    }
}
