package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hotel {
	
	@RequestMapping("/customerDetails")
	public String hotelCustomer(ModelMap model) {
		
		model.addAttribute("id", 401);
		model.addAttribute("firstName", "Saiteja");
		model.addAttribute("lastName", "Burugupalli");
		model.addAttribute("contact", 9052350946L);
		model.addAttribute("location", "Jagtial");
		
		return "hotelCustomer";

	}
}
