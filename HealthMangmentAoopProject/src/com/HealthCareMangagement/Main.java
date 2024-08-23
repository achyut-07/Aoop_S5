package com.HealthCareMangagement;

public class Main {
	
	public static void main(String[] args) {
		//Adapter pattern
		Appointment doctorsShedule=new DentistAdapter(new DentistAppointment());
		doctorsShedule=new ReminderDecorator(doctorsShedule);
		doctorsShedule=new FollowUpDecorator(doctorsShedule);
		doctorsShedule.scheduleAppointment("Pawan Achyutanand", "25-08-2024");
		//bridge pattern
		DoctorType doctorProvider = new DentistProvider();
		AppointmentBooking booking = new HealthCareAppointment(doctorProvider);
		booking.bookAppointment("Mahi","27-08-2024");
		
	}

}
