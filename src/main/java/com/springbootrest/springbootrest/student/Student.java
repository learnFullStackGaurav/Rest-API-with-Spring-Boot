package com.springbootrest.springbootrest.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private String studentName;
	@Id
	private int id;
	private String branch;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int id, String branch) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", branch=" + branch + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
