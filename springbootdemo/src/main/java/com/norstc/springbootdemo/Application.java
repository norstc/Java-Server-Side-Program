/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hardy
 */
@SpringBootApplication
@RestController
public class Application {
    
    @RequestMapping("/")
    String home(){
        return "Hello world! change some";
    }
    public static void main(String[] args){
        System.out.println("hello spring boot!");
        SpringApplication.run(Application.class, args);
    }
}
