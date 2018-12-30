/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.helper.util;

import com.rrhh.ejb.CandidatosFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Named(value = "validator")
@RequestScoped
public class Validator implements Serializable{

    @Inject
    private CandidatosFacade candidatoFacade;

    @PostConstruct
    public void init() {

    }

    public Validator() {
    }

    public void validarCedula(FacesContext faceContext, UIComponent component, 
            Object value) {
        
        String cedula = value.toString();
        if (!valiCedulaDom(cedula)) {
            throw new ValidatorException(new FacesMessage(FacesMessage
                    .SEVERITY_ERROR, "La cedula no es valida", null));
        }

        if (!candidatoFacade.findCandidatoByCedula(cedula)) {
            throw new ValidatorException(new FacesMessage(FacesMessage
                    .SEVERITY_ERROR, "La cedula ya esta en uso", null));
        }
    }

    public static boolean valiCedulaDom(String cedula) {
        if (cedula == null || cedula.length() != 11 || cedula.equals("00000000000")) {
            return false;
        }

        int suma = 0;
        int division = 0;
        String peso = "1212121212";
        for (int i = 0; i < 10; i++) {
            int mul = (cedula.charAt(i) - '0') * (peso.charAt(i) - '0');
            while (mul > 0) {
                suma += mul % 10;
                mul /= 10;
            }
        }
        division = (suma / 10) * 10;
        if (division < suma) {
            division += 10;
        }
        int digito = division - suma;
        if (digito != cedula.charAt(10) - '0') {
            return false;
        }
        return true;
    }

}
