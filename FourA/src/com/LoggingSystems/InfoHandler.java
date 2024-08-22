package com.LoggingSystems;

public class InfoHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevels level) {
		return level==LogLevels.Info;
	}

	@Override
	protected void logMsg(String msg) {
		System.out.println("Info:- "+msg);
		
	}

}
