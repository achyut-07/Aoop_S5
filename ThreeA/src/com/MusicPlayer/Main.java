package com.MusicPlayer;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LocalMusicPlayer lmp=new LocalMusicPlayer();
		SourceMusic sm=new LocalMusicAdapter(lmp,"Music.mp3");
		System.out.println("Enter your prefrences so that music can be played smoothly without any interuption");
		System.out.println("Do you want to add equalizer to your music system yes/no:- ");
		String str=sc.nextLine();
		if("yes".equalsIgnoreCase(str)) {
			sm=new Equalizer(sm);
		}
		System.out.println("Do you want to add volume control to your music system yes/no:- ");
		String str2=sc.nextLine();
		if("yes".equalsIgnoreCase(str2)) {
			sm=new VolumeControl(sm);
		}
		System.out.println("Your responses have been recorded playing music with your choices");
		sm.play();
		
		boolean flag=true;
		while(flag) {
			System.out.println("Type 'pause' to pause the music , 'stop' to stop the music ,'play' to resume back: ");
			String str3=sc.nextLine();
			if("pause".equalsIgnoreCase(str3)) {
				sm.pause();
			}
			else if("play".equalsIgnoreCase(str3)) {
				sm.play();
			}
			else if("stop".equalsIgnoreCase(str3)){
				sm.stop();
				System.out.println("Thankyou for choosing the music system :)");
				flag=false;
			}
			else {
				System.out.println("Unable to understand please type your options properly as shown");
			}
		}
	}

}
