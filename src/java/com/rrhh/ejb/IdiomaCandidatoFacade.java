/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.ExplaboralCandidato;
import com.rrhh.domain.IdiomaCandidato;
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
public class IdiomaCandidatoFacade extends AbstractFacade<IdiomaCandidato> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IdiomaCandidatoFacade() {
        super(IdiomaCandidato.class);
    }

    public IdiomaCandidato idiomaCandidato(int id) {
        IdiomaCandidato idiomaCandidato = null;
        String consulta;

        try {

            consulta = "FROM idioma_candidato u WHERE u.candidato = ?1";
            Query query = em.createQuery(consulta);

            query.setParameter(1, new Candidatos(id));

            List<IdiomaCandidato> listIdiomaCandidato = query.getResultList();

            if (!listIdiomaCandidato.isEmpty()) {
                idiomaCandidato = listIdiomaCandidato.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return idiomaCandidato;
    }

}
