package com.LoggingSystems;

public class ErrorHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevels level) {
		return level==LogLevels.Error;
	}

	@Override
	protected void logMsg(String msg) {
		System.out.println("Error:- "+msg);
		
	}
	

}
