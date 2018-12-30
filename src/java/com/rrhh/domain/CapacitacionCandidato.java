/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "capacitacion_candidato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CapacitacionCandidato.findAll", query = "SELECT c FROM CapacitacionCandidato c")
    , @NamedQuery(name = "CapacitacionCandidato.findById", query = "SELECT c FROM CapacitacionCandidato c WHERE c.id = :id")})
public class CapacitacionCandidato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "Capacitacion", referencedColumnName = "Id")
    @ManyToOne
    private Capacitaciones capacitacion;
    @JoinColumn(name = "Candidato", referencedColumnName = "Id")
    @ManyToOne
    private Candidatos candidato;

    public CapacitacionCandidato() {
    }

    public CapacitacionCandidato(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Capacitaciones getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitaciones capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Candidatos getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidatos candidato) {
        this.candidato = candidato;
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
        if (!(object instanceof CapacitacionCandidato)) {
            return false;
        }
        CapacitacionCandidato other = (CapacitacionCandidato) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+candidato.getNombre();
    }
    
}
