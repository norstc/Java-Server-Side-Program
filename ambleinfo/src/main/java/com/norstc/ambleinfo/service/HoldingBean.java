/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.entity.Holding;
import com.norstc.ambleinfo.util.DataConnect;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangjh
 */
@Named(value = "holdingBean")
@SessionScoped
public class HoldingBean implements Serializable {

    private List<Holding> holdings;

    public List<Holding> getHoldings() {
        return holdings;
    }
 
    

    /**
     * Creates a new instance of HoldingBean
     */
    public HoldingBean() {
        holdings = new ArrayList<Holding>();
        Connection connect = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        System.out.println("holding result: ++++++>" );
        
        try{
            connect = DataConnect.getConnection();
            pstmt = (PreparedStatement)connect.prepareStatement("select * from holdings");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Holding holding = new Holding();
                holding.setUserId(rs.getInt("user_id"));
                holding.setDealId(rs.getInt("deal_id"));
                holding.setStockCode(rs.getString("stock_code"));
                holding.setBuyPrice(rs.getFloat("buy_price"));
                holding.setBuyQuantity(rs.getInt("buy_quantity"));
                holding.setBuyDate(rs.getString("buy_date"));
                holding.setBuyTime(rs.getString("buy_time"));
                System.out.println("holding result: " + holding.getStockCode());
                holdings.add(holding);
            }
        }catch(SQLException ex){
            System.out.println("in exception holding");
            System.out.println(ex.getMessage());
        }finally{
            DataConnect.close(connect);
        }
    }

}
