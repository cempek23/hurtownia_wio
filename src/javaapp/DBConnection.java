/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wojtek
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Połączono");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Połączenie nieudane" + cnfe);
            }
        String url ="jdbc:mysql://localhost:3306/hurtownia_wio";
        try{
            DBConnection = (Connection) DriverManager.getConnection(url, "hurtownik", "Pracownik1!");
            System.out.println("Połączona");
        }
        catch (SQLException se) {
            System.out.println("Połączenie nieudane" + se);
        }
        return DBConnection;
    }
    
    
}