package Assignment5Collection.MusicPlayer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Playlist {

    String song;

    private Set<String> songs = new LinkedHashSet<>();



    public void addSong(String song){
        if (songs.add(song)){
            System.out.println("Added song : " + song);
        }else {
            System.out.println("Song already exists");
        }
    }

    public void removeSong(String song){
        if (songs.remove(song)){
            System.out.println("Removed song : " + song);
        }else {
            System.out.println("Song does not exist");
        }
    }

    public boolean contains(String song){
        if (songs.contains(song)){
            return true;
        }else  {
            return false;
        }
    }

    public void display(){
        System.out.println("List of songs in playlist");
        int i = 1;
        for (String s: songs){
            System.out.println(i++ + " " + s);
        }
    }

    public int size(){
        return songs.size();
    }
}
