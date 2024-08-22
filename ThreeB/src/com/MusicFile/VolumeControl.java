package com.MusicFile;

public class VolumeControl extends DecoratorMusicPlayer {

	public VolumeControl(MusicPlayer dmp) {
		super(dmp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		super.play();
		adjustVolume();
	}
	
	private void adjustVolume() {
        System.out.println("Volume is being adjusted to your taste.");
    }

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		
	}

}
