package com.projectum.StudManager.service;

import java.util.List;

import com.projectum.StudManager.Student.Student;

public interface studentService {
	
	List<Student> getAllStudents();
	
	public Student getStudentById(int id);
	
	public Student saveStudent(Student student);
	
	public void deleteStudent(int id);
	
}
