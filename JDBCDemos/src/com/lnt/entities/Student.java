package com.lnt.entities;

import java.util.Date;

public class Student {
	int studId;
	String name;
	Date dob;
	int marks;
	public Student(int studId, String name, Date dob, int marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", dob=" + dob + ", marks=" + marks + "]";
	}
	
}
