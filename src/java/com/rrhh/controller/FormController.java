/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.ejb.CandidatosFacade;
import com.rrhh.ejb.CapacitacionCandidatoFacade;
import com.rrhh.ejb.CapacitacionesFacade;
import com.rrhh.ejb.CompetenciaCandidatoFacade;
import com.rrhh.ejb.CompetenciasFacade;
import com.rrhh.ejb.ExperienciaLaboralFacade;
import com.rrhh.ejb.ExplaboralCandidatoFacade;
import com.rrhh.ejb.IdiomaCandidatoFacade;
import com.rrhh.ejb.IdiomasFacade;
import com.rrhh.ejb.RecomendacionCandidatoFacade;
import com.rrhh.ejb.RecomendacionFacade;
import com.rrhh.ejb.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import com.rrhh.domain.*;
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
    private CapacitacionesFacade capacitacionesFacade;
    @Inject
    private CapacitacionCandidatoFacade capacitacionCandidatoFacade;

    @Inject
    private CompetenciasFacade competenciaFacade;
    @Inject
    private CompetenciaCandidatoFacade competenciaCandidatoFacade;

    @Inject
    private ExperienciaLaboralFacade experienciaLaboralFacade;
    @Inject
    private ExplaboralCandidatoFacade expLaboralCandidatoFacade;

    @Inject
    private IdiomasFacade idiomasFacade;
    @Inject
    private IdiomaCandidatoFacade idiomaCandidatoFacade;

    @Inject
    private RecomendacionFacade recomendacionFacade;
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

    Capacitaciones capacitacionesList[];
    Competencias competenciasList[];
    ExperienciaLaboral experienciaLaboralList[];
    Idiomas idiomasList[];
    Recomendacion recomendacionesList[];

    /**
     * Creates a new instance of FormController
     */
    public FormController() {
    }

}
