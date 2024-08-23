package com.HealthCareMangagement;

public class FollowUpDecorator extends AppointmentDecorator{

	public FollowUpDecorator(Appointment wrraping) {
		super(wrraping);
		// TODO Auto-generated constructor stub
	}
	public void scheduleAppointment(String patientName, String dateTime) {
        super.scheduleAppointment(patientName, dateTime);
        scheduleFollowUp(patientName);
    }
	
	private void scheduleFollowUp(String patientName) {
        System.out.println("These is an Follow-up scheduled for " + patientName);
    }

}
