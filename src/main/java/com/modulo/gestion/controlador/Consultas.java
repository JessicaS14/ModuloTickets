/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.controlador;

import com.modulo.gestion.modeloDAO.Estado;
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
    TypedQuery<Estado> consultaEstados;
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
}
