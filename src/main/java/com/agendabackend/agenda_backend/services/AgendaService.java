package com.agendabackend.agenda_backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agendabackend.agenda_backend.dtos.AgendaResponse;
import com.agendabackend.agenda_backend.mappers.AgendaMapper;
import com.agendabackend.agenda_backend.repositories.AgendaRepository;

@Service
public class AgendaService {
    
    @Autowired
    private AgendaRepository repository;

    public List<AgendaResponse> getAllAgenda(){
        return repository.findAll().stream().map(a -> AgendaMapper.toDTO(a)).collect(Collectors.toList());
    }
}
