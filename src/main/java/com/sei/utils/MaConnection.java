/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sei.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fayechi
 */
public class MaConnection {
       private Connection cnx;
        String url = "jdbc:mysql://localhost:3306/tunirent";
        String user = "ilyes";
        String pwd = "ILYES";
        public static MaConnection ct;

    private MaConnection() {
        try {
            cnx = DriverManager.getConnection(url,user,pwd);
            System.out.println("Cnx etablie ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static MaConnection getInstance(){
        if(ct ==null)
            ct= new MaConnection();
        return ct;
    }

    public Connection getCnx() {
        return cnx;
    }

   
        
}
