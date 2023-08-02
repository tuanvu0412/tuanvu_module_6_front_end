package com.example.connectmodule_5.repo;

import com.example.connectmodule_5.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStatusRepo extends JpaRepository<Status, Integer> {
    @Query(value = "SELECT * FROM status_music", nativeQuery = true)
    List<Status> findAllListStatus();

    @Query(value = "SELECT * FROM status_music WHERE id_status = :id", nativeQuery = true)
    Status findById(@Param("id") Long id);
}
