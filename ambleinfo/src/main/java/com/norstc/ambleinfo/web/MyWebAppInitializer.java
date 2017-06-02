/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author zhangjh
 */
public class MyWebAppInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext container){
        ServletRegistration.Dynamic registration = container.addServlet("sweb", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/sweb/*");
    }
    
}
