package com.MusicFile;

public abstract class DecoratorMusicPlayer extends MusicPlayer {
	protected MusicPlayer dmp;
	public DecoratorMusicPlayer(MusicPlayer dmp) {
		super(dmp.ms);
		this.dmp=dmp;
	}
	
	public void play() {
		dmp.play();
	}
	public void stop() {
		dmp.Stop();
	}

}
