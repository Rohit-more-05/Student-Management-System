package com.projectum.StudManager.Implservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectum.StudManager.Repository.studentRepository;
import com.projectum.StudManager.Student.Student;
import com.projectum.StudManager.service.studentService;

@Service
public class Implservice implements studentService {
	
	@Autowired
	private studentRepository Repository;

	@Override
	public List<Student> getAllStudents() {
		return Repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return Repository.findById(id).orElse(null);
		
	}

	@Override
	public Student saveStudent(Student student) {
		return Repository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		Repository.deleteById(id);
	}

}
