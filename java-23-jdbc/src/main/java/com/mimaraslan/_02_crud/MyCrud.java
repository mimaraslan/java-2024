package com.mimaraslan._02_crud;


import java.sql.*;

// CRUD   Create (Ekleme, Oluşturma), Read (Okuma), Update (Güncelle, Düzenle), Delete (Silme)
public class MyCrud {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    private final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private final String DB_USER = "postgres";
    private final String DB_PASS = "123456789";



      /*
    // SELECT - READ - OKUMAK - LISTELE
    public void getButunMusteriler() {

        try{

            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            statement = connection.createStatement();

            resultSet = statement.executeQuery(SQL_BUTUN_MUSTERILER_PUBLIC);

            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt("id") + "  " +
                                resultSet.getString("adi") + "  " +
                                resultSet.getString("soyadi") + "  " +
                                resultSet.getString("sehir") + "  " +
                                resultSet.getInt("yasi"));
                System.out.println("-------------------------------------");
            }


        }catch (Exception e){
            System.out.println("Hata: " + e);

        } finally {
            if(resultSet != null || statement != null || connection != null){
                try {
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }

*/

    private boolean isOpenConnection() {
        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            return true;
        }catch (Exception e){
            System.out.println("Hata: " + e);
            return false;
        }
    }

    private boolean isCloseConnection () {
        if(connection != null){
            try {
                connection.close();
                return true;
            } catch (Exception e) {
                System.out.println("Hata: " + e);
                return false;
            }
        }
        // FIXME bu kısımda iyileştirme yapılacak.
        return false;
    }

// READ (SELECT) - OKU, LISTELE
public void getButunMusteriler(String sql) throws SQLException {

         if (isOpenConnection()) {
             System.out.println("Bağlantı açıldı.");
             preparedStatement = connection.prepareStatement(sql);
             resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt("id") + "  " +
                                resultSet.getString("adi") + "  " +
                                resultSet.getString("soyadi") + "  " +
                                resultSet.getString("sehir") + "  " +
                                resultSet.getInt("yasi"));
                System.out.println("-------------------------------------");
            }
         }

         if (isCloseConnection()) {
             System.out.println("Bağlantı kapatıldı.");
         }
    }

// UPDATE (DUZENLE)
public void updateMusteriIdUzerinden(String sql) throws SQLException {
       if (isOpenConnection()) {
           System.out.println("Bağlantı açıldı.");
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.executeUpdate();
       }

       if (isCloseConnection()) {
           System.out.println("Bağlantı kapatıldı.");
       }
   }

// INSERT
public void addBirMusteriEkle(String sql) throws SQLException {
    if (isOpenConnection()) {
        System.out.println("Bağlantı açıldı.");
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();
    }

    if (isCloseConnection()) {
        System.out.println("Bağlantı kapatıldı.");
    }
}

// DELETE
public void deleteBirMusteriSil(String sql) throws SQLException {
    if (isOpenConnection()) {
        System.out.println("Bağlantı açıldı.");
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeUpdate();
    }

    if (isCloseConnection()) {
        System.out.println("Bağlantı kapatıldı.");
    }
}


 public void deleteUpdateAddMusteri(String sql) throws SQLException {
        if (isOpenConnection()) {
            System.out.println("Bağlantı açıldı.");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
        }

        if (isCloseConnection()) {
            System.out.println("Bağlantı kapatıldı.");
        }
    }


}
