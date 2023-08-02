package com.example.connectmodule_5.repo;

import com.example.connectmodule_5.model.Music;
import com.example.connectmodule_5.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMusicRepo extends JpaRepository<Music, Integer> {
        @Query(value = "select * from music as m inner join status_music on m.id_status = status_music.id_status", nativeQuery = true)
    List<Music> findAllMusicWithStatus();

    @Modifying
    @Query(nativeQuery = true, value = "insert into music (name_of_the_song, name_of_singer, name_of_musician, time_of_song, like_of_the_song, id_status) " +
            "values (:#{#music.name_of_the_song},:#{#music.name_of_singer},:#{#music.name_of_musician},:#{#music.time_of_song},:#{#music.like_of_the_song},:#{#music.id_status});")
    void addNewSong(@Param("music") Music music);

    @Modifying
    @Query(nativeQuery = true, value = "update music " + "set id_status = true where id = :idEdit")
    void editSong(@Param("idEdit") Long idEdit);

    @Query(nativeQuery = true, value = "select * from music where id = :idSearch")
    Music getSongById(@Param("idSearch") Long idSearch);
    @Query(value = "SELECT * FROM music WHERE id = :id", nativeQuery = true)
    Music findById(@Param("id") Long id);
    @Query(nativeQuery = true, value = "select * from music where name like concat('%', :name, '%');")
    List<Music> findSongByName(@Param("name") String name);
}