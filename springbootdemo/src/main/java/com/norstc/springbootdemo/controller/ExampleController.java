package com.norstc.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExampleController {
	
	@GetMapping("/example")
	public String exampleHandler(Model model) {
		model.addAttribute("name","Zhang");
		return "example-view";
	}
	
	@GetMapping("/hello")
	public String helloHandler(Model model, @RequestParam(value="name", required=false,defaultValue="world") String name) {
		return "hello-view";
	}

}
