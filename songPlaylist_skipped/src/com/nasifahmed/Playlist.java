package com.nasifahmed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Playlist {

    private LinkedList<Song> playlist = new LinkedList<Song>();
    private ArrayList<Album> albumArrayList = new ArrayList<Album>();
    private Scanner scanner = new Scanner(System.in);

    //user functions
    public void userFunctions()
    {
        boolean exit = false;
        while(exit != true)
        {
            displayOptions();
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice)
            {
                case 1:
                    displayAlbumList();break;
                case 2:
                    addSongsToPlaylsit();break;
                case 3:
                    //display playlist -> playlist functions
                case 4:
                    displayOptions();break;
                case 5:
                    System.out.println("Exiting user functions...");
                    exit = true;
                    break;
            }

        }
        //user choice add to playlist

        //display list of albums
        //add songs to playlist->display albumlist and ask user to enter song name or option to
        //go back to the album or display playlist
        //
        //display playlist -> playlist
    }
    //create albums
    public void createAlbum(String albumName)
    {
        for(Album album: albumArrayList)
        {
            if(album.getAlbumName().equals(albumName))
            {
                System.out.println("Album already exists.");
            }
        }
        albumArrayList.add(new Album(albumName));
        System.out.println("Album added.");
    }

    //add songs to album
    public void addSongsToAlbum(String albumName, String songName, String songDuration)
    {
        Album album = findAlbum(albumName);

        if(album != null)
        {
            album.addSongs(songName,songDuration);
        }
        else
        {
            System.out.println("Album not found.");
        }
    }


    public Album findAlbum(String albumName)
    {
        for(Album album: albumArrayList)
        {
            if(album.getAlbumName().equals(albumName))
            {
                return album;
            }
        }
        return null;
    }

    private void displayAlbumList()
    {
        System.out.println("Available Albums:");
        if(albumArrayList.size() == 0)
        {
            System.out.println("No Albums found.");
        }
        else
        {
            for(Album album: albumArrayList)
            {
                System.out.println(album.getAlbumName());
            }
        }
    }

    private boolean displaySongList(String albumName)
    {
        Album album = findAlbum(albumName);
        if(album != null)
        {
            album.getSongList();
            return true;
        }
        else
        {
            System.out.println("album not found.");
            return false;
        }
    }

    private void displayOptions()
    {
        System.out.println("Available options: \n" +
                "1 -> Display Albums \n" +
                "2 -> Add songs to playlist \n" +
                "3 -> Display playlist \n" +
                "4 -> Repeat Options. \n" +
                "5 -> Exit");
    }
    private void addSongsToPlaylsit()// option 2 need corrections
    {
        //Album album = new Album();
        displayAlbumList();
        System.out.println("Type album name to display songs...");
        String albumName = scanner.nextLine();
        boolean albumfound= displaySongList(albumName);
        if(albumfound == false)
        {
            System.out.println("Album not found...returning to available options.");//goes back to switch menu
        }
        else
        {
            System.out.println("type song name to add to playlist..." +
            "\n or type exit to go back to albumlist");
            String songName = scanner.nextLine();
            while(songName != "exit")
            {

                Song song = findSongfromlist(albumName, songName);//problem
                if(song != null)
                {
                    playlist.add(song);
                    System.out.println("Song added to the playlist");
                    System.out.println("type song name to add to playlist..." +
                     "\n or type album to go back to albumlist");
                    songName = scanner.nextLine();
                    while(songName.equals("album"))//while loop
                    {
                        displayAlbumList();
                        System.out.println("type song name to add to playlist..." +
                        "\n or type exit to go back to available options.");
                        songName = scanner.nextLine();
                    }
                    //user input for album list display
                }
                else
                {
                    System.out.println("no song found with this name...");
                    //user input for album list display
                    //user input for entering another song name
                    System.out.println("type song name to add to playlist... "
                     +"\n or type exit to go back to available options.");
                    songName = scanner.nextLine();
                }
            }

        }
    }

    private Song findSongfromlist(String albumName, String songName)
    {
        Album album = findAlbum(albumName);
        Song song = album.findSong(songName);
        return song;
    }
    // option 3


}
