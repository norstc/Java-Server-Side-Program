/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.dao.DealDAO;
import com.norstc.ambleinfo.dao.UserDAO;
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
    private Float buyPrice;
    private String buyDate;
    private String buyTime;
    private Float sellPrice;
    private String sellDate;
    private String sellTime;
    private String userId;
    private String dealId;
    private Integer buyQuantity;
    private Integer sellQuantity;

    

    /**
     * Creates a new instance of DealBean
     */
    public DealBean() {
    }

    public String buyStock() {
        userId = UserDAO.getUserId();
        boolean valid = DealDAO.buyStock(userId, stockCode, buyPrice, buyQuantity,buyDate, buyTime);
        if (valid) {
            return "buyOk";
        } else {
            return "buyFail";
        }
    }

    public String sellStock(){
        userId = UserDAO.getUserId();
        boolean valid = true;
        if(valid){
            return "sellOk";
        }else{
            return "sellFail";
        }
    }
    public Integer getSellQuantity() {
        return sellQuantity;
    }

    public void setSellQuantity(Integer sellQuantity) {
        this.sellQuantity = sellQuantity;
    }
    
    
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Float getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Float buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(String buyTime) {
        this.buyTime = buyTime;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getSellTime() {
        return sellTime;
    }

    public void setSellTime(String sellTime) {
        this.sellTime = sellTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public Integer getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(Integer buyQuantity) {
        this.buyQuantity = buyQuantity;
    }

    
}
