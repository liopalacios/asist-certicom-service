package com.certicom.biometria.asistcerticomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

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
@Table(name = "movimiento")
public class Movimiento {
    @Id
    private int id;

    @Column(name = "id_personal")
    private Long idPersonal;

    @Column(name = "id_motivo")
    private int idMotivo;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @Column(name = "dias_utiles")
    private int diasUtiles;

    private String obs;

    private boolean estado;

}
