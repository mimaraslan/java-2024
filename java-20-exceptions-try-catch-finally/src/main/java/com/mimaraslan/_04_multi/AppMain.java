package com.mimaraslan._04_multi;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;

        int yapiacakIslemNo = 0;

        int toplam = 0;
        Float bolme = 0.0f;

        Scanner myInput = new Scanner(System.in);

        boolean hataDurumFlag = true;


        do {
          // code bir şey en az 1 kere çalışacaksa


            try {
                System.out.println("===============HOŞ GELDİNİZ=================");

               System.out.print("Lütfen 1. sayıyı giriniz: ");
               sayi1 = myInput.nextInt();

               System.out.print("Lütfen 2. sayıyı giriniz: ");
               sayi2 = myInput.nextInt();

                System.out.println("-------------------------------");
                System.out.println("Yapmak istediğiniz işlemi söyler misiniz?");
                System.out.println("Toplama için 1'e basınız.");
                System.out.println("Çıkarma için 2'ye basınız.");
                System.out.println("Çarpma için 3'e basınız.");
                System.out.println("Bölme için 4'e basınız.");

                System.out.println("-------------------------------");



                do {

                    System.out.print("Giriş için bekleniyor: ");
                    yapiacakIslemNo = myInput.nextInt();

                    System.out.println("-------------------------------");

                    if(yapiacakIslemNo == 1) {
                        System.out.println("Toplama işlemi yapıldı. : " + (sayi1 + sayi2) );
                    } else if (yapiacakIslemNo == 2) {
                        System.out.println("Çıkarma işlemi yapıldı. : " + (sayi1 - sayi2) );
                    } else if (yapiacakIslemNo == 3) {
                        System.out.println("Çarpma işlemi yapıldı. : " + (sayi1 * sayi2) );
                    } else if (yapiacakIslemNo == 4) {
                        System.out.println("Bölme işlemi yapıldı. : " + (sayi1 / sayi2) );
                    } else  {
                        System.out.println("Geçersiz bir seçim yapıldı.");
                    }

                } while (hataDurumFlag);




            } catch (ArithmeticException e) {
                System.out.println("Hata 1: " + e);
            } catch (InputMismatchException e) {
                System.out.println("Hata 2: " + e);
            } catch (NoSuchElementException e) {
                System.out.println("Hata 3: " + e);
            } catch (RuntimeException e) {
                System.out.println("Hata 4: " + e);
            } catch (Exception e) {
                System.out.println("Hata 5: " + e);
            }
            finally {
                System.out.println("Teşekkür ederiz. : " + new Date());
                System.out.println("===============GÜLE GÜLE=================\n\n");
                hataDurumFlag = false;
            }


        } while (hataDurumFlag);





    }
}
