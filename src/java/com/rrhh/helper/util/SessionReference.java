/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.helper.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author DELL
 */
public class SessionReference {

    FacesContext facesContext;

    public SessionReference() {
        facesContext = FacesContext.getCurrentInstance();
    }

    public FacesContext getFacesContext() {
        return facesContext;
    }

    public void navigationHandlerRedirect(String ruta) {
        facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext, null, ruta);
    }

    public void sessionMapPut(String key, Object object) {
        facesContext.getExternalContext().getSessionMap().put(key, object);
    }

    public Object sessionMapGet(String key) {
        return facesContext.getExternalContext().getSessionMap().get(key);
    }

    public Object sessionMapGetRemove(String key) {
        return facesContext.getExternalContext().getSessionMap().remove(key);
    }
}
