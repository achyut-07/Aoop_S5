package com.SrpEmployeeSystem;

public class SalaryCalculator {
	
	public double CalculateSalary(Employee emp) {
		String role=emp.getRole();
		double salary;
		switch(role) {
		case "Manager" : salary=50000;
		                 break;
		case "Developer": salary=45000;
                         break; 
		case "Tester"  : salary=32000;
		                 break;
		default : salary=25650;
		          break;
			
		}
		return salary;
	}

}
