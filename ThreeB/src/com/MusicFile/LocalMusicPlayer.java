package com.MusicFile;

public class LocalMusicPlayer {
	
	private String fileName;
	public LocalMusicPlayer(String fileName) {
		this.fileName=fileName;
	}
	
	public void playing() {
		System.out.println("Playing the music from system:- "+fileName);
	}
	public void Stop() {
		System.out.println("Stope Playing the music");
	}
	public String getSongName() {
        return fileName;
    }
 
}
