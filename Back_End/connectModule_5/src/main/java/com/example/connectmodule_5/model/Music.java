package com.example.connectmodule_5.model;

import javax.persistence.*;

@Entity
@Table(name="music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name_of_the_song")
    private String nameOfTheSong;
    @Column(name="name_of_singer")
    private String nameOfSinger;
    @Column(name="name_of_musician")
    private String nameOfMusician;
    @Column(name="time_of_song")
    private String timeOfSong;
    @Column(name="like_of_the_song")
    private String likeOfTheSong;
    @ManyToOne
    @JoinColumn(name="id_status", nullable = false)
    private Status status;

    public Music() {
    }

    public Music(int id, String nameOfTheSong, String nameOfSinger, String nameOfMusician, String timeOfSong, String likeOfTheSong, Status status) {
        this.id = id;
        this.nameOfTheSong = nameOfTheSong;
        this.nameOfSinger = nameOfSinger;
        this.nameOfMusician = nameOfMusician;
        this.timeOfSong = timeOfSong;
        this.likeOfTheSong = likeOfTheSong;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSong() {
        return nameOfTheSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfTheSong = nameOfTheSong;
    }

    public String getNameOfSingle() {
        return nameOfSinger;
    }

    public void setNameOfSingle(String nameOfSingle) {
        this.nameOfSinger = nameOfSingle;
    }

    public String getNameOfMusician() {
        return nameOfMusician;
    }

    public void setNameOfMusician(String nameOfMusician) {
        this.nameOfMusician = nameOfMusician;
    }

    public String getTimeOfSong() {
        return timeOfSong;
    }

    public void setTimeOfSong(String timeOfSong) {
        this.timeOfSong = timeOfSong;
    }

    public String getLikedOfTheSong() {
        return likeOfTheSong;
    }

    public void setLikedOfTheSong(String likedOfTheSong) {
        this.likeOfTheSong = likeOfTheSong;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
