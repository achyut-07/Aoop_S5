package com.HealthCareMangagement;

public class DentistProvider implements DoctorType{

	@Override
	public void bookingType(String patientName, String date) {
		System.out.println("Booked an dentist appointment for "+patientName+" on "+date);
		
	}

}
