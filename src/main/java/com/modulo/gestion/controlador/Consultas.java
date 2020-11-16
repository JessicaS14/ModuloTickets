/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulo.gestion.controlador;

import com.modulo.gestion.modeloDAO.Estado;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jess7
 */
public class Consultas {

    
    EntityManager em;

    ArrayList<Estado> estados;

    public ArrayList<Estado> consultarEstados() {
        try {
            Query queryEstados = em.createNamedQuery("Estado.findAll");
            estados = (ArrayList<Estado>) queryEstados.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return estados;
    }
}
