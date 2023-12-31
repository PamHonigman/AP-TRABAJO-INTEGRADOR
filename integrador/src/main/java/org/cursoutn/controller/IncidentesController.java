package org.cursoutn.controller;

import org.cursoutn.model.*;
import org.cursoutn.state.State;
import org.cursoutn.view.IncidentesView;

import java.time.LocalDateTime;
import java.util.List;

public class IncidentesController {
    public IncidenteModel model;
    private IncidentesView view;

    public IncidentesController(IncidenteModel model, IncidentesView view) {
        this.model = model;
        this.view = view;
    }
    public void setIncidenteId (int incidenteId){this.model.setId(incidenteId);}
    public Integer getIncidenteId () {return this.model.getId();}
    public void setFechaHoraIncidente(LocalDateTime fechaHoraIncidente){this.model.setFechaHoraIncidente(fechaHoraIncidente);}
    public LocalDateTime getFechaHoraIncidente(){return this.model.getFechaHoraIncidente();}
    public void setTiempoNecesario (int tiempoNecesario){this.model.setTiempoNecesario(tiempoNecesario);}
    public Integer getTiempoNecesario (){return this.model.getTiempoNecesario();}
    public void setEsComplejo (int esComplejo){this.model.setEsComplejo(esComplejo);}
    public Integer getEsComplejo (){return this.model.getEsComplejo();}
    public void setEstadoIncidenteActual (State estadoIncidente){this.model.setEstadoIncidente(estadoIncidente);}
    public State getEstadoIncidenteActual(){return this.model.getEstadoIncidente();}
    public void setOperadores (OperadorModel operador){this.model.getOperadores().add(operador);}
    public List<OperadorModel> operadores (){return this.model.getOperadores();}
    public void setCliente (ClienteModel cliente) {this.model.setCliente(cliente);}
    public ClienteModel getCliente (){return this.model.getCliente();}
    public void setTecnicos (TecnicoModel tecnico){this.model.getTecnicos().add(tecnico);}
    public List<TecnicoModel> getTecnicos (){return this.model.getTecnicos();}
    public void actualizarView (){
        view.mostrarIncidente(model.getId(), model.getFechaHoraIncidente(), model.getTiempoNecesario(), model.getEsComplejo(), this.model.getEstadoIncidente(), model.getOperadores(), model.getCliente(), model.getTecnicos(), model.getTipoProblema());
    }
}
