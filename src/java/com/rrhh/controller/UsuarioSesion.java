/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.CapacitacionCandidato;
import com.rrhh.domain.CompetenciaCandidato;
import com.rrhh.domain.ExplaboralCandidato;
import com.rrhh.domain.IdiomaCandidato;
import com.rrhh.domain.RecomendacionCandidato;
import com.rrhh.domain.Usuario;
import com.rrhh.ejb.CandidatosFacade;
import com.rrhh.ejb.CapacitacionCandidatoFacade;
import com.rrhh.ejb.CompetenciaCandidatoFacade;
import com.rrhh.ejb.ExplaboralCandidatoFacade;
import com.rrhh.ejb.IdiomaCandidatoFacade;
import com.rrhh.ejb.RecomendacionCandidatoFacade;
import com.rrhh.helper.util.SessionReference;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Named(value = "usuarioSesion")
@SessionScoped
public class UsuarioSesion implements Serializable {

    @Inject
    private CandidatosFacade candidatoFacade;

    @Inject
    private CapacitacionCandidatoFacade capacitacionCandidatoFacade;

    @Inject
    private ExplaboralCandidatoFacade experienciaCandidatoFacade;

    @Inject
    private IdiomaCandidatoFacade idiomaCandidatoFacade;

    @Inject
    private CompetenciaCandidatoFacade competenciaCandidatoFacade;

    @Inject
    private RecomendacionCandidatoFacade recomendacionCandidatoFacade;

    /**
     * Creates a new instance of UsuarioSesion
     */
    public UsuarioSesion() {
    }

    SessionReference sessionReference;
    Usuario usuario;

    Candidatos candidato;
    CapacitacionCandidato capacitacionCandidato;
    ExplaboralCandidato experienciaCandidato;
    RecomendacionCandidato recomendacionCandidato;
    IdiomaCandidato idiomaCandidato;
    CompetenciaCandidato competenciaCandidato;

    @PostConstruct
    public void init() {
        usuario = new Usuario();
        candidato = new Candidatos();
        capacitacionCandidato = new CapacitacionCandidato();
        experienciaCandidato = new ExplaboralCandidato();
        recomendacionCandidato = new RecomendacionCandidato();
        idiomaCandidato = new IdiomaCandidato();
        competenciaCandidato = new CompetenciaCandidato();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
    }

    public CapacitacionCandidato getCapacitacionCandidato() {
        return capacitacionCandidato;
    }

    public void setCapacitacionCandidato(CapacitacionCandidato capacitacionCandidato) {
        this.capacitacionCandidato = capacitacionCandidato;
    }

    public ExplaboralCandidato getExperienciaCandidato() {
        return experienciaCandidato;
    }

    public void setExperienciaCandidato(ExplaboralCandidato experienciaCandidato) {
        this.experienciaCandidato = experienciaCandidato;
    }

    public RecomendacionCandidato getRecomendacionCandidato() {
        return recomendacionCandidato;
    }

    public void setRecomendacionCandidato(RecomendacionCandidato recomendacionCandidato) {
        this.recomendacionCandidato = recomendacionCandidato;
    }

    public IdiomaCandidato getIdiomaCandidato() {
        return idiomaCandidato;
    }

    public void setIdiomaCandidato(IdiomaCandidato idiomaCandidato) {
        this.idiomaCandidato = idiomaCandidato;
    }

    public CompetenciaCandidato getCompetenciaCandidato() {
        return competenciaCandidato;
    }

    public void setCompetenciaCandidato(CompetenciaCandidato competenciaCandidato) {
        this.competenciaCandidato = competenciaCandidato;
    }

    public void datosUser() {
        try {
            sessionReference = new SessionReference();
            usuario = (Usuario) sessionReference.sessionMapGet("usuario");

        } catch (Exception e) {

            System.err.println("Ha ocurrido un error " + e);
        }
    }

    public void datosCandidatoXsesion(int id) {
        try {
            capacitacionCandidato = capacitacionCandidatoFacade.CapacitacionCandidato(id);
            experienciaCandidato = experienciaCandidatoFacade.experienciaLaboralCandidato(id);
            recomendacionCandidato = recomendacionCandidatoFacade.recomendacionCandidato(id);
            competenciaCandidato = competenciaCandidatoFacade.competenciaCandidato(id);
            idiomaCandidato = idiomaCandidatoFacade.idiomaCandidato(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public void datoCandidato() {
        try {
            sessionReference = new SessionReference();
            usuario = (Usuario) sessionReference.sessionMapGet("usuario");
            candidato = candidatoFacade.findCandidatoEmail(usuario.getEmail());
            datosCandidatoXsesion(candidato.getId());

        } catch (Exception e) {
            throw e;
        }
    }

}
