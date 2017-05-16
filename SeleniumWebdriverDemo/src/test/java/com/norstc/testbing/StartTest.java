/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.testbing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 *
 * @author zhangjh
 */
public class StartTest {
    private static final Logger loggerForTest = LogManager.getLogger(StartTest.class);
    @Test
    public void startFirefox(){
        System.out.println("hello test");
        loggerForTest.trace("enter first test");
    }
}
