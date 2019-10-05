package com.certicom.biometria.asistcerticomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "personal_horario")
public class PersonalHorario {

    @EmbeddedId
    private PersonalHorarioFK fk;

    private boolean estado;

    private Date vigencia;

}

