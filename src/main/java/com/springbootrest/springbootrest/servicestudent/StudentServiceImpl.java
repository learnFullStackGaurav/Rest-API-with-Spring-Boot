package com.springbootrest.springbootrest.servicestudent;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Sides;

import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.student.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	public List<Student> studentList;
	
	public StudentServiceImpl() {
		
		studentList = new ArrayList< >();
		studentList.add(new Student("Gaurav",123,"CSE"));
		studentList.add(new Student("Shreya",456,"ECE"));
		
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		for(Student s:studentList) {
			if(s.getRollNo()==studentId){
				return s;
			}
		}
		return null;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
		return student;
	}

	@Override
	public Student deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		for(Student s:studentList) {
			if(s.getRollNo()==studentId){
				Student ss = s;
				studentList.remove(s);
				return ss;
			}
		}
		return null;
	}

}
