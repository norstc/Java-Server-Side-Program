/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.entity;

/**
 *
 * @author zhangjh
 */
public class Holding {
    private Integer userId;
    private Integer dealId;
    private String stockCode;
    private Float buyPrice;
    private Integer buyQuantity;
    private String buyDate;
    private String buyTime;

    public Holding() {
    }

    public Holding(Integer userId, Integer dealId, String stockCode, Float buyPrice, Integer buyQuantity, String buyDate, String buyTime) {
        this.userId = userId;
        this.dealId = dealId;
        this.stockCode = stockCode;
        this.buyPrice = buyPrice;
        this.buyQuantity = buyQuantity;
        this.buyDate = buyDate;
        this.buyTime = buyTime;
    }

    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
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

    public Integer getBuyQuantity() {
        return buyQuantity;
    }

    public void setBuyQuantity(Integer buyQuantity) {
        this.buyQuantity = buyQuantity;
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
    
    
}
