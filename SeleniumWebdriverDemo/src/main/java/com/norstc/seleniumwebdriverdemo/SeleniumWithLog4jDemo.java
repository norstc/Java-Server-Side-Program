/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.seleniumwebdriverdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 *
 * @author zhangjh
 */
public class SeleniumWithLog4jDemo {
    private static final Logger logger = LogManager.getLogger(SeleniumWithLog4jDemo.class);
    public static void main(String[] args){
        System.out.println("hello log4j2!");
        logger.trace("entering application");
        
    }
}
