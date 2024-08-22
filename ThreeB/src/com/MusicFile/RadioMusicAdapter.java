package com.MusicFile;

public class RadioMusicAdapter implements MusicSource {
	private RadioMusicPlayer rmp;
	
	public RadioMusicAdapter(RadioMusicPlayer rmp) {
		this.rmp=rmp;
	}
	@Override
	public void play() {
		rmp.turnOn();
		
	}

	@Override
	public void stop() {
		rmp.turnOff();
	}

	@Override
	public String getMusicInfo() {
		return rmp.getstationName();
	}

}
