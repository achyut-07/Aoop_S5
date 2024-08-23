package com.HealthCareMangagement;

public class DoctorProvider implements DoctorType{

	@Override
	public void bookingType(String patientName, String date) {
         System.out.println("Booked Doctor appointment for "+patientName+" on "+date);		
	}
	

}
