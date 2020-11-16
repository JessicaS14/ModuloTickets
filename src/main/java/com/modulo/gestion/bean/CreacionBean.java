/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.bean;

import com.modulo.gestion.controlador.Consultas;
import com.modulo.gestion.modeloDAO.Estado;
import com.modulo.gestion.modeloDAO.Prioridad;
import com.modulo.gestion.modeloDAO.Responsable;
import com.modulo.gestion.modeloDAO.Ticket;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jess7
 */
@Named
@RequestScoped
public class CreacionBean {
    Ticket ticket;
    Consultas consultas = new Consultas();
    List<Estado> estados;
    List<Prioridad> prioridades;
    List<Responsable> responsables;
    Estado estado;
    Prioridad prioridad;
    Responsable responsable;

    public CreacionBean() {
        estados = consultas.consultarEstados();
        prioridades = consultas.consultarPrioridades();
        responsables = consultas.consultarResponsables();
    }

    public void consultarEstados() {
        estado = new Estado();
        estados = consultas.consultarEstados();
    }

    public void registrarTicket() {
        ticket = new Ticket();
    }
    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public List<Prioridad> getPrioridades() {
        return prioridades;
    }

    public void setPrioridades(List<Prioridad> prioridades) {
        this.prioridades = prioridades;
    }

    public List<Responsable> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<Responsable> responsables) {
        this.responsables = responsables;
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
    
    
}
