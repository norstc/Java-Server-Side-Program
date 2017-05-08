/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.dao;

import com.norstc.ambleinfo.util.DataConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zhangjh
 */
public class LoginDAO {
    public static boolean validate(String user, String password){
        if(user.equals("") || password.equals("")) return false;
        Connection con  = null;
        PreparedStatement ps = null;
        try{
            con = DataConnect.getConnection();
            ps = con.prepareStatement("Select user_name, user_password from ai_tb_users where user_name = ? and user_password = ?");
            ps.setString(1,user);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //result found , means valid inputs
                return true;
            }
        }catch(SQLException ex){
            System.out.println("login error --> " + ex.getMessage());
            return false;
        }finally{
            DataConnect.close(con);
        }
        return false;
        
    }
}
