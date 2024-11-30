package com.agendabackend.agenda_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendabackend.agenda_backend.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
