package com.nasifahmed;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> songArrayList = new ArrayList<Song>();

    public Album(String albumName) {
        this.albumName = albumName;
    }

    public Album() {
    }

    public String getAlbumName() {
        return albumName;
    }

    //not checking if already exists
    public void addSongs(String songName, String songDuration)
    {
        songArrayList.add(new Song(songName,songDuration));
    }

    public void getSongList()
    {
        System.out.println("");
        for(Song song: songArrayList)
        {
            System.out.println(song.getSongTitle() + " -- " + song.getSongDuration());
        }
    }

    public Song findSong(String songName)
    {
        for(Song song : songArrayList)
        {
            if(song.getSongTitle().equals(songName))
            {
                return song;
            }
        }
        return null;
    }
    
}
