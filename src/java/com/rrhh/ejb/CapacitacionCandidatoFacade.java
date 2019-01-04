/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.CapacitacionCandidato;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    public CapacitacionCandidato CapacitacionCandidato(int id) {
        CapacitacionCandidato capacitacionCandidato = null;
        String consulta;

        try {

            consulta = "FROM capacitacion_candidato u WHERE u.candidato = ?1";
            Query query = em.createQuery(consulta);

            query.setParameter(1, new Candidatos(id));

            List<CapacitacionCandidato> listCapacitacionCandidato
                    = query.getResultList();

            if (!listCapacitacionCandidato.isEmpty()) {
                capacitacionCandidato = listCapacitacionCandidato.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return capacitacionCandidato;
    }

}
