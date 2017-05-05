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
public class Stock {
    private Integer stockId;
    private String stockCode;
    private String stockName;
    private Float currentPrice;
    private Float aiPrice;
    private Float aiRoi;

    public Stock() {
    }

    
    public Stock(Integer stockId, String stockCode, String stockName, Float currentPrice, Float aiPrice, Float aiRoi) {
        this.stockId = stockId;
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.currentPrice = currentPrice;
        this.aiPrice = aiPrice;
        this.aiRoi = aiRoi;
    }

    
    /**
     * @return the stockId
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * @param stockId the stockId to set
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * @return the stockCode
     */
    public String getStockCode() {
        return stockCode;
    }

    /**
     * @param stockCode the stockCode to set
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    /**
     * @return the stockName
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * @param stockName the stockName to set
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * @return the currentPrice
     */
    public Float getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice the currentPrice to set
     */
    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return the aiPrice
     */
    public Float getAiPrice() {
        return aiPrice;
    }

    /**
     * @param aiPrice the aiPrice to set
     */
    public void setAiPrice(Float aiPrice) {
        this.aiPrice = aiPrice;
    }

    /**
     * @return the aiRoi
     */
    public Float getAiRoi() {
        return aiRoi;
    }

    /**
     * @param aiRoi the aiRoi to set
     */
    public void setAiRoi(Float aiRoi) {
        this.aiRoi = aiRoi;
    }
    
}
