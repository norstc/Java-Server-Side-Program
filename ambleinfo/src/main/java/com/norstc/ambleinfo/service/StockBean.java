/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.norstc.ambleinfo.entity.Stock;
import com.norstc.ambleinfo.util.DataConnect;
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
         

        try{
            
            connect = DataConnect.getConnection();
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
            //System.out.println("connceted to mysql33" + stock.getStockCode());
            stocks.add(stock);
        }
        
        }catch(SQLException ex){
            System.out.println("in exception");
            System.out.println(ex.getMessage());
        }finally{
           DataConnect.close(connect);
        }
  
        
    }
    
}
