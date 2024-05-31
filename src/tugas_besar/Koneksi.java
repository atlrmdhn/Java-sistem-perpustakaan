package tugas_besar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
private Connection koneksiDatabase;

    public Connection getKoneksiDatabase(){
        if(koneksiDatabase == null) {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                System.out.println("Driver ditemukan");
                try{
                    koneksiDatabase = DriverManager.getConnection("jdbc:mysql://localhost:3306/s3_ppbo_tugas", "root", "");
                    System.out.println("Koneksi Database Ditemukan");
                } catch (SQLException ex) {
                    System.out.println("Koneksi Database Tidak Ditemukan : \nDengan Pesan :" + ex.toString());
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("Class Driver Database Tidak Ditemukan \nDengan Pesan :" + ex.toString());
            }
        }
        return koneksiDatabase;
    }
}


