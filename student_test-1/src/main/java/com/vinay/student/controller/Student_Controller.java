package com.vinay.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.student.entity.Student;
import com.vinay.student.repository.Student_Repository;

@RestController
@RequestMapping("/student1")
public class Student_Controller {
	
	@Autowired
	private Student_Repository studentRepository;
	
	@GetMapping("/studentlist")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/newstudent")
	public void addStudent(Student student) {
		this.studentRepository.save(student);
	}
	@PostMapping("/newstudent")
	public void addstudent(Student student) {
		this.studentRepository.save(student);
		
	}

}