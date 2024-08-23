package com.HealthCareMangagement;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class FollowUpDecoratorTest {

	@Test
	void testFollowUpDecoratorAddsFollowUp() {
        Appointment baseAppointment = new DentistAdapter(new DentistAppointment());
        Appointment followUpAppointment = new FollowUpDecorator(baseAppointment);

        String expectedOutput = "Dentist appointment is scheduled for Pawan Achyutanand on 25-08-2024\n" +
                "These is an Follow-up scheduled for Pawan Achyutanand\n";

        assertEquals(expectedOutput, captureOutput(() -> followUpAppointment.scheduleAppointment("Pawan Achyutanand", "25-08-2024")));
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
