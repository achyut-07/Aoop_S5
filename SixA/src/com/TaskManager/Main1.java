package com.TaskManager;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		TaskImplementation ti=new TaskImplementation();
		Scanner sc=new Scanner(System.in);
		int choice=1;
		while (choice != 5) {
			System.out.println("\nTask Management System");
            System.out.println("1.Add Task");
            System.out.println("2.Update Task");
            System.out.println("3.Remove Task");
            System.out.println("4.Display Tasks");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:- ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:ti.addTask();
			       break;
			case 2:ti.updateTask();
		            break; 
			case 3:ti.removeTask();
			       break;
			case 4:ti.displayTask();
			        break;
			case 5:System.out.println("Exiting the task manager ");
			       break;
			default : System.out.println("Wrong choice retry");       
			}
		}
	}

}
