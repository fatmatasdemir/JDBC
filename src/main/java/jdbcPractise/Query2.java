package jdbcPractise;

import java.sql.*;

public class Query2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.Driver Yukle
        Class.forName("org.postgresql.Driver");
        //2.Baglanti olustur
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed",
                "postgres", "yusufmehmet");


        //SORU: Öğrenciler tablosundaki erkek öğrencileri listeleyiniz?

        Statement st = con.createStatement();

        ResultSet data = st.executeQuery("select * from ogrenciler where cinsiyet='E'");

        //SORU: Öğrenciler tablosundaki Erkek möğrencileri listeleyiniz?

        while (data.next()){
            //System.out.println(data.getInt(1) + data.getString(2) +
            //        data.getInt(3) + data.getString(4));

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", data.getInt(1),
                    data.getString(2), data.getString(3), data.getString(4));

        }/*
        con.close();
        st.close();
        data.close();
        */
    }


    }










