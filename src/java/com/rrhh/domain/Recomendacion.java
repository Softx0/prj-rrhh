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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "recomendacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recomendacion.findAll", query = "SELECT r FROM Recomendacion r")
    , @NamedQuery(name = "Recomendacion.findById", query = "SELECT r FROM Recomendacion r WHERE r.id = :id")
    , @NamedQuery(name = "Recomendacion.findByNombre", query = "SELECT r FROM Recomendacion r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Recomendacion.findByEmpresa", query = "SELECT r FROM Recomendacion r WHERE r.empresa = :empresa")
    , @NamedQuery(name = "Recomendacion.findByPuesto", query = "SELECT r FROM Recomendacion r WHERE r.puesto = :puesto")
    , @NamedQuery(name = "Recomendacion.findByTelefono", query = "SELECT r FROM Recomendacion r WHERE r.telefono = :telefono")})
public class Recomendacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "Empresa")
    private String empresa;
    @Size(max = 100)
    @Column(name = "Puesto")
    private String puesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Telefono")
    private String telefono;
    @OneToMany(mappedBy = "recomendacion")
    private List<RecomendacionCandidato> recomendacionCandidatoList;
    @JoinColumn(name = "Estado", referencedColumnName = "Id")
    @ManyToOne
    private Estado estado;

    public Recomendacion() {
    }

    public Recomendacion(Integer id) {
        this.id = id;
    }

    public Recomendacion(Integer id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public List<RecomendacionCandidato> getRecomendacionCandidatoList() {
        return recomendacionCandidatoList;
    }

    public void setRecomendacionCandidatoList(List<RecomendacionCandidato> recomendacionCandidatoList) {
        this.recomendacionCandidatoList = recomendacionCandidatoList;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
        if (!(object instanceof Recomendacion)) {
            return false;
        }
        Recomendacion other = (Recomendacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+nombre;
    }
    
}
