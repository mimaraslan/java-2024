package com.mimaraslan._03_crud;

import java.sql.*;

public class AppMain {

   static Connection connection = null;


    // Bağlantıyı kurma
  public static Connection veritabaninaBaglantiKur(){

      final String DB_URL = "jdbc:mysql://localhost:3306/firmaveritabani";
      final String DB_USER = "root";
      final String DB_PASSWORD = "123456789";

      try {
          connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

          if (connection.isClosed()) {
              System.out.println("Veritabanına bağlantı kurulamadı.");
          } else {
              System.out.println("Veritabanına bağlantı kuruldu.");
          }

          return connection;

      } catch (SQLException e) {
          System.out.println("HATA : Veritabanına bağlantı kurulamadı.  ---->  " + e.getMessage());
          return null;
      } finally {
          System.out.println("Teşekkür ederiz.");
      }

  }


    // READ - SELECT  Veri okuma
  public String veriOku(){
       veritabaninaBaglantiKur();

       String personelBilgisi = null;

       try {

           PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM personel");

           ResultSet resultSet = preparedStatement.executeQuery();

           while (resultSet.next()) {
               System.out.println(
                       resultSet.getInt("personel_id") +  " " +
                       resultSet.getString("adi") + " " +
                       resultSet.getString("soyadi")  + " " +
                       resultSet.getString("eposta")  + " " +
                       resultSet.getString("gorevi")  + " " +
                       resultSet.getInt("maasi")
               );

               personelBilgisi = personelBilgisi + resultSet.getInt("personel_id") +  " " +
                       resultSet.getString("adi") + " " +
                       resultSet.getString("soyadi")  + " " +
                       resultSet.getString("eposta")  + " " +
                       resultSet.getString("gorevi")  + " " +
                       resultSet.getInt("maasi");
           }

       } catch (SQLException e) {
           System.out.println("HATA : " + e.getMessage());
       }

       return personelBilgisi;
   }


    // ADD INSERT ekleme
   void veriEkle(String adi, String soyadi, String eposta, String gorevi, String maasi){

      veritabaninaBaglantiKur();

       String durumBilgisi = null;

      try {

          String sqlQuery = "INSERT INTO personel (adi, soyadi, eposta, gorevi, maasi) " +
                                           "VALUES (?, ?, ?, ?, ?)";

          PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
          preparedStatement.setString(1, adi);
          preparedStatement.setString(2, soyadi);
          preparedStatement.setString(3, eposta);
          preparedStatement.setString(4, gorevi);
          preparedStatement.setString(5, maasi);
          //preparedStatement.executeUpdate();

          boolean result = preparedStatement.execute();

          if (!result) {
              durumBilgisi = "Ekleme başarılı oldu.";
          } else {
              durumBilgisi = "Ekleme başarısız oldu.";
          }

      } catch (SQLException e) {
          System.out.println("HATA : " + e.getMessage());
      } finally {
          System.out.println(durumBilgisi);
          // TODO BAGLANTI KAPAT METODU EKLENECEK.
      }

    }


    // UPDATE EDIT güncelleme düzenleme
    void veriDuzenle(String adi, String soyadi, String eposta, String gorevi, String maasi, String personelId){

        veritabaninaBaglantiKur();

        String durumBilgisi = null;

        try {

            String sqlQuery = "UPDATE personel " +
                    "SET " +
                    "adi = ?, " +
                    "soyadi = ?, " +
                    "eposta = ?, " +
                    "gorevi = ?, " +
                    "maasi = ? " +
                    "WHERE personel_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, adi);
            preparedStatement.setString(2, soyadi);
            preparedStatement.setString(3, eposta);
            preparedStatement.setString(4, gorevi);
            preparedStatement.setString(5, maasi);
            preparedStatement.setString(6, personelId);
            //preparedStatement.executeUpdate();

            boolean result = preparedStatement.execute();

            if (!result) {
                durumBilgisi = "Güncelleme başarılı oldu.";
            } else {
                durumBilgisi = "Güncelleme başarısız oldu.";
            }

        } catch (SQLException e) {
            System.out.println("HATA : " + e.getMessage());
        } finally {
            System.out.println(durumBilgisi);
        }

    }
  
  
    // DELETE silme
    void veriSil(String personelId){

        veritabaninaBaglantiKur();

        String durumBilgisi = null;

        try {

            String sqlQuery = "DELETE FROM personel WHERE personel_id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, personelId);
            //preparedStatement.executeUpdate();

            boolean result = preparedStatement.execute();

            if (!result) {
                durumBilgisi = "Silme işlemi başarılı oldu.";
            } else {
                durumBilgisi = "Silme işlemi başarısız oldu.";
            }

        } catch (SQLException e) {
            System.out.println("HATA : " + e.getMessage());
        } finally {
            System.out.println(durumBilgisi);
        }

    }



    public static void main(String[] args) {

        AppMain appObj = new AppMain();

        appObj.veriOku();
        System.out.println("------------------------------");

     //   appObj.veriEkle("Cellalettin", "Aksoy", "aaa@bbb.com", "Yönetici", "15000");

     //   appObj.veriEkle("Cihan", "Çelik", "ccc@yyy.com", "Stajyer", "1000");

     //   appObj.veriEkle("Cüneyt", "Soylu", "dfsfd@yyy.com", "Uzman", "20000");



      //  appObj.veriDuzenle("Volkan","Kaytmaz","vvv@kkk.com","CTO","35000","5");


        appObj.veriSil("2");
        System.out.println("------------------------------");

        appObj.veriOku();

    }
}
