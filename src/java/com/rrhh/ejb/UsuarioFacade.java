/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.ejb;

import com.rrhh.domain.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "HumanResourcePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Usuario iniciarSesion(Usuario usuario) {
        Usuario user = null;
        String consulta;

        try {
            consulta = "FROM Usuario u WHERE u.email = ?1 and u.pass  = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, usuario.getEmail());
            query.setParameter(2, usuario.getPass());

            List<Usuario> listUser = query.getResultList();

            if (!listUser.isEmpty()) {
                user = listUser.get(0);
            }

        } catch (Exception e) {
            throw e;
        }
        return user;
    }

}
