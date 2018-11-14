/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cbb;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionBD {
    
    public Connection getconnection() throws SQLException
    {
                Driver monDriver = null;
                monDriver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(monDriver);
                
////                String url = "jdbc:mysql://IP DU SERVEUR/NOM DB";
////                String utilisateur = "saad";
////                String password = "saadabdi";
                String url = "jdbc:mysql://localhost/automatisation";
                String utilisateur = "root";
                String password = "";

                
         Connection connection = (Connection) DriverManager.getConnection(url, utilisateur, password);

         return connection;
    }
    
    public int add(int b, int c){
        return c+b;
    }
}
