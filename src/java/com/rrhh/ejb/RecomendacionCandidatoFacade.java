/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.IdiomaCandidato;
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
public class RecomendacionCandidatoFacade extends AbstractFacade<RecomendacionCandidato> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecomendacionCandidatoFacade() {
        super(RecomendacionCandidato.class);
    }

    public RecomendacionCandidato recomendacionCandidato(int id) {
        RecomendacionCandidato recomendacionCandidato = null;
        String consulta;

        try {

            consulta = "FROM recomendacion_candidato u WHERE u.candidato = ?1";
            Query query = em.createQuery(consulta);

            query.setParameter(1, new Candidatos(id));

            List<RecomendacionCandidato> listRecomendacionCandidato = query.getResultList();

            if (!listRecomendacionCandidato.isEmpty()) {
                recomendacionCandidato = listRecomendacionCandidato.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return recomendacionCandidato;
    }

}
