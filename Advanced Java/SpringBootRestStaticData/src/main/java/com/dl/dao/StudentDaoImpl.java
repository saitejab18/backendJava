package com.dl.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dl.models.Student;
import jakarta.annotation.PostConstruct;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> selectStudents() {
		return new ArrayList<>(students.values());
	}
    
	Map<Integer,Student> students = new HashMap<Integer, Student>();
	@PostConstruct
	public void init() {
		
		students.put(101, new Student(101,"sai","teja",13548393L,"Jagtial"));
		students.put(102, new Student(102,"sai","tharun",3575731L,"hyd"));
		students.put(103, new Student(103,"sai","vineeth",23791552L,"Dharmapuri"));
	}
}
