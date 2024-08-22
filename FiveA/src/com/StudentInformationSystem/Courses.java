package com.StudentInformationSystem;

import java.util.*;
public class Courses {
	
	private String courseId;
	private String courseName;
	private ArrayList<Student> enrolledStudents;
	
	public Courses(String courseId,String courseName) {
		this.courseId=courseId;
		this.courseName=courseName;
		this.enrolledStudents=new ArrayList<>();
	}
	
	public String getcourseId() {
		return courseId;
	}
	
	public String getcourseName() {
		return courseName;
	}
	
	public ArrayList<Student> getenrolledStudents(){
		return enrolledStudents;
	}
	
	public void enrollStudents(Student stu) {
		enrolledStudents.add(stu);
	}

}
