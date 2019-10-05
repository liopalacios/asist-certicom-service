package com.certicom.biometria.asistcerticomservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "horario")
public class Horario {
    @Id
    private int id;

    private String horario;

    private int tolerancia;

    private int habiles;

    private boolean estado;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany
    @JoinTable(
            name="personal_horario")
    private List<Personal> personals;
}
