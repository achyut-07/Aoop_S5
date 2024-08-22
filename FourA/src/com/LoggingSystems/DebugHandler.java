package com.LoggingSystems;

public class DebugHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevels level) {
		return level==LogLevels.Debug;
	}

	@Override
	protected void logMsg(String msg) {
		System.out.println("Debug:- "+msg);
	}

}
