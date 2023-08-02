package com.example.connectmodule_5.service;

import com.example.connectmodule_5.model.Status;
import com.example.connectmodule_5.repo.IStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements IStatusService{
    @Autowired
    private IStatusRepo statusRepo;

    @Override
    public List<Status> getListStatus() {
        return statusRepo.findAllListStatus();
    }

    @Override
    public Status findById(Long id) {
        return statusRepo.findById(id);
    }
}
