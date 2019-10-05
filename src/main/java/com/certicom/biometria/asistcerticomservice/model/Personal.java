package com.certicom.biometria.asistcerticomservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "personal")
@Data
@ToString
@Entity
public class Personal {

    @Id
    private Long id;

    private String dni;

    private String nombre;

    private String apellido;

    @ManyToMany(mappedBy = "personals")
    private List<Horario> horarios;
}
