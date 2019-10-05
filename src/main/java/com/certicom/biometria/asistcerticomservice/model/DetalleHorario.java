package com.certicom.biometria.asistcerticomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "horario_detalle")
public class DetalleHorario {
    @Id
    private Long id;

    @Column(name = "id_horario")
    private int idHorario;

    @Column(name = "num_semana")
    private int numSemana;

    @Column(name = "dia_semana")
    private String diaSemana;

    @Column(name = "hora_ing")
    private String horaIng;

    @Column(name = "hora_sal")
    private String horaSal;
}
