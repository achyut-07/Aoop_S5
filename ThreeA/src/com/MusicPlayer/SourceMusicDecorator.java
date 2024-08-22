package com.MusicPlayer;

public abstract class SourceMusicDecorator implements SourceMusic {
	
	protected SourceMusic dms;//for dms=(dms)decorated music source 
	
	public SourceMusicDecorator(SourceMusic dms) {
		this.dms=dms;
	}
	
	@Override
	public void play() {
		dms.play();
	}

	@Override
	public void stop() {
		dms.stop();
		
	}

	@Override
	public void pause() {
		dms.pause();
	}


}
