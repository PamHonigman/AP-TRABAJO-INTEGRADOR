package org.cursoutn.packageModel;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="estado_incidente")
public class EstadoIncidenteModel implements Serializable {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String estadoDescripcion;
    @OneToOne(mappedBy = "estado_incidente", cascade = CascadeType.ALL)
    private IncidentesModel incidentes;
}
