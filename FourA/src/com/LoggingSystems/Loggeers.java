package com.LoggingSystems;
import java.util.*;

public class Loggeers {
	
	private ArrayList<Command> commands = new ArrayList<>();
	public void addCommands(Command command) {
		commands.add(command);
	}
	public void process() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.executes("Logging The Message.......");
        }
    }

}
