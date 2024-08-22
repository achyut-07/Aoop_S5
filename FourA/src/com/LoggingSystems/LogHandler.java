package com.LoggingSystems;

public abstract  class LogHandler {
	
	protected LogHandler nextHandler;
	public void setNextHandler(LogHandler nextHandler) {
		this.nextHandler=nextHandler;
	}
	public void handleRequest(LogLevels level,String msg) {
		if(canHandle(level)){
			logMsg(msg);
		  }
		else if(nextHandler!=null) {
				nextHandler.handleRequest(level, msg);
		}
	}
	
	protected abstract boolean canHandle(LogLevels level);
	protected abstract void logMsg(String msg);
		

}
