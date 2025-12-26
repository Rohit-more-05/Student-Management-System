package com.projectum.StudManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectum.StudManager.Implservice.Implservice;
import com.projectum.StudManager.Student.Student;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private Implservice service;
		
	@GetMapping("/enrolled")
	public String getStudent(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "studentum";
	}
	
	@GetMapping("/enrolled/new")
	public String createStudentum(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "Create-Studentum";
	}
	
	@PostMapping("/enrolled")
	public String saveStudent(@ModelAttribute("student") Student mentee) {
		service.saveStudent(mentee);
		return "redirect:/enrolled";
	}
	
	@GetMapping("/enrolled/edit/{id}")
	public String editStudentForm(@PathVariable int id, Model model){
		model.addAttribute("student", service.getStudentById(id));
		return "Edit-Studentum";
	}
	
	@PostMapping("/enrolled/edit/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student) {
		Student existingStudent = service.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName()); 
		existingStudent.setLastName(student.getLastName()); 
		existingStudent.setEmail(student.getEmail());
		
		service.saveStudent(existingStudent);
		return "redirect:/enrolled";
		
	}
	
	@GetMapping("/enrolled/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "redirect:/enrolled";
	}
	
}
