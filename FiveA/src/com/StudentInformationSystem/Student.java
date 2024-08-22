package com.StudentInformationSystem;

public class Student {
	private String studentId;
	private String name;
	public Student(String studentId,String name) {
		this.studentId=studentId;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public String getstudentId() {
		return studentId;
	}
}
