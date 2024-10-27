package com.mimaraslan;

public class _02_If_Else {

    public static void main(String[] args) {

        System.out.println("-------------If else -------------------------------");

        int adayYasi = 17;

        if (adayYasi >= 18) {
            System.out.println("Evet ehliyet sınavına girebilirsiniz.");
        } else {
            System.out.println("Hayır sınava giremezsiniz çünkü yaşınız henüz " + adayYasi);
        }


        System.out.println("-------------If else içiçe -------------------------------");


         adayYasi = 17;

        if (adayYasi >= 18) {
            System.out.println("Evet ehliyet sınavına girebilirsiniz.");
        } else if (adayYasi < 0) {
            System.out.println("Hayır sınava giremezsinz cünkü sen yoksun.: " + adayYasi);
        } else if (adayYasi == 17) {
            System.out.println("Evet ehliyet sınavına girebilirsiniz ama sadece stajyer ehliyeti alabilirsiniz.");
        } else {
            System.out.println("Hayır sınava giremezsiniz çünkü yaşınız henüz " + adayYasi);
        }


        System.out.println("-------------If else içiçe -------------------------------");


        boolean saglikRaporu = true;
        adayYasi = 25;

        if (saglikRaporu == true) {

            if (adayYasi >= 18) {
                System.out.println("Evet ehliyet sınavına girebilirsiniz.");
            } else if (adayYasi < 0) {
                System.out.println("Hayır sınava giremezsinz cünkü sen yoksun.: " + adayYasi);
            } else if (adayYasi == 17) {
                System.out.println("Evet ehliyet sınavına girebilirsiniz ama sadece stajyer ehliyeti alabilirsiniz.");
            } else {
                System.out.println("Hayır sınava giremezsiniz çünkü yaşınız henüz " + adayYasi);
            }

        } else {
            System.out.println("Sağlık raporunuz olumlu olmadan sınava girmezsiniz.");
        }






    }
}
