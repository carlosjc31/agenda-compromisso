package com.agendabackend.agenda_backend.entities;

import java.time.LocalDateTime;

import javax.swing.Spring;

public class Agenda {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime date_hora;
    private Spring local;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getDate_hora() {
        return date_hora;
    }
    public void setDate_hora(LocalDateTime date_hora) {
        this.date_hora = date_hora;
    }
    public Spring getLocal() {
        return local;
    }
    public void setLocal(Spring local) {
        this.local = local;
    }
    
    
}
