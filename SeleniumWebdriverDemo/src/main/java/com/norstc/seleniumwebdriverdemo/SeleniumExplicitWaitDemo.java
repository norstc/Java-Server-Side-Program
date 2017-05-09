/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.seleniumwebdriverdemo;

import static org.openqa.grid.common.SeleniumProtocol.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author zhangjh
 */
public class SeleniumExplicitWaitDemo {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.bing.com";
        
        driver.get(baseUrl);
        //显式等待
        Thread.sleep(5000);
        
        //聪明一点的显示等待
        WebElement element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        
        element.sendKeys("新四经");
        element.submit();
    }
}
