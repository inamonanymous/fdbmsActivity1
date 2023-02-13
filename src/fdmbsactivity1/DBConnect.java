/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fdmbsactivity1;

/**
 *
 * @author Stephen Aguilar
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnect {
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/student?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection Connect(){
    
        try {
            Connection con = null;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            return con;
        }
        catch(Exception ex){
            return null;
        }
    
    
    }
}
