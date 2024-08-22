package com.LoggingSystems;

public class Main {
	public static void main(String[] args) {
		LogHandler Ih= new InfoHandler();
		LogHandler Dh= new DebugHandler();
		LogHandler Eh= new ErrorHandler();
		Ih.setNextHandler(Dh);
		Dh.setNextHandler(Eh);
		LogCommand Ic=new LogCommand(Ih,LogLevels.Info);
		LogCommand Dc=new LogCommand(Dh,LogLevels.Debug);
		LogCommand Ec=new LogCommand(Eh,LogLevels.Error);
		 Loggeers logger=new Loggeers();
		 logger.addCommands(Ic);
		 logger.addCommands(Dc);
		 logger.addCommands(Ec);
		 
		 logger.process();
		
	}

}
