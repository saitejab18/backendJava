package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/classlevel")
public class HelloControllerClassLevel {
	
	@RequestMapping()
	public ModelAndView hello() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("classlevel");
		
		return modelAndView;
		
	}
}