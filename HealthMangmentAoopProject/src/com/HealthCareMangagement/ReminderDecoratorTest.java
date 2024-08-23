package com.HealthCareMangagement;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class ReminderDecoratorTest {

	@Test
	void testReminderDecoratorAddsReminder() {
        Appointment baseAppointment = new DentistAdapter(new DentistAppointment());
        Appointment reminderAppointment = new ReminderDecorator(baseAppointment);

        String expectedOutput = "Dentist appointment is scheduled for Pawan Achyutanand on 25-08-2024\n" +
                "These an remainder for Pawan Achyutanand having an appointment on 25-08-2024\n";

        assertEquals(expectedOutput, captureOutput(() -> reminderAppointment.scheduleAppointment("Pawan Achyutanand", "25-08-2024")));
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
