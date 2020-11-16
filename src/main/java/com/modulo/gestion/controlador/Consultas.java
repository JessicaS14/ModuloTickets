/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.controlador;

import com.modulo.gestion.modeloDAO.Estado;
import com.modulo.gestion.modeloDAO.Prioridad;
import com.modulo.gestion.modeloDAO.Responsable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author jess7
 */
public class Consultas {

    EntityManager em;

    List<Estado> estados;
    List<Prioridad> prioridad;
    List<Responsable> responsable;
    TypedQuery<Estado> consultaEstados;
    TypedQuery<Prioridad> consultaPrioridad;
    TypedQuery<Responsable> consultaResponsable;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.modulo.gestion_ModuloTicket_war_1.0-SNAPSHOTPU");

    public List<Estado> consultarEstados() {
        try {
            em = emf.createEntityManager();
            consultaEstados = em.createNamedQuery("Estado.findAll", Estado.class);
            estados = (List<Estado>) consultaEstados.getResultList();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return estados;
    }
    
    public List<Prioridad> consultarPrioridades() {
        try {
            em = emf.createEntityManager();
            consultaPrioridad = em.createNamedQuery("Prioridad.findAll", Prioridad.class);
            prioridad = (List<Prioridad>) consultaPrioridad.getResultList();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return prioridad;
    }
    
    public List<Responsable> consultarResponsables() {
        try {
            em = emf.createEntityManager();
            consultaResponsable = em.createNamedQuery("Responsables.findAll", Responsable.class);
            responsable = (List<Responsable>) consultaResponsable.getResultList();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return responsable;
    }
}
