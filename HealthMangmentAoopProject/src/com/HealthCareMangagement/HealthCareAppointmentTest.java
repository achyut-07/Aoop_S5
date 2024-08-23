package com.HealthCareMangagement;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class HealthCareAppointmentTest {

	@Test
	void testHealthCareAppointmentSchedulesCorrectly() {
        DoctorType doctorProvider = new DentistProvider();
        AppointmentBooking booking = new HealthCareAppointment(doctorProvider);

        String expectedOutput = "Booked an dentist appointment for Mahi on 27-08-2024\n";
        assertEquals(expectedOutput, captureOutput(() -> booking.bookAppointment("Mahi", "27-08-2024")));
    }

    private String captureOutput(Runnable task) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        task.run();

        System.setOut(originalOut);
        return outputStream.toString().replaceAll("\r\n", "\n");
    }

}
