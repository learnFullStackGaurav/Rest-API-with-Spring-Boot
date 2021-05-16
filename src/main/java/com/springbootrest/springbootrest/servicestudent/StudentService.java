package com.springbootrest.springbootrest.servicestudent;

import java.util.List;

import com.springbootrest.springbootrest.student.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student getStudent(int studentId);
	
	public Student addStudent(Student student);

	public Student deleteStudent(int studentId);
	
	public Student updateStudent(Student student);
}
