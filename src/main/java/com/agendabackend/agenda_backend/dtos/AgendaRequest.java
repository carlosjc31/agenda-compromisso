package com.agendabackend.agenda_backend.dtos;

import java.time.LocalDateTime;

import javax.swing.Spring;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AgendaRequest(
    @NotBlank(message = "O título é obrigatório")
    @Size(min = 3, message = "O título deve ter no mínimo 3 caracteres")
    String title,

    @NotBlank(message = "A descrição é obrigatória")
    String description,
    
    @NotBlank(message = "A data e hora é obrigatória")
    LocalDateTime date_hora,

    @NotBlank(message = "O local é obrigatório")
    Spring local
) {

}
