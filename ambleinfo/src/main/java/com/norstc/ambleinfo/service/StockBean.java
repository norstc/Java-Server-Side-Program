/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.norstc.ambleinfo.entity.Stock;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhangjh
 */
@Named(value = "stockBean")
@SessionScoped
public class StockBean implements Serializable {

    private List<Stock> stocks;
    
    public List<Stock> getStocks(){
        
        return stocks;
    }
    /**
     * Creates a new instance of StockBean
     */
    public StockBean() {
        stocks = new ArrayList<Stock>();
        
         Connection connect = null;
         PreparedStatement pstmt = null;
         ResultSet rs=null;
         
        String url ="jdbc:mysql://localhost:3306/ambleinfo_db?useUnicode=true&amp;characterEncoding=UTF-8&useSSL=false";
        String username = "root";
        String password = "toor";
        System.out.println("connceted to mysql");
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StockBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            connect = (Connection) DriverManager.getConnection(url, username, password);
             pstmt = (PreparedStatement) connect.prepareStatement("select * from ai_tb_stocks");
            rs = pstmt.executeQuery();
         while (rs.next()){
            Stock stock = new Stock();
            stock.setStockId(rs.getInt("stock_id"));
            stock.setStockCode(rs.getString("stock_code"));
            stock.setStockName(rs.getString("stock_name"));
            stock.setCurrentPrice(rs.getFloat("current_price"));
            stock.setAiPrice(rs.getFloat("ai_price"));
            stock.setAiRoi(rs.getFloat("ai_roi"));
            System.out.println("connceted to mysql33" + stock.getStockCode());
            stocks.add(stock);
        }
        
        }catch(SQLException ex){
            System.out.println("in exception");
            System.out.println(ex.getMessage());
        }finally{
            try {
                //close connection
                if(rs!=null) rs.close();
                if(pstmt!=null) pstmt.close();
                if(connect!=null) connect.close();
            } catch (SQLException ex) {
                Logger.getLogger(StockBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
        
    }
    
}
