package com.MusicFile;

public class RadioMusicPlayer {
	private String stationName;
	
	public RadioMusicPlayer(String stationName) {
		this.stationName=stationName;
	}
	public void turnOn() {
		System.out.println("Playing music from given staion:- "+stationName);
	}
	public void turnOff() {
		System.out.println("Stoped playing music from radio");		
	}
	public String getstationName() {
		return stationName;
	}

}
