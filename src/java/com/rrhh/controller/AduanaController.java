/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.domain.Usuario;
import com.rrhh.helper.util.JsfUtil;
import com.rrhh.helper.util.SessionReference;
import java.io.IOException;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author DELL
 */
@Named(value = "aduanaController")
@ViewScoped
public class AduanaController implements Serializable{

    SessionReference sessionReference;
    Usuario usuario;

    public AduanaController() {
    }

    public void onlyAdmin() {
        try {
            sessionReference = new SessionReference();
            usuario = new Usuario();

            usuario = (Usuario) sessionReference.sessionMapGet("usuario");

            if (usuario == null || !usuario.getTipoUsuario().getDescripcion().equals("ADMIN")) {
                sessionReference.getFacesContext().getExternalContext().redirect("account/login.xhtml");
            }

        } catch (IOException e) {
            JsfUtil.addErrorMessage(e, "Ha ocurrido un error!" + e);
        }
    }

    public void onlyCandidato() {
        try {
            sessionReference = new SessionReference();
            usuario = new Usuario();

            usuario = (Usuario) sessionReference.sessionMapGet("usuario");

            if (usuario == null || !usuario.getTipoUsuario().getDescripcion().equals("CANDIDATO")) {
                sessionReference.getFacesContext().getExternalContext().redirect("./../acceso/login.xhtml");
            }

        } catch (IOException e) {
            System.err.println("Ha ocurrido un error! " + e);
        }
    }

    public void onlyEmpleado() {
        try {
            sessionReference = new SessionReference();
            usuario = new Usuario();

            usuario = (Usuario) sessionReference.sessionMapGet("usuario");

            if (usuario == null || !usuario.getTipoUsuario().getDescripcion().equals("EMPLEADO")) {
                sessionReference.getFacesContext().getExternalContext().redirect("./../acceso/login.xhtml");
            }

        } catch (IOException e) {
            System.err.println("Ha ocurrido un error! " + e);
        }
    }

    public void logOut() {

        try {
            sessionReference = new SessionReference();
            sessionReference.sessionMapGetRemove("usuario");

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error! " + e);
        }
    }

}
