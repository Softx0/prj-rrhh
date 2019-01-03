/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.CompetenciaCandidato;
import com.rrhh.domain.RecomendacionCandidato;
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
public class CompetenciaCandidatoFacade extends AbstractFacade<CompetenciaCandidato> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompetenciaCandidatoFacade() {
        super(CompetenciaCandidato.class);
    }

    public CompetenciaCandidato competenciaCandidato(int id) {
        CompetenciaCandidato competenciaCandidato = null;
        String consulta;

        try {

            consulta = "FROM competencia_candidato u WHERE u.candidato = ?1";
            Query query = em.createQuery(consulta);

            query.setParameter(1, new Candidatos(id));

            List<CompetenciaCandidato> listCompetenciaCandidato = query.getResultList();

            if (!listCompetenciaCandidato.isEmpty()) {
                competenciaCandidato = listCompetenciaCandidato.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return competenciaCandidato;
    }
}
