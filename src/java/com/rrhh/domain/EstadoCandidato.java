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
@Table(name = "estado_candidato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCandidato.findAll", query = "SELECT e FROM EstadoCandidato e")
    , @NamedQuery(name = "EstadoCandidato.findById", query = "SELECT e FROM EstadoCandidato e WHERE e.id = :id")
    , @NamedQuery(name = "EstadoCandidato.findByDescripcion", query = "SELECT e FROM EstadoCandidato e WHERE e.descripcion = :descripcion")})
public class EstadoCandidato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Descripcion")
    private Boolean descripcion;
    @OneToMany(mappedBy = "estado")
    private List<Candidatos> candidatosList;

    public EstadoCandidato() {
    }

    public EstadoCandidato(Integer id) {
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
    public List<Candidatos> getCandidatosList() {
        return candidatosList;
    }

    public void setCandidatosList(List<Candidatos> candidatosList) {
        this.candidatosList = candidatosList;
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
        if (!(object instanceof EstadoCandidato)) {
            return false;
        }
        EstadoCandidato other = (EstadoCandidato) object;
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
