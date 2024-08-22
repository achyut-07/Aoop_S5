package com.MusicPlayer;

public class LocalMusicPlayer {
	
	public void play(String mp3location) {
		System.out.println("Playing give music mp3.file:- "+mp3location);
	}
	
	public void pause() {
		System.out.println("Paused the current music file");
	}
	
	public void stop() {
		System.out.println("Stopped the current playing music");
	}

}
