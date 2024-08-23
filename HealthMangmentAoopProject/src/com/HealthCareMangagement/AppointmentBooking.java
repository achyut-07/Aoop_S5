package com.HealthCareMangagement;

public abstract class AppointmentBooking {
	protected DoctorType doctorType;
	protected AppointmentBooking(DoctorType doctorType) {
		this.doctorType=doctorType;
	}
	
	public abstract void bookAppointment(String patientName,String date);

}
