package com.example.connectmodule_5.model;

import javax.persistence.*;

@Entity
@Table(name="status_music")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id_status;
    @Column(name="name_of_status")
    private String nameOfStatus;

    public Status(int id_status, String nameOfStatus) {
        this.id_status = id_status;
        this.nameOfStatus = nameOfStatus;
    }

    public Status() {
    }

    public int getId() {
        return id_status;
    }

    public void setId(int id) {
        this.id_status = id;
    }

    public String getName() {
        return nameOfStatus;
    }

    public void setName(String name) {
        this.nameOfStatus = name;
    }
}
