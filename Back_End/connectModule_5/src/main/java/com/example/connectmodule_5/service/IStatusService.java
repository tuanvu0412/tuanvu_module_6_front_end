package com.example.connectmodule_5.service;

import com.example.connectmodule_5.model.Status;

import java.util.List;

public interface IStatusService {
    List<Status> getListStatus();

    Status findById(Long id);
}
