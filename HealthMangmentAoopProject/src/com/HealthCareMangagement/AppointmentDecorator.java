package com.HealthCareMangagement;

public abstract class AppointmentDecorator implements Appointment{
	protected Appointment wrraping;
	
	public AppointmentDecorator(Appointment wrraping) {
		this.wrraping=wrraping;
	}
	
	public void scheduleAppointment(String patientName,String date) {
		wrraping.scheduleAppointment(patientName, date);
	}
	

}
