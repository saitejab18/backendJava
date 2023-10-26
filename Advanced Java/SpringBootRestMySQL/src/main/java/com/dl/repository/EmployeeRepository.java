package com.dl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}