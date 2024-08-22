package com.StudentInformationSystem;

public class EnrollService implements EnrollmentService{

	@Override
	public void enroll(Student stu, Courses course) {
		course.enrollStudents(stu);
		System.out.println("Student " + stu.getName() + " is enrolled sucessfuly for the course " + course.getcourseName());
	}

}
