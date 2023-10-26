package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dl.model.Student;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String studentRegistrationForm() {
		return "index";
		
	}
	@RequestMapping(value="/studentValues", method = RequestMethod.POST)
	public ModelAndView studentValues(@RequestParam(value="id") int id,
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam (value = "contact")long contact,
			@RequestParam(value = "location") String location) {
		
		Student student = new Student(id,firstName,lastName,contact,location);
		ModelAndView modelAndView = new ModelAndView("studentform");
		modelAndView.addObject("student", student);
		
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(contact);
		System.out.println(location);
		return modelAndView;
		
	}

}
