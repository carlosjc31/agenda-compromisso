package com.agendabackend.agenda_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendabackend.agenda_backend.dtos.AgendaResponse;
import com.agendabackend.agenda_backend.services.AgendaService;

@RestController
@RequestMapping("agendas")
public class AgendaContoller {
    
    @Autowired
    private AgendaService service;

@GetMapping
public ResponseEntity<List<AgendaResponse>> getAgendas(){
    return ResponseEntity.ok(service.getAllAgenda());
}


}
