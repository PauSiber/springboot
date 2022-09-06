package com.pausiber.spotiky.controller;

import com.pausiber.spotiky.model.Song;
import com.pausiber.spotiky.model.User;
import com.pausiber.spotiky.service.SongService;

import java.util.List;

public class SongController {

    SongService songService;

    public List<Song> getAllSongs(){
        return songService.getAllSongs();
    }

    public Song getSongById(Long id){
        return songService.getSongById(id);
    }

    public String updateSong(long id, Song newSong){
        return songService.updateSong(id,newSong);
    }

    public String deleteSong(long id){
        return songService.deleteSong(id);
    }
}
