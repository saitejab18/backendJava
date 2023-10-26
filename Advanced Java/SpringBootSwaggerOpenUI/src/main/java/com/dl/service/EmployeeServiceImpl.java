package com.dl.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dl.model.Employee;
import com.dl.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository; 

	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	  Employee employeeUpdate = employeeRepository.findById(employee.getId()).get();
	  employeeUpdate.setEmpName(employee.getEmpName());
	  employeeUpdate.setEmpJob(employee.getEmpJob());
	  employeeUpdate.setEmpContact(employee.getEmpContact());
	  employeeUpdate.setEmpAddress(employee.getEmpAddress());
	  employeeUpdate.setEmpLocation(employee.getEmpLocation());
	  employeeUpdate.setEmpSalary(employee.getEmpSalary());
	  
	  Employee save = employeeRepository.save(employeeUpdate);
		return save;
	}
	

}
