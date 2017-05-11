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
    public static boolean buyStock(String userId,String stockCode, Float buyPrice, Integer buyQuantity,String buyDate, String buyTime){
        if(stockCode.equals("")) return false;
        Connection con = null;
        PreparedStatement ps = null;
        int rs = 0;
        
        try{
            con = DataConnect.getConnection();
            ps=con.prepareStatement("insert into ai_tb_deals (user_id,stock_code,buy_price,buy_quantity,buy_date,buy_time) values (?,?,?,?,?,?)");
            ps.setString(1,userId);
            ps.setString(2, stockCode);
            ps.setFloat(3, buyPrice);
            ps.setInt(4,buyQuantity);
            ps.setString(5, buyDate);
            ps.setString(6,buyTime);
            
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
