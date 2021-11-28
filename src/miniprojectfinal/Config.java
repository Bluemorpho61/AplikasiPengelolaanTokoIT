package miniprojectfinal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try { 
            String url="jdbc:mysql://localhost:3306/toko_barang_it"; //url database
            String user="root"; //user database
            String pass=" "; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("Koneksi gagal "+e.getMessage());
            // perintah menampilkan error [ada koneksi
        }
        return mysqlconfig;
}

}