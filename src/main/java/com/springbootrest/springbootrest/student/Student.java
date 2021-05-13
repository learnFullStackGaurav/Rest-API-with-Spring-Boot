package com.springbootrest.springbootrest.student;

public class Student {
	
	private String studentName;
	private int rollNo;
	private String branch;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int rollNo, String branch) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", branch=" + branch + "]";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
