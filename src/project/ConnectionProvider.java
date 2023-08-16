package project;


import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EMMANUEL-YEGON
 */
public class ConnectionProvider {
    
     public static Connection getCon(){
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_mgmt", "root", "Kip10983M#");
           return con;
        } catch(Exception e){
           return null;
        }
   }
    
}
