package com.HealthCareMangagement;

public class DentistAdapter implements Appointment{
	private DentistAppointment Dta;
	
	public DentistAdapter(DentistAppointment Dta) {
		this.Dta=Dta;
	}

	@Override
	public void scheduleAppointment(String patientName, String date) {
		Dta.bookDentistAppointment(patientName, date);
	}

}
