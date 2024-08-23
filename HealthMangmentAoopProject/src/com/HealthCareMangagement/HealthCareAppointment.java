package com.HealthCareMangagement;

public class HealthCareAppointment extends AppointmentBooking{

	public HealthCareAppointment(DoctorType doctorType) {
		super(doctorType);
	}

	@Override
	public void bookAppointment(String patientName, String date) {
		// TODO Auto-generated method stub
		doctorType.bookingType(patientName,date);
	}

}
