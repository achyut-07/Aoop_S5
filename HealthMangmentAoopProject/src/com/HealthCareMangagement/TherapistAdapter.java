package com.HealthCareMangagement;

public class TherapistAdapter implements Appointment{
	private TherapistAppointment ta;
	
	public TherapistAdapter(TherapistAppointment ta) {
		this.ta=ta;
	}

	@Override
	public void scheduleAppointment(String patientName, String date) {
		ta.bookTherapistAppointment(patientName, date);		
	}

}
