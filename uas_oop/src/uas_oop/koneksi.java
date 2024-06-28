/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_oop;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Yudhistira
 */
public class koneksi {
    
    private String url="jdbc:mysql://localhost:3306/db_supermarket";
    private String username_xampp="root";
    private String password_xampp="";
    private Connection cnn;
    
    public void connect() {
        try {
            cnn = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println("Koneksi ke Database Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Koneksi ke Database Gagal");
        }
        
    }
    
    public Connection getcnn(){
        return cnn;
    }

}
