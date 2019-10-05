package com.certicom.biometria.asistcerticomservice.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PersonalHorarioFK implements Serializable {
    private Long idPersonal;
    private int idHorario;
}
