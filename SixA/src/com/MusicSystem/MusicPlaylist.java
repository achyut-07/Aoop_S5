package com.MusicSystem;
import java.util.*;
public class MusicPlaylist {
	
	private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added the song: " + song);
    }
	
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed the song: " + song);
        } 
        else {
            System.out.println("Song not found: " + song);
        }
    }
    
    public void moveSong(String song, int newPosition) {
        if (playlist.contains(song)){
            playlist.remove(song); 
            playlist.add(newPosition - 1, song);
            System.out.println("Moved song: " + song + " to position " + newPosition);
        } 
        else{
            System.out.println("Song not found: " + song);
        }
    }
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            ListIterator<String> iterator = playlist.listIterator();
            int index = 1;
            while (iterator.hasNext()) {
                System.out.println(index++ + ". " + iterator.next());
            }
        }
    }

}
