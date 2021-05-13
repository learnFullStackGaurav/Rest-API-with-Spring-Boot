package com.springbootrest.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.servicestudent.StudentService;
import com.springbootrest.springbootrest.student.Student;

@RestController
public class MyController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/home")
	public String myHome() {
		return "Welcome to Home";
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return this.studentService.getStudent();
	}

	@GetMapping("/students/{studentid}")
	public Student getStudent(@PathVariable int studentid) {
		return this.studentService.getStudent(studentid);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s) {
		return this.studentService.addStudent(s);
	}
	
	
	@DeleteMapping("/students/{studentid}")
	public Student deleteStudent(@PathVariable int studentid) {
		return this.studentService.deleteStudent(studentid);
	}
}
