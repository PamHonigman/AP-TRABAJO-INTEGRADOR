package org.cursoutn.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cursoutn.state.State;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="tecnico")
public class TecnicoModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombreTecnico;

    @Column
    private int colchonHoras;

    @ManyToMany(mappedBy = "tecnicos", cascade = CascadeType.ALL)
    private List<IncidenteModel> incidentes;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<EspecialidadModel> especialidades;

    public TecnicoModel() {
        this.nombreTecnico = "";
        this.colchonHoras = 1;
        this.incidentes = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }
    public TecnicoModel(String nombreTecnico) {
        this.nombreTecnico= nombreTecnico;
    }
    public TecnicoModel(String nombreTecnico, List<EspecialidadModel> especialidades) {
        this.nombreTecnico = nombreTecnico;
        this.especialidades = especialidades;
    }

    public TecnicoModel(String nombreTecnico, int colchonHoras, List<IncidenteModel> incidentes,
                        List<EspecialidadModel> especialidades) {
        this.nombreTecnico = nombreTecnico;
        this.colchonHoras = colchonHoras;
  //      this.incidentes = incidentes;
        this.especialidades = especialidades;
    }
    public long cantidadDeIncidentesResueltos (){
        return this.getIncidentes().stream().filter(caso ->  caso.getEstadoIncidente().equals(State.RESUELTO)).count();
    }
}
