package com.HealthCareMangagement;

public class TherapistProvider implements DoctorType{

	@Override
	public void bookingType(String patientName, String date) {
		System.out.println("Booked  a therapy seesion with therapist for "+patientName+" on "+date);
		
	}

}
