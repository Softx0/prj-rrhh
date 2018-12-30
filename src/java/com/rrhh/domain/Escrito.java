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
@Table(name = "escrito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Escrito.findAll", query = "SELECT e FROM Escrito e")
    , @NamedQuery(name = "Escrito.findById", query = "SELECT e FROM Escrito e WHERE e.id = :id")
    , @NamedQuery(name = "Escrito.findByDescripcion", query = "SELECT e FROM Escrito e WHERE e.descripcion = :descripcion")})
public class Escrito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "escrito")
    private List<Idiomas> idiomasList;

    public Escrito() {
    }

    public Escrito(Integer id) {
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
    public List<Idiomas> getIdiomasList() {
        return idiomasList;
    }

    public void setIdiomasList(List<Idiomas> idiomasList) {
        this.idiomasList = idiomasList;
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
        if (!(object instanceof Escrito)) {
            return false;
        }
        Escrito other = (Escrito) object;
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
