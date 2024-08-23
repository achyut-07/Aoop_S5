package com.HealthCareMangagement;

public class DoctorAdapter implements Appointment{
	private DoctorAppointment da;
	
	public DoctorAdapter(DoctorAppointment da) {
		this.da=da;
	}

	@Override
	public void scheduleAppointment(String patientName, String date) {
		da.bookDoctorAppointment(patientName, date);
	}

}
