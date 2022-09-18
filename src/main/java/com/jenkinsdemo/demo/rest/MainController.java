package com.jenkinsdemo.demo.rest;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping
	public String getName(){
		
		return "name";
	}

}
