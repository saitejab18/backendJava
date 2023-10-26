package com.dl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.Employee;
import com.dl.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	
	public ResponseEntity<List<Employee>> get(){
	List<Employee> findAllEmployees = employeeService.findAllEmployees();
	return new ResponseEntity<List<Employee>>(findAllEmployees,HttpStatus.CREATED);
	}
	
	@PostMapping("/saveEmployees")
	
	        public ResponseEntity<Employee> save(@RequestBody Employee employee){
			Employee employees = employeeService.save(employee);
		    return new ResponseEntity<Employee>(employees, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id){
	employeeService.deleteEmployee(id);
    return new ResponseEntity<>("Employee Record Deleted", HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee){
		employee.setId(id);
		Employee updateEmployee = employeeService.updateEmployee(employee);
		return new ResponseEntity<Employee>(updateEmployee,HttpStatus.OK);
		
	}
}
