package com.MusicFile;

public class Equalizer extends DecoratorMusicPlayer {

	public Equalizer(MusicPlayer dmp) {
		super(dmp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		super.play();
		 setEqualizer();
	}
	private void setEqualizer() {
        System.out.println("Equalizer settings are applied to music.");
    }
	@Override
	public void Stop() {
		// TODO Auto-generated method stub	
	}

	

}
