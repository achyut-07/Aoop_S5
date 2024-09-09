package com.TaskManager;
import java .util.*;
public class TaskImplementation {
	private ArrayList<String> tsk;
	private Scanner sc;
	public TaskImplementation() {
		 tsk=new ArrayList<>();
		 sc=new Scanner(System.in);
	}
	public void addTask() {
		System.out.print("Enter Your Task Description:- ");
		String msg=sc.nextLine();
		tsk.add(msg);
		System.out.println("Your task is added to your work list");
	}
	public void displayTask() {
		if(tsk.isEmpty()) {
			System.out.println("There are no tasks to show you are all clear :)");
		}
		else {
			int i=1;
			for(String ele:tsk) {
				System.out.println(i+". "+ele);
				i++;
			}
		}
	}
	public void updateTask() {
		displayTask();
	    System.out.print("Enter the task no you want to update:- ");
	    int n=sc.nextInt();
	    sc.nextLine();
	    if(n>0&&n<=tsk.size()) {
	    	System.out.print("Enter the new task that you want to update:-  ");
	    	String msg=sc.nextLine();
	    	tsk.set(n-1, msg);
	        System.out.println("Your task is updated with new task");
	    }
	    else {
	    	System.out.println("Wrong Task Number entered");
	    }	
	}
	
	public void removeTask() {
		displayTask();
	    System.out.print("Enter the task no you want to update:- ");
	    int n=sc.nextInt();
	    if(n>0&&n<=tsk.size()) {
	    	tsk.remove(n-1);
	    }
	    else {
	    	System.out.println("Wrong Task Number entered");
	    }	
	}

}
