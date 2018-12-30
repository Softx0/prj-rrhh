/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author DELL
 */
@Stateless
public class CandidatosFacade extends AbstractFacade<Candidatos> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CandidatosFacade() {
        super(Candidatos.class);
    }
    
    public boolean findCandidatoByCedula(String cedula){
        String consulta;
        try {
            
            consulta = "FROM Candidatos u WHERE u.cedula = ?1";
            Query query = em.createQuery(consulta);
            query.setParameter(1, cedula);
            
            List<Candidatos> candidatos = query.getResultList();
            
            if(!candidatos.isEmpty())
                return false;
            
        } catch (Exception e) {
            throw  e;
        } 
       return true;
    }
    
    
    
}
