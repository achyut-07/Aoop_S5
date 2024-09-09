package com.MusicSystem;

public class Main {
	
	public static void main(String[] args) {
		MusicPlaylist User = new MusicPlaylist();
		User.addSong("Tum hi ho");
		User.addSong("Avesham");
		User.addSong("Ganesh aarti");
		User.addSong("Dhere Dhere se");
		User.displayPlaylist();
		User.removeSong("Tum hi ho");
        User.displayPlaylist();
        User.moveSong("Dhere Dhere se", 1);
        User.displayPlaylist();
	}

}
