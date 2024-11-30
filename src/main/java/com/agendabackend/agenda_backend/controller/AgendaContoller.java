package com.agendabackend.agenda_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendabackend.agenda_backend.dtos.AgendaRequest;
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

@GetMapping("{id}")
public ResponseEntity<AgendaResponse> getAgenda(@PathVariable Long id){
    return ResponseEntity.ok(service.getAgendaById(id));
}

@PostMapping
public ResponseEntity<AgendaResponse> saveAgenda(@Validated @RequestBody AgendaRequest agenda) {
    AgendaResponse newAgenda = service.save(agenda);
    return ResponseEntity.created(null).body(newAgenda);
}

public ResponseEntity<Void> updateAgenda(@PathVariable Long id, 
                                         @Validated @RequestBody AgendaRequest agenda) {
    service.update(agenda, id);
    return ResponseEntity.ok().build();
}
}
