/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.ExplaboralCandidato;
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
public class ExplaboralCandidatoFacade extends AbstractFacade<ExplaboralCandidato> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ExplaboralCandidatoFacade() {
        super(ExplaboralCandidato.class);
    }

    public ExplaboralCandidato experienciaLaboralCandidato(int id) {
        ExplaboralCandidato experienciaCandidato = null;
        String consulta;

        try {

            consulta = "FROM explaboral_candidato u WHERE u.candidato = ?1";
            Query query = em.createQuery(consulta);

            query.setParameter(1, new Candidatos(id));

            List<ExplaboralCandidato> listExperienciaCandidato = query.getResultList();

            if (!listExperienciaCandidato.isEmpty()) {
                experienciaCandidato = listExperienciaCandidato.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return experienciaCandidato;
    }
}
