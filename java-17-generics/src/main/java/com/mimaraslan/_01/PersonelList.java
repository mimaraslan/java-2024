package com.mimaraslan._01;

import java.util.ArrayList;
                          //String
public class PersonelList <   T   > {

    private T myTypeInfo;
 //  private Integer myDetail;

  private ArrayList<T> myPersonelArrayList = new ArrayList();



  public void listeyeEkle (T myData){

      // System.out.println("=====> MY DATA: "+myData);
      // loglama
      // veritabanı
      // security
      myPersonelArrayList.add(myData);
   }

  // f(x)  =    2*x  + 3

  //  listeyeEkle (T myData) = { 2 * myData + 3   }



  public ArrayList <T> listeyiGetir (){
       return myPersonelArrayList;
    }

}
