/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.controller;

import com.rrhh.domain.Usuario;
import com.rrhh.ejb.UsuarioFacade;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author DELL
 */
@Named(value = "loginController")
@RequestScoped
public class LoginController {

    /**
     * Creates a new instance of LoginController
     */
    
    @Inject
    private UsuarioFacade usuarioFacade;
    
    Usuario usuario;
    SessionReference  sessionReference;
    
    public LoginController() {
    }
    
}
