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
public class DealDAO {
    public static boolean buyStock(String stockCode, Float stockPrice, Integer dealType, String dealDate, String dealTime){
        if(stockCode.equals("")) return false;
        Connection con = null;
        PreparedStatement ps = null;
        int rs = 0;
        
        try{
            con = DataConnect.getConnection();
            ps=con.prepareStatement("insert into ai_tb_deals (deal_code,deal_price,deal_direction,deal_date,deal_time) values (?,?,?,?,?)");
            ps.setString(1,stockCode);
            ps.setFloat(2, stockPrice);
            ps.setInt(3, 1);
            ps.setString(4, dealDate);
            ps.setString(5,dealTime);
            
            System.out.println(ps.toString());
            rs = ps.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.out.println("buy fail in exception ->" + ex.getMessage());
            return false;
        }finally{
            DataConnect.close(con);
        }
            
    }
    
}
