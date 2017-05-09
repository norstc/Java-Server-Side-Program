/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.seleniumwebdriverdemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author zhangjh
 */
public class SeleniumImplicitWaitDemo {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.bing.com";
        
        //隐式等待
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.name("q"));
        
        element.sendKeys("新四经");
        element.submit();
        
    }
}
