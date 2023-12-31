package org.cursoutn.state;

import org.cursoutn.controller.IncidentesController;
import org.cursoutn.model.TecnicoModel;

public class IncidenteEstado{
    protected IncidentesController incidentesController;
    protected EstadoIncidente estadoIncidente;

    protected State state;
    protected TecnicoModel tecnico;

    public EstadoIncidente getEstadoIncidente() {
        return this.estadoIncidente;
    }

    public void setEstadoIncidente(EstadoIncidente estadoIncidente) {
        this.estadoIncidente = estadoIncidente;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public IncidentesController getIncidentesController() {
        return incidentesController;
    }

    public void setIncidentesController(IncidentesController incidentesController) {
        this.incidentesController = incidentesController;
    }

    public TecnicoModel getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoModel tecnico) {
        this.tecnico = tecnico;
    }
}
