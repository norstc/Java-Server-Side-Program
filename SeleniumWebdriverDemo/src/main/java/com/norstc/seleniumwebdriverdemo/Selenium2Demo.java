/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.seleniumwebdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Selenium2Demo {
    public static void main(String[] args){
        //target
        String pomp204 ="http://192.168.1.204/pomp/login.do";
        String pomp208 = "http://192.168.1.208/pomp/login.do";
        
        //user
        String username="test_jt_3@sh.com";
        String password="123456";
        
        //firefox profile
        ProfilesIni allProfiles  = new ProfilesIni();
        FirefoxProfile profile = allProfiles.getProfile("testselenium");
        WebDriver driver = new FirefoxDriver(profile);
        
        driver.get(pomp204);
        WebElement element = null;
        
        element = driver.findElement(By.id("name"));
        element.sendKeys(username);
        
        element = driver.findElement(By.id("pwd"));
        element.sendKeys(password);
       
        
        System.out.println("Page title is: " + driver.getTitle());
     
        
    }
}
