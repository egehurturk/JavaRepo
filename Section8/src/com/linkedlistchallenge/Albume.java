/**
* @author: Ege Hurturk
* @version: 1.0
*/


package com.linkedlistchallenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Albume {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private String albumeName;
    private double albumeDuration;

    // overloaded constructor for default args
    public Albume() {
        this("Unnamed Albume", 0.0);
    }

    /** constructor
    @param: String albumeName
    @param: double albumeDuration
     */
    public Albume(String albumeName, double albumeDuration) {
        this.albumeName = albumeName;
        this.albumeDuration = albumeDuration;
    }


    /** AddSongToPlaylist - adds song to the given playlist
    @param: int trackNo: track number belongs to a song in an albume
    @param: LinkedList<Song> playlist: playlist that consists of @code{Song} objects
    @returns: boolean
     */
    public boolean addSongToPlaylist(int trackNo, LinkedList<Song> playlist) {
        int index = trackNo - 1;
        if ((trackNo >= 0)&&trackNo <= this.songs.size() ) {
            playlist.add(this.songs.get(index));
            System.out.println("Track " + trackNo + " added to the playlist");
            return true;
        }
        return false;
    }

    /** addSongToPlaylist - adds song to the given playlist (Overloaded)
    @param: @code{Song} object
    @param: LinkedList<Song> playlist: Playlist that consist of @code{Song} objects
    @returns: boolean
     */
    public boolean addSongToPlaylist(Song song, LinkedList<Song> playlist) {
        if (song.getDuration() < 0) {
            return false;
        }
        for (Song single:
             playlist) {
            if (song.getTitle().equals(single.getTitle())) {
                System.out.println("Song " + song.getTitle() + " already exists on playlist");
                return false;
            }
        }
        return true;
    }


    /** CRUD add song functionality - add song to albume
    @param: Song song: Song object that @{addSong()} will add
    @returns: boolean
     */
    public boolean addSong(Song song) {
        if (song.getDuration() <= 0) {
            System.out.println("Invalid credentials for a song, duration cannot be less than 0");
            return false;
        }
        songs.add(song);
        return true;
    }

    /** 
    @see: {@code(addSong(Song song))}
    @param: String name: name of the song
    @param: double duration: duration of the song
    @returns: boolean
     */
    public boolean addSong(String name, double duration) {
        if(duration <= 0) {
            System.out.println("Invalid credentials for a song, duration cannot less than 0");
            return false;
        }
        Song newSong = new Song(name, duration);
        songs.add(newSong);
        return true;
    }

    /** CRUD update functionalty - udpate Albume
    @param Song song: old song object that @code{updateSong()} will find
    @param Song newSong: new Song object
    @returns: boolean
     */
    public boolean updateSong(Song song, Song newSong) {
        int position = findSong(song);
        if (position < 0) {
            System.out.println("Song not found, please check if the song exists or create another one");
            return false;
        }
        this.songs.set(position, newSong);
        System.out.println(song.getTitle() + ", was replaced with " + newSong.getTitle());
        return true;
    }

    /**
    @see: {@code(updateSong(Song song, Song newSong))}
    @param: String oldTitle: old title for old song
    @param: String newTitle: new title for new song
    @param: double newDuration: new duration for that song
    @returns: boolean
     */
    public boolean updateSong(String oldTitle, String newTitle, double newDuration) {
        int pos = findSong(oldTitle);
        if (pos < 0) {
            System.out.println("Song not found, please check is the song exists or create another one");
            return false;
        }
        Song song = new Song(newTitle, newDuration);
        this.songs.set(pos, song);
        return true;
    }


    /** private findSong() to find songs inside an Albume
    @param: Song song: song object that @code{findSong()} will find
    @returns: int: position that is find in Albume
     */
    private int findSong(Song song) {
        return this.songs.indexOf(song);
    }

    /** private findSong() - overloaded
    @param: String title: the title that @code{findSong()} will search for
    @returns: int: position of the title
     */
    private int findSong(String title) {
        for(int i=0; i<this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if(song.getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    /** CRUD remove - removes a song in Albume
    @param: Song song: song object that we want to remove
    @returns: boolean
     */
    public boolean remove(Song song) {
        int pos = findSong(song);
        if (pos < 0) {
            System.out.println("Song does not exists.");
            return false;
        }
        this.songs.remove(pos);
        System.out.println("Removed succesfully");
        return true;
    }

    /** Overloaded - @code{remove()}
    @param: String name: name that we want to remove
    @returns: boolean
     */
    public boolean remove(String name){
        int pos = findSong(name);
        if (pos < 0) {
            System.out.println("Song does not exists");
            return false;
        }
        this.songs.remove(pos);
        System.out.println("Removed succesfully");
        return true;
    }

    /** prints the songs in a formatted way
    @param: None
    @returns: None
     */
    public void printSongs() {
        System.out.println("Song List");
        for(int i=0; i<this.songs.size(); i++) {
            System.out.println((i+1) + "." +
                    this.songs.get(i).getTitle() + " -> " +
                    this.songs.get(i).getDuration());
        }

    }

    // Getters

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getAlbumeName() {
        return albumeName;
    }

    public double getAlbumeDuration() {
        return albumeDuration;
    }

    // Setters

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void setAlbumeName(String albumeName) {
        this.albumeName = albumeName;
    }

    public void setAlbumeDuration(double albumeDuration) {
        this.albumeDuration = albumeDuration;
    }
}
