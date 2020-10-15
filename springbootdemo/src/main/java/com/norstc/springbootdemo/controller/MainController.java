package com.norstc.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	 @RequestMapping("/")
	    String home(){
	        return "Hello world! change some";
	    }
	    

}
