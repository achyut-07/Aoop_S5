package com.SrpEmployeeSystem;

public class MainSrp {
	public static void main(String[] args) {
			Employee emp1=new Employee("Achyutanand","Manager");
			Employee emp2=new Employee("Sachidanand","Developer");
			Employee emp3=new Employee("Chaitanyanand","Tester");
			SalaryCalculator sc=new SalaryCalculator();
			System.out.println(emp1.getName()+"'s salary as "+emp1.getRole()+" is "+sc.CalculateSalary(emp1));
			System.out.println(emp2.getName()+"'s salary as "+emp2.getRole()+" is "+sc.CalculateSalary(emp2));
			System.out.println(emp3.getName()+"'s salary as "+emp3.getRole()+" is "+sc.CalculateSalary(emp3));
	}

}
