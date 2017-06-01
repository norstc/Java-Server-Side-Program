/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.seleniumwebdriverdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



/**
 *
 * @author zhangjh
 */
public class SeleniumWithLog4jDemo {
    private static final Logger logger = LogManager.getLogger(SeleniumWithLog4jDemo.class);
    public static void main(String[] args){
        System.out.println("hello log4j2!");
        logger.trace("entering application");
         //target
        String target ="http://www.bing.com";
     
        //content
        String content = "新四经";
      
        //firefox profile
        ProfilesIni allProfiles  = new ProfilesIni();
        FirefoxProfile profile = allProfiles.getProfile("testselenium");
        WebDriver driver = new FirefoxDriver(profile);
        
        driver.get(target);
        WebElement element = null;
        
        element = driver.findElement(By.name("q"));
        element.sendKeys(content);
        element.submit();

        
        System.out.println("Page title is: " + driver.getTitle());
    }
}
