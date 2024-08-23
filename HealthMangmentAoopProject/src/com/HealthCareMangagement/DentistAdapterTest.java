package com.HealthCareMangagement;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class DentistAdapterTest {

	@Test
	void testDentistAdapterSchedulesAppointment() {
        DentistAppointment dentistAppointment = new DentistAppointment();
        Appointment adapter = new DentistAdapter(dentistAppointment);

        
        String eo = "Dentist appointment is scheduled for Pawan Achyutanand on 25-08-2024\n";
        assertEquals(eo, captureOutput(() -> adapter.scheduleAppointment("Pawan Achyutanand", "25-08-2024")));
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
