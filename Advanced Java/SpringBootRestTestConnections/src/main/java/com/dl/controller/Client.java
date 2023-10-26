package com.dl.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Client {
	
	@GetMapping("/get")
	public String getUser() {
		return "Get Method Invoked";
		
	}
	@PostMapping("/post")
    public String createUser() {
		return  "Post Method Invoked";
    	
    }
    @PutMapping("/put")
    public String update() {
		return "Put Method Invoked";
    	
    }
    @DeleteMapping("/del")
    public String delete() {
		return "Delete Method Invoked";
    	
    }
    
    @RequestMapping("/methodlevel")
	public String helloWorld() {
		return "Method Level Invoked";
    }
}
