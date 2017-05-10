/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.dao.DealDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author zhangjh
 */
@Named(value = "dealBean")
@SessionScoped
public class DealBean implements Serializable {

    private String stockCode;
    private Float stockPrice;
    private String dealDate;
    private String dealTime;
    private Integer dealDirection; //1 buy, 0 sell

     /**
     * Creates a new instance of DealBean
     */
    public DealBean() {
    }
    
    public String buyStock(){
        boolean valid = DealDAO.buyStock(stockCode,stockPrice,dealDirection,dealDate,dealTime);
        if(valid){
            return "buyOk";
        }else{
            return "buyFail";
        }
    }
    
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public Integer getDealType() {
        return dealDirection;
    }

    public void setDealType(Integer dealType) {
        this.dealDirection = dealType;
    }
    
    
   
    
}
