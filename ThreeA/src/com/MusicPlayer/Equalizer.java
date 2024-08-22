package com.MusicPlayer;

public class Equalizer extends SourceMusicDecorator{

	public Equalizer(SourceMusic dms) {
		super(dms);
	}
	
	public void play() {
		super.play();
		setEqualizer();
	}

	public void setEqualizer() {
		System.out.println("Setting the Equalizer");
	}
}
