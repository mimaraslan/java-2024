package com.mimaraslan;

import java.sql.*;

public class MyPostgreSqlConnection {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "123456789");

            statement = connection.createStatement();


            String sql1 = "SELECT * FROM public.musteriler";
            String sql2 = "SELECT * FROM mycompanydb.musteriler";
            String sql3 = "SELECT * FROM public.musteriler WHERE yasi>25";

            resultSet = statement.executeQuery(sql3);

            while(resultSet.next()){
                /*
                System.out.println(resultSet.getString(1) + "  " +
                         resultSet.getString(2) + "  " +
                         resultSet.getString(3) + "  " +
                         resultSet.getString(4) + "  " +
                         resultSet.getString(5));
                */
                // id, adi, soyadi, sehir, yasi
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

}
