/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.modeloDAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jess7
 */
@Embeddable
public class TicketPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idTicket")
    private int idTicket;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prioridad_idPrioridad")
    private int prioridadidPrioridad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_idEstado")
    private int estadoidEstado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "responsable_idResponsable")
    private int responsableidResponsable;

    public TicketPK() {
    }

    public TicketPK(int idTicket, int prioridadidPrioridad, int estadoidEstado, int responsableidResponsable) {
        this.idTicket = idTicket;
        this.prioridadidPrioridad = prioridadidPrioridad;
        this.estadoidEstado = estadoidEstado;
        this.responsableidResponsable = responsableidResponsable;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getPrioridadidPrioridad() {
        return prioridadidPrioridad;
    }

    public void setPrioridadidPrioridad(int prioridadidPrioridad) {
        this.prioridadidPrioridad = prioridadidPrioridad;
    }

    public int getEstadoidEstado() {
        return estadoidEstado;
    }

    public void setEstadoidEstado(int estadoidEstado) {
        this.estadoidEstado = estadoidEstado;
    }

    public int getResponsableidResponsable() {
        return responsableidResponsable;
    }

    public void setResponsableidResponsable(int responsableidResponsable) {
        this.responsableidResponsable = responsableidResponsable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTicket;
        hash += (int) prioridadidPrioridad;
        hash += (int) estadoidEstado;
        hash += (int) responsableidResponsable;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TicketPK)) {
            return false;
        }
        TicketPK other = (TicketPK) object;
        if (this.idTicket != other.idTicket) {
            return false;
        }
        if (this.prioridadidPrioridad != other.prioridadidPrioridad) {
            return false;
        }
        if (this.estadoidEstado != other.estadoidEstado) {
            return false;
        }
        if (this.responsableidResponsable != other.responsableidResponsable) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modulo.gestion.conexion.TicketPK[ idTicket=" + idTicket + ", prioridadidPrioridad=" + prioridadidPrioridad + ", estadoidEstado=" + estadoidEstado + ", responsableidResponsable=" + responsableidResponsable + " ]";
    }
    
}
