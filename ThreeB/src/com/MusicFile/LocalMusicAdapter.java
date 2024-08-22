package com.MusicFile;

public class LocalMusicAdapter implements MusicSource{
	private LocalMusicPlayer lmp;
	
	public LocalMusicAdapter(LocalMusicPlayer lmp) {
		this.lmp=lmp;
	}
	@Override
	public void play() {
		lmp.playing();
	}

	@Override
	public void stop() {
		lmp.Stop();
		
	}

	@Override
	public String getMusicInfo() {
		return lmp.getSongName();
		
	}

}
