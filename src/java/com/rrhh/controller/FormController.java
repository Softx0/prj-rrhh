/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.ejb.CandidatosFacade;
import com.rrhh.ejb.CapacitacionCandidatoFacade;
import com.rrhh.ejb.CompetenciaCandidatoFacade;
import com.rrhh.ejb.ExplaboralCandidatoFacade;
import com.rrhh.ejb.IdiomaCandidatoFacade;
import com.rrhh.ejb.RecomendacionCandidatoFacade;
import com.rrhh.ejb.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import com.rrhh.domain.*;
import com.rrhh.helper.util.JsfUtil;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Named(value = "formController")
@SessionScoped
public class FormController implements Serializable {

    @Inject
    private CandidatosFacade candidatosFacade;

    @Inject
    private CapacitacionCandidatoFacade capacitacionCandidatoFacade;

    @Inject
    private CompetenciaCandidatoFacade competenciaCandidatoFacade;

    @Inject
    private ExplaboralCandidatoFacade expLaboralCandidatoFacade;

    @Inject
    private IdiomaCandidatoFacade idiomaCandidatoFacade;

    @Inject
    private RecomendacionCandidatoFacade recomendacionCandidatoFacade;

    @Inject
    private UsuarioFacade usuarioFacade;

    Candidatos candidato;

    CapacitacionCandidato capacitacionCandidato;
    CompetenciaCandidato competenciaCandidato;
    ExplaboralCandidato experienciaLaboralCandidato;
    IdiomaCandidato idiomaCandidato;
    RecomendacionCandidato recomendacionCandidato;

    Competencias competenciasList[];
    Idiomas idiomasList[];
    Capacitaciones capacitacionesList;
    ExperienciaLaboral experienciaLaboralList;
    Recomendacion recomendacionesList;

    Usuario usuario;
    String emailUsuario;

    @PostConstruct
    public void init() {
        capacitacionCandidato = new CapacitacionCandidato();
        competenciaCandidato = new CompetenciaCandidato();
        experienciaLaboralCandidato = new ExplaboralCandidato();
        idiomaCandidato = new IdiomaCandidato();
        recomendacionCandidato = new RecomendacionCandidato();
    }

    public Candidatos getCandidato() {

        if (candidato == null) {
            candidato = new Candidatos();
        }
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
    }

    public CapacitacionCandidato getCapacitacionCandidato() {
        if (capacitacionCandidato == null) {
            capacitacionCandidato = new CapacitacionCandidato();
        }
        return capacitacionCandidato;
    }

    public void setCapacitacionCandidato(CapacitacionCandidato capacitacionCandidato) {
        this.capacitacionCandidato = capacitacionCandidato;
    }

    public CompetenciaCandidato getCompetenciaCandidato() {
        if (competenciaCandidato == null) {
            competenciaCandidato = new CompetenciaCandidato();
        }
        return competenciaCandidato;
    }

    public void setCompetenciaCandidato(CompetenciaCandidato competenciaCandidato) {
        this.competenciaCandidato = competenciaCandidato;
    }

    public ExplaboralCandidato getExperienciaLaboralCandidato() {
        if (experienciaLaboralCandidato == null) {
            experienciaLaboralCandidato = new ExplaboralCandidato();
        }
        return experienciaLaboralCandidato;
    }

    public void setExperienciaLaboralCandidato(ExplaboralCandidato experienciaLaboralCandidato) {
        this.experienciaLaboralCandidato = experienciaLaboralCandidato;
    }

    public IdiomaCandidato getIdiomaCandidato() {
        if (idiomaCandidato == null) {
            idiomaCandidato = new IdiomaCandidato();
        }
        return idiomaCandidato;
    }

    public void setIdiomaCandidato(IdiomaCandidato idiomaCandidato) {
        this.idiomaCandidato = idiomaCandidato;
    }

    public RecomendacionCandidato getRecomendacionCandidato() {
        if (recomendacionCandidato == null) {
            recomendacionCandidato = new RecomendacionCandidato();
        }
        return recomendacionCandidato;
    }

    public void setRecomendacionCandidato(RecomendacionCandidato recomendacionCandidato) {
        this.recomendacionCandidato = recomendacionCandidato;
    }

    public Capacitaciones getCapacitacionesList() {
        if (capacitacionesList == null) {
            capacitacionesList = new Capacitaciones();
        }
        return capacitacionesList;
    }

    public void setCapacitacionesList(Capacitaciones capacitacionesList) {
        this.capacitacionesList = capacitacionesList;
    }

    public Competencias[] getCompetenciasList() {
        return competenciasList;
    }

    public void setCompetenciasList(Competencias[] competenciasList) {
        this.competenciasList = competenciasList;
    }

    public ExperienciaLaboral getExperienciaLaboralList() {
        if (experienciaLaboralList == null) {
            experienciaLaboralList = new ExperienciaLaboral();
        }
        return experienciaLaboralList;
    }

    public void setExperienciaLaboralList(ExperienciaLaboral experienciaLaboralList) {
        this.experienciaLaboralList = experienciaLaboralList;
    }

    public Idiomas[] getIdiomasList() {
        return idiomasList;
    }

    public void setIdiomasList(Idiomas[] idiomasList) {
        this.idiomasList = idiomasList;
    }

    public Recomendacion getRecomendacionesList() {
        if (recomendacionesList == null) {
            recomendacionesList = new Recomendacion();
        }
        return recomendacionesList;
    }

    public void setRecomendacionesList(Recomendacion recomendacionesList) {
        this.recomendacionesList = recomendacionesList;
    }

    public Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * Creates a new instance of FormController
     */
    public FormController() {
    }

    public void Aplicar() {
        try {

            candidato.setEmail(emailUsuario);
            candidatosFacade.create(candidato);

            for (int i = 0; i <= (getIdiomasList().length - 1); i++) {
                idiomaCandidato.setIdioma(new Idiomas(idiomasList[i].getId()));
                idiomaCandidato.setCandidato(new Candidatos(candidato.getId()));
                idiomaCandidatoFacade.create(idiomaCandidato);
            }

            for (int i = 0; i <= (getCompetenciasList().length - 1); i++) {
                competenciaCandidato.setCompetencia(new Competencias(competenciasList[i].getId()));
                competenciaCandidato.setCandidato(new Candidatos(candidato.getId()));
                competenciaCandidatoFacade.create(competenciaCandidato);
            }

            capacitacionCandidato.setCapacitacion(new Capacitaciones(capacitacionesList.getId()));
            capacitacionCandidato.setCandidato(new Candidatos(candidato.getId()));
            capacitacionCandidatoFacade.create(capacitacionCandidato);

            experienciaLaboralCandidato.setExperienciaLaboral(new ExperienciaLaboral(experienciaLaboralList.getId()));
            experienciaLaboralCandidato.setCandidato(new Candidatos(candidato.getId()));
            expLaboralCandidatoFacade.create(experienciaLaboralCandidato);

            recomendacionCandidato.setRecomendacion(new Recomendacion(recomendacionesList.getId()));
            recomendacionCandidato.setCandidato(new Candidatos(candidato.getId()));
            recomendacionCandidatoFacade.create(recomendacionCandidato);

            usuario.setEmail(emailUsuario);
            usuario.setTipoUsuario(new TipoUsuario(3));
            usuarioFacade.create(usuario);

            JsfUtil.addSuccessMessage("Formulario enviado con Exito!!!\n"
                    + "Logeate porfavor!");

        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "El candidato no fue creado!" + e);
        }
    }

}
