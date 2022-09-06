package com.pausiber.spotiky.service;

import com.pausiber.spotiky.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongService {

    List<Song> songList = new ArrayList<>();
    public List<Song> getAllSongs() {
        return songList;
    }

    public Song getSongById(Long id) {

        return songList.stream().filter(song -> song.getId() == id).findFirst().orElseThrow();
    }

    public String updateSong(long id, Song newSong) {

        Song foundSong = songList.stream().filter(song -> song.getId() == id).findFirst().orElseThrow();

        foundSong.setSongName(newSong.getSongName());

        return foundSong.getId() + " id'li şarkı güncellendi";
    }

    public String deleteSong(long id) {

        return "";
    }
}
