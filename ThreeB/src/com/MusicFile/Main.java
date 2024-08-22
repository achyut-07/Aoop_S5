package com.MusicFile;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MusicPlayer p=null;
		while(true) {
			System.out.println("___Music Player___");
			System.out.println("1.Play System file");
			System.out.println("2.play Online");
			System.out.println("3.play Radio Music");
			System.out.println("4.Exit the application");
			System.out.print("Enter Your choice:- ");
			int ele=sc.nextInt();
			sc.nextLine();
			switch(ele) {
			case 1:p=localFile();
			       break;
			case 2:p=onlineMusic();
		           break; 
			case 3:p=radioMusic();
			       break;
			case 4:System.out.println("Exiting the application....");
			       return;
			case 5:System.out.println("Wtong choice re enter");
			       continue;
			}
			if(p!=null) {
				p.play();
				System.out.println("please type s to stop music");
				sc.nextLine();
				p.Stop();
			}
		}
	}
	
	public static MusicPlayer localFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your file path:- ");
		String s=sc.nextLine();
		LocalMusicPlayer lmp=new LocalMusicPlayer(s);
		MusicSource localfile=new LocalMusicAdapter(lmp);
		MusicPlayer p=new BasicPlayer(localfile);
		p=new Equalizer(p);
		p=new VolumeControl(p);
		return p;
	}
     
	public static MusicPlayer onlineMusic() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your song name:- ");
		String s=sc.nextLine();
		OnlineMusicPlayer omp=new OnlineMusicPlayer(s);
		MusicSource os=new OnlineMusicAdapter(omp);
		MusicPlayer p=new BasicPlayer(os);
		p=new Equalizer(p);
		p=new VolumeControl(p);
		return p;
	}
	public static MusicPlayer radioMusic() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your radio station name:- ");
		String s=sc.nextLine();
		RadioMusicPlayer rmp=new RadioMusicPlayer(s);
		MusicSource rs=new RadioMusicAdapter(rmp);
		MusicPlayer p=new BasicPlayer(rs);
		p=new Equalizer(p);
		p=new VolumeControl(p);
		return p;
	}
}
