package com.springbootrest.springbootrest.servicestudent;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Sides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.dao.CourseDao;
import com.springbootrest.springbootrest.student.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	//public List<Student> studentList;
	
	@Autowired
	private CourseDao courseDao;
	
	public StudentServiceImpl() {
		
		//studentList = new ArrayList< >();
		//studentList.add(new Student("Gaurav",123,"CSE"));
		//studentList.add(new Student("Shreya",456,"ECE"));
		
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		//return studentList;
		return courseDao.findAll();
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		//for(Student s:studentList) {
		//	if(s.getRollNo()==studentId){
		//		return s;
		//	}
		//}
		return courseDao.getOne(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		//studentList.add(student);
		courseDao.save(student);
		return student;
	}

	@Override
	public Student deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		//for(Student s:studentList) {
		//	if(s.getRollNo()==studentId){
		//		Student ss = s;
		//		studentList.remove(s);
		//		return ss;
		//	}
		//}
		Student student = courseDao.getOne(studentId);
		courseDao.delete(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		courseDao.save(student);
		return student;
	}
	

}
