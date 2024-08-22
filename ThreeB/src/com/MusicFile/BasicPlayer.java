package com.MusicFile;

public class BasicPlayer extends MusicPlayer {

	public BasicPlayer(MusicSource ms) {
		super(ms);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		ms.play();
		System.out.println("Playing Music:- "+ms.getMusicInfo());
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		ms.stop();
		System.out.println("Stopped Playing the music.");
	}
	

}
