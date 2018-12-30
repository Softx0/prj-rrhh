/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")
    , @NamedQuery(name = "Estado.findById", query = "SELECT e FROM Estado e WHERE e.id = :id")
    , @NamedQuery(name = "Estado.findByDescripcion", query = "SELECT e FROM Estado e WHERE e.descripcion = :descripcion")})
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Descripcion")
    private Boolean descripcion;
    @OneToMany(mappedBy = "estado")
    private List<Puestos> puestosList;
    @OneToMany(mappedBy = "estado")
    private List<Capacitaciones> capacitacionesList;
    @OneToMany(mappedBy = "estado")
    private List<Departamentos> departamentosList;
    @OneToMany(mappedBy = "estado")
    private List<Competencias> competenciasList;
    @OneToMany(mappedBy = "estado")
    private List<Idiomas> idiomasList;
    @OneToMany(mappedBy = "estado")
    private List<Recomendacion> recomendacionList;
    @OneToMany(mappedBy = "estado")
    private List<ExperienciaLaboral> experienciaLaboralList;
    @OneToMany(mappedBy = "estado")
    private List<Usuario> usuarioList;

    public Estado() {
    }

    public Estado(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Boolean descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Puestos> getPuestosList() {
        return puestosList;
    }

    public void setPuestosList(List<Puestos> puestosList) {
        this.puestosList = puestosList;
    }

    @XmlTransient
    public List<Capacitaciones> getCapacitacionesList() {
        return capacitacionesList;
    }

    public void setCapacitacionesList(List<Capacitaciones> capacitacionesList) {
        this.capacitacionesList = capacitacionesList;
    }

    @XmlTransient
    public List<Departamentos> getDepartamentosList() {
        return departamentosList;
    }

    public void setDepartamentosList(List<Departamentos> departamentosList) {
        this.departamentosList = departamentosList;
    }

    @XmlTransient
    public List<Competencias> getCompetenciasList() {
        return competenciasList;
    }

    public void setCompetenciasList(List<Competencias> competenciasList) {
        this.competenciasList = competenciasList;
    }

    @XmlTransient
    public List<Idiomas> getIdiomasList() {
        return idiomasList;
    }

    public void setIdiomasList(List<Idiomas> idiomasList) {
        this.idiomasList = idiomasList;
    }

    @XmlTransient
    public List<Recomendacion> getRecomendacionList() {
        return recomendacionList;
    }

    public void setRecomendacionList(List<Recomendacion> recomendacionList) {
        this.recomendacionList = recomendacionList;
    }

    @XmlTransient
    public List<ExperienciaLaboral> getExperienciaLaboralList() {
        return experienciaLaboralList;
    }

    public void setExperienciaLaboralList(List<ExperienciaLaboral> experienciaLaboralList) {
        this.experienciaLaboralList = experienciaLaboralList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+descripcion;
    }
    
}
