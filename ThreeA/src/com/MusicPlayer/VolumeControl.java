package com.MusicPlayer;

public class VolumeControl extends SourceMusicDecorator{

	public VolumeControl(SourceMusic dms) {
		super(dms);
		// TODO Auto-generated constructor stub
	}
	
	public void play() {
        super.play();
        setVolume();
    }

    private void setVolume() {
        System.out.println("Setting the volume");
    }

}
