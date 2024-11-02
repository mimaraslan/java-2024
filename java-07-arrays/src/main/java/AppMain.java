public class AppMain {

    public static void main(String[] args) {

    //    System.out.println(args[0]); // hata verir

       // index          0   1   2   3   4  ...
        int[] myArr = {  10, 20, 30, 40, 50, 60, 70, 80, 90, 'a', 100 }; // 10 eleman item
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);

        System.out.println("----------------------");

        // lenght vs lenght()

        String firstName = "Ahmet";
        System.out.println(firstName.length()); // length() String'in karakter sayısını verir.

        System.out.println("----------------------");

        for (int i = 0; i < myArr.length ; i++) {  // length dizinin eleöman sayısını verir.
            System.out.print(myArr[i] + " - ");
        }

        System.out.println("-----TEK BOYUTLU-----------------");

        short myArray[] = new short[4];
        myArray[0] = 'a'; //97
        myArray[1] = 99;
        myArray[2] = 125;
        myArray[3] = 11;

       // myArray[4] = 500;
      //  System.out.println(myArray[4]);


        for (short i = 0; i < myArray.length ; i++) {
            System.out.println(myArray[i]);
        }


/*
        short sayi1 = 32767;
        short sayi2 = 32767;
        short sonuc = sayi1 + sayi2;

        byte sayi3 = 127;
        byte sayi4 = 127;
        byte sonuc2 = sayi3 + sayi4;
*/


        System.out.println("--------- 2D --------");
        int [][]  myNumberArray = new int[3][5];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
//                System.out.println("i: " + i + " j: " + j  + "\n");
                System.out.print( i + "  " + j  );

            }
            System.out.print( "\n");


        }


        System.out.println("--------- 3D --------");
        int [][][]  myNumberArray3D = new int[3][5][2];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < 2; k++) {
                    System.out.println("i: " + i + " j: " + j + " k: " + k );
                }
            }
        }




    }

}
