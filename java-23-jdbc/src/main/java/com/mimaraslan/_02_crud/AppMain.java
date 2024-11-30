package com.mimaraslan._02_crud;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AppMain {


    static final String SQL_BUTUN_MUSTERILER = "SELECT * FROM public.musteriler";

    static final String SQL_BUTUN_MUSTERILER_PUBLIC_YASI_25_BUYUK = "SELECT * FROM public.musteriler WHERE yasi > 25";

    static final String SQL_MUSTERI_ID_BILGISINE_GORE_GUNCELLE =
            "UPDATE public.musteriler " +
                    "            SET " +
                    "                adi='Cemre', " +
                    "                soyadi= 'Gök', " +
                    "                sehir= 'Ankara', " +
                    "                yasi= 18 " +
                    "        WHERE id = 1";

    static final String SQL_MUSTERI_YENI_EKLEME = "INSERT INTO public.musteriler( " +
            "adi, soyadi, sehir, yasi) " +
            "VALUES ('Ahmet',  'Vatansever',   'İstanbul',  27)";

    static final String SQL_MUSTERI_ID_BILGISINE_GORE_SILME = "DELETE FROM public.musteriler " +
            "WHERE id = 9";



    public static void main(String[] args) throws SQLException {

        MyCrud myCrud = new MyCrud();

        System.out.println("----READ---------");
         myCrud.getButunMusteriler(SQL_BUTUN_MUSTERILER);
/*
        System.out.println("----UPDATE---------");
        myCrud.updateMusteriIdUzerinden(SQL_MUSTERI_ID_BILGISINE_GORE_GUNCELLE);

        System.out.println("----INSERT---------");
        myCrud.addBirMusteriEkle(SQL_MUSTERI_YENI_EKLEME);

        System.out.println("----DELETE---------");
        myCrud.deleteBirMusteriSil(SQL_MUSTERI_ID_BILGISINE_GORE_SILME);
*/

        System.out.println("----UPDATE---------");
        myCrud.deleteUpdateAddMusteri(SQL_MUSTERI_ID_BILGISINE_GORE_GUNCELLE);

        System.out.println("----INSERT---------");
        myCrud.deleteUpdateAddMusteri(SQL_MUSTERI_YENI_EKLEME);

        System.out.println("----DELETE---------");
        myCrud.deleteUpdateAddMusteri(SQL_MUSTERI_ID_BILGISINE_GORE_SILME);

        System.out.println("----READ---------");
        myCrud.getButunMusteriler(SQL_BUTUN_MUSTERILER);

    }
}
