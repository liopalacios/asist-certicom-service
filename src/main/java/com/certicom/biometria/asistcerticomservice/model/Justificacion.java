package com.certicom.biometria.asistcerticomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "justificacion")
public class Justificacion {
    @Id
    private int id;

    private int tipo;

    @Column(name = "id_personal")
    private Long idPersonal;

    @Column(name = "id_motivo")
    private int idMotivo;

    @Column(name = "fecha_justificada")
    private Date fechaJustificada;

    private int dias;

    @Column(name = "id_movimiento")
    private int idMovimiento;

}
