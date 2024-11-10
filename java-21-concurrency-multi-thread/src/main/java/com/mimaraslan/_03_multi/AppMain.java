package com.mimaraslan._03_multi;

// inner
 class MyBaseThread extends Thread {

   @Override
   public void run() {
    System.out.println("extends MyBaseThread is running: "
            + Thread.currentThread().getName());
   }

 }

public class AppMain {

    public static void main(String[] args) {

        MyBaseThread myBaseThread1 = new MyBaseThread();
        MyBaseThread myBaseThread2 = new MyBaseThread();
        MyBaseThread myBaseThread3 = new MyBaseThread();
        MyBaseThread myBaseThread4 = new MyBaseThread();

        System.out.println("extends MyBaseThread started. ");

        myBaseThread1.setName("FB");
        myBaseThread2.setName("TS");
        myBaseThread3.setName("BJK");
        myBaseThread4.setName("GS");

        myBaseThread1.setPriority(Thread.MAX_PRIORITY); //10
        myBaseThread2.setPriority(Thread.NORM_PRIORITY); //5
        myBaseThread3.setPriority(Thread.NORM_PRIORITY); //5
        myBaseThread4.setPriority(Thread.MIN_PRIORITY); //1

        myBaseThread1.start();
        myBaseThread2.start();
        myBaseThread3.start();
        myBaseThread4.start();

    }

}