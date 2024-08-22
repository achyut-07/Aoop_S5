package com.StudentInformationSystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student name: ");
		String s=sc.nextLine();
		System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();
        Student stu=new Student(studentId, studentId);
        Courses[] courses = {
                new Courses("23AD2102A", "Database Management Systems"),
                new Courses("23AD2001O", "Artificial Intelligence & Machine Learning"),
                new Courses("23CS2103R", "Advanced Object-Oriented Programming"),
                new Courses("23CS2104N", "Data Structures & Algorithms"),
                new Courses("23CS2105X", "Computer Networks")
            };
        System.out.println("Available Courses for enrollment:");
        for (int i = 0; i < courses.length; i++) {
            System.out.println((i + 1) + ". " + courses[i].getcourseId() + ": " + courses[i].getcourseName());
        }
        System.out.print("Select a course by number (e.g., 1 for Database Management Systems): ");
        int courseChoice = sc.nextInt();
        while (courseChoice < 1 || courseChoice > courses.length) {
            System.out.print("Invalid choice. Please select a valid course number: ");
            courseChoice = sc.nextInt();
        }

        Courses selectedCourse = courses[courseChoice - 1];

        
        EnrollmentService enrollmentService = new EnrollService();
        enrollmentService.enroll(stu, selectedCourse);

        // Display enrolled courses
        System.out.println("Student " + stu.getName() + " is enrolled in:");
        System.out.println(selectedCourse.getcourseId() + ": " + selectedCourse.getcourseName());
	}

}
