package com.LoggingSystems;

public class LogCommand implements Command{
	private LogHandler handle;
	private LogLevels level;
	
	public LogCommand(LogHandler handle,LogLevels level) {
		this.handle=handle;
		this.level=level;
	}
	

	@Override
	public void executes(String msg) {
		handle.handleRequest(level,msg);
		
	}
	
	

}
