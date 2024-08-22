package com.MusicFile;

public class OnlineMusicPlayer {
	private String currentMusic;
	public OnlineMusicPlayer(String currentMusic) {
		this.currentMusic=currentMusic;
	}
	
	public void playMusic() {
		System.out.println("Play the selected Music:- "+currentMusic);
	}
	public void StopMusic() {
		System.out.println("Stoped playing the Music");
	}
    public String getcurrentMusic() {
		return currentMusic;
    }
}
