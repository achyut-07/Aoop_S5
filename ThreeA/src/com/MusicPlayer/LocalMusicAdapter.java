package com.MusicPlayer;

public class LocalMusicAdapter implements SourceMusic {
	
	private LocalMusicPlayer localMusic;
	private String fileLocation;
	
	public LocalMusicAdapter(LocalMusicPlayer localMusic,String fileLocation) {
		this.localMusic=localMusic;
		this.fileLocation=fileLocation;
	}

	
	@Override
	public void play() {
		localMusic.play(fileLocation);
	}

	@Override
	public void stop() {
		localMusic.stop();
		
	}

	@Override
	public void pause() {
		localMusic.pause();
	}

}
