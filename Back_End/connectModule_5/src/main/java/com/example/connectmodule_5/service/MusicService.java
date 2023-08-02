package com.example.connectmodule_5.service;

import com.example.connectmodule_5.model.Music;
import com.example.connectmodule_5.repo.IMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService  implements IMusicService{
    @Autowired
    private IMusicRepo musicRepo;
    @Override
    public List<Music> getListMusic() {
        return musicRepo.findAllMusicWithStatus();
    }

    @Override
    public void add(Music music) {
            musicRepo.addNewSong(music);
    }

    @Override
    public Music findById(Long id) {

        return musicRepo.findById(id);
    }

    @Override
    public void editSong(Long id) {
        musicRepo.editSong(id);
    }

    @Override
    public Music getById(Long id) {
        return musicRepo.getSongById(id);
    }

    @Override
    public List<Music> findByName(String name) {
        return musicRepo.findSongByName(name);
    }
}
