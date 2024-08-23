package com.HealthCareMangagement;

public class ReminderDecorator extends AppointmentDecorator{

	public ReminderDecorator(Appointment wrraping) {
		super(wrraping);
	}
	
	public void scheduleAppointment(String patientName,String date) {
		super.scheduleAppointment(patientName, date);
		sendReminder(patientName, date);
	}
	
	private void sendReminder(String patientName,String date) {
		System.out.println("These an remainder for "+patientName+" having an appointment on "+date);
	}

}
