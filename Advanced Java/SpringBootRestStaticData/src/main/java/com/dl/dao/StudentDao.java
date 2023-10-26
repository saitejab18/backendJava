package com.dl.dao;

import java.util.List;

import com.dl.models.Student;

public interface StudentDao 
{
  List<Student> selectStudents();
}
