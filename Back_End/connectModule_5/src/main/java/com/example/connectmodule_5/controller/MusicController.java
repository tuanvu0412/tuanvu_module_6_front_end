package com.example.connectmodule_5.controller;

import com.example.connectmodule_5.model.Music;
import com.example.connectmodule_5.model.Status;
import com.example.connectmodule_5.service.IMusicService;
import com.example.connectmodule_5.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/music")
@CrossOrigin("*")
public class MusicController {
    @Autowired
    private IMusicService musicService;
    @Autowired
    private IStatusService statusService;

    @GetMapping()
    public ResponseEntity<?> getListBlogs() {
        List<Music> music=musicService.getListMusic();
        return new ResponseEntity<>(music, HttpStatus.OK);
    }
    @GetMapping("/status")
    public  ResponseEntity<List<Status>> getListStatus(){
        return new ResponseEntity<>(statusService.getListStatus(),HttpStatus.OK);
    }

    @GetMapping("/status/{id}")
    public ResponseEntity<?> getIdStatus(@PathVariable Long id) {
        if (statusService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.statusService.findById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
    @GetMapping("{id}")
    public ResponseEntity<?> getMusic(@PathVariable Long id) {
        if (musicService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            this.musicService.findById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createBlog( @RequestBody Music music) {
        this.musicService.add(music);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBlogs(@RequestBody Music music, @PathVariable Long id) {
        if (musicService.getById(id) != null) {
            musicService.editSong(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/search/{search}")
    public ResponseEntity<List<Music>> search(@PathVariable(name="search") String search) {
        List<Music> musicList = musicService.findByName(search);
        if(musicList.size()==0){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(musicList,HttpStatus.OK);
        }
    }
}
