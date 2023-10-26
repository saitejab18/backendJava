package com.dl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.dao.StudentDao;
import com.dl.models.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
    
	public List<Student> listStudents(Optional<Integer> id){
		
		List<Student> selectStudents = studentDao.selectStudents();
		return selectStudents;
		
	}
}
