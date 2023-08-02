package com.example.connectmodule_5.service;

import com.example.connectmodule_5.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMusicService {
    List<Music> getListMusic();
    void add(Music music);
    Music findById(Long id);

    void editSong(Long id);
    Music getById(Long id);
    List<Music> findByName(String name);
}
