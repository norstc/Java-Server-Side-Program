/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zhangjh
 */
public class DataConnect {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ambleinfo_db?useUnicode=true&amp;characterEncoding=UTF-8&useSSL=false","root","toor");
            System.out.println("connect to db");
            return con;
        }catch(Exception ex){
            System.out.println("database connect fail: " + ex.getMessage());
            return null;
        }
    }
    
    public static void close(Connection con){
        try{
            con.close();
        }catch(Exception ex){
            
        }
    }
}
