/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.domain.Usuario;
import com.rrhh.ejb.UsuarioFacade;
import com.rrhh.helper.util.SessionReference;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController implements Serializable{

    /**
     * Creates a new instance of LoginController
     */
    @Inject
    private UsuarioFacade usuarioFacade;

    Usuario usuario;
    SessionReference sessionReference;

    @PostConstruct
    public void init() {
        usuario = new Usuario();
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

    public LoginController() {
    }

    public void iniciarSesion() {
        Usuario user;

        try {
            sessionReference = new SessionReference();
            user = usuarioFacade.credenciales(usuario);

            switch (user.getTipoUsuario().getDescripcion()) {

                case "ADMIN":
                    sessionReference.sessionMapPut("usuario", user);
                    sessionReference.getFacesContext()
                            .getExternalContext()
                            .redirect("../admin/index.xhtml");
                    break;

                case "EMPLEADO":
                    sessionReference.sessionMapPut("usuario", user);
                    sessionReference.navigationHandlerRedirect("/app/empleado/index");
                    break;

                case "CANDIDATO":
                    sessionReference.sessionMapPut("usuario", user);
                    sessionReference.navigationHandlerRedirect("/app/candidato/index");
                    break;

                default:
                    sessionReference.getFacesContext()
                            .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                    "Credenciales incorrectas", "error"));
                    break;
            }
        } catch (IOException e) {
            sessionReference.getFacesContext()
                    .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                            "Credenciales incorrectas" + e, "error"));
        }
    }

}
