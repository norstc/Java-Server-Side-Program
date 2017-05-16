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
