/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.CapacitacionCandidato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL
 */
@Stateless
public class CapacitacionCandidatoFacade extends AbstractFacade<CapacitacionCandidato> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionCandidatoFacade() {
        super(CapacitacionCandidato.class);
    }
    
}
