package com.agendabackend.agenda_backend.dtos;

import java.time.LocalDateTime;

import javax.swing.Spring;

public record AgendaResponse(
    Long id,
    String title,
    String description,
    LocalDateTime date_hora,
    Spring local
) {
    
}
