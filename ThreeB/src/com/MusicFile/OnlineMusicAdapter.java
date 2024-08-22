package com.MusicFile;

public class OnlineMusicAdapter implements MusicSource {
	private OnlineMusicPlayer omp;
	
	public OnlineMusicAdapter(OnlineMusicPlayer omp) {
		this.omp=omp;
	}
	@Override
	public void play() {
		omp.playMusic();
	}

	@Override
	public void stop() {
		omp.StopMusic();
	}

	@Override
	public String getMusicInfo() {
		return omp.getcurrentMusic();
	}

}
