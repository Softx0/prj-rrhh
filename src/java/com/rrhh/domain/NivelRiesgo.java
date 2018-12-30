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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "nivel_riesgo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NivelRiesgo.findAll", query = "SELECT n FROM NivelRiesgo n")
    , @NamedQuery(name = "NivelRiesgo.findById", query = "SELECT n FROM NivelRiesgo n WHERE n.id = :id")
    , @NamedQuery(name = "NivelRiesgo.findByDescripcion", query = "SELECT n FROM NivelRiesgo n WHERE n.descripcion = :descripcion")})
public class NivelRiesgo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "nivelRiesgo")
    private List<Puestos> puestosList;

    public NivelRiesgo() {
    }

    public NivelRiesgo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Puestos> getPuestosList() {
        return puestosList;
    }

    public void setPuestosList(List<Puestos> puestosList) {
        this.puestosList = puestosList;
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
        if (!(object instanceof NivelRiesgo)) {
            return false;
        }
        NivelRiesgo other = (NivelRiesgo) object;
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
