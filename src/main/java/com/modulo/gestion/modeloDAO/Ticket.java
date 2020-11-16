/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.modeloDAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jess7
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t"),
    @NamedQuery(name = "Ticket.findByIdTicket", query = "SELECT t FROM Ticket t WHERE t.ticketPK.idTicket = :idTicket"),
    @NamedQuery(name = "Ticket.findByResumen", query = "SELECT t FROM Ticket t WHERE t.resumen = :resumen"),
    @NamedQuery(name = "Ticket.findByFechaCreacion", query = "SELECT t FROM Ticket t WHERE t.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Ticket.findByDescripcion", query = "SELECT t FROM Ticket t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Ticket.findByPrioridadidPrioridad", query = "SELECT t FROM Ticket t WHERE t.ticketPK.prioridadidPrioridad = :prioridadidPrioridad"),
    @NamedQuery(name = "Ticket.findByEstadoidEstado", query = "SELECT t FROM Ticket t WHERE t.ticketPK.estadoidEstado = :estadoidEstado"),
    @NamedQuery(name = "Ticket.findByResponsableidResponsable", query = "SELECT t FROM Ticket t WHERE t.ticketPK.responsableidResponsable = :responsableidResponsable")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TicketPK ticketPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "resumen")
    private String resumen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fechaCreacion")
    private String fechaCreacion;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "estado_idEstado", referencedColumnName = "idEstado", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estado estado;
    @JoinColumn(name = "prioridad_idPrioridad", referencedColumnName = "idPrioridad", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Prioridad prioridad;
    @JoinColumn(name = "responsable_idResponsable", referencedColumnName = "idResponsable", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Responsable responsable;

    public Ticket() {
    }

    public Ticket(TicketPK ticketPK) {
        this.ticketPK = ticketPK;
    }

    public Ticket(TicketPK ticketPK, String resumen, String fechaCreacion) {
        this.ticketPK = ticketPK;
        this.resumen = resumen;
        this.fechaCreacion = fechaCreacion;
    }

    public Ticket(int idTicket, int prioridadidPrioridad, int estadoidEstado, int responsableidResponsable) {
        this.ticketPK = new TicketPK(idTicket, prioridadidPrioridad, estadoidEstado, responsableidResponsable);
    }

    public TicketPK getTicketPK() {
        return ticketPK;
    }

    public void setTicketPK(TicketPK ticketPK) {
        this.ticketPK = ticketPK;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketPK != null ? ticketPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.ticketPK == null && other.ticketPK != null) || (this.ticketPK != null && !this.ticketPK.equals(other.ticketPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modulo.gestion.conexion.Ticket[ ticketPK=" + ticketPK + " ]";
    }
    
}
