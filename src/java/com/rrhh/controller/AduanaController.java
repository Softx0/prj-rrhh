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
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author DELL
 */
@Named(value = "aduanaController")
@ViewScoped
public class AduanaController {

    SessionReference sessionReference;
    Usuario usuario;

    /**
     * Creates a new instance of AduanaController
     */
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
    
    

}
