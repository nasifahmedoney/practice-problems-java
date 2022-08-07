package com.nasifahmed;

public class Main {

    public static void main(String[] args) {

        //user options
        //display list of albums to select from
        //selected album will display the list of songs to add to the playlist
        //user input for displaying albumlist to add more songs from albums or display the playlist
        //user input for start playing a song, quit, repeat, play next song from the playlist


        //no user input
        //create album
        //add songs to the album
        //user parameters to creating albums and adding songs with their duration


        Playlist playlist = new Playlist();
        playlist.createAlbum("album1");
        playlist.createAlbum("album2");
        playlist.addSongsToAlbum("album1","song1","5:00");
        playlist.addSongsToAlbum("album1","song2","3:00");
        playlist.addSongsToAlbum("album2","song1","4:00");
        playlist.addSongsToAlbum("album2","song2","5:00");


        playlist.userFunctions();
    }
}
