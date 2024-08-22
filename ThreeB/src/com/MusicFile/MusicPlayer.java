package com.MusicFile;

public abstract class MusicPlayer {
	protected MusicSource ms;
	public MusicPlayer(MusicSource ms) {
		this.ms=ms;
	}
	
	public abstract void play();
	public abstract void Stop();
}
