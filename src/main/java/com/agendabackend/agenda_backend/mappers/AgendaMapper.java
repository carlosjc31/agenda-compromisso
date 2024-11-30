package com.agendabackend.agenda_backend.mappers;

import com.agendabackend.agenda_backend.dtos.AgendaRequest;
import com.agendabackend.agenda_backend.dtos.AgendaResponse;
import com.agendabackend.agenda_backend.entities.Agenda;

public class AgendaMapper {
    public static AgendaResponse toDTO(Agenda agenda){
        return new AgendaResponse(agenda.getId(),
                                  agenda.getTitle(),
                                  agenda.getDescription(),
                                  agenda.getDate_hora(),
                                  agenda.getLocal());
    }

    public static Agenda toEntity(AgendaRequest agendaRequest){
        Agenda agenda = new Agenda();
        agenda.setTitle(agendaRequest.title());
        agenda.setDescription(agendaRequest.description());
        agenda.setDate_hora(agendaRequest.date_hora());
        agenda.setLocal(agendaRequest.local());

        return agenda;
    }

}
