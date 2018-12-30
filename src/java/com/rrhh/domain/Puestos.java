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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "puestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puestos.findAll", query = "SELECT p FROM Puestos p")
    , @NamedQuery(name = "Puestos.findById", query = "SELECT p FROM Puestos p WHERE p.id = :id")
    , @NamedQuery(name = "Puestos.findByDescripcion", query = "SELECT p FROM Puestos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Puestos.findBySalarioMinimo", query = "SELECT p FROM Puestos p WHERE p.salarioMinimo = :salarioMinimo")
    , @NamedQuery(name = "Puestos.findBySalarioMaximo", query = "SELECT p FROM Puestos p WHERE p.salarioMaximo = :salarioMaximo")})
public class Puestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Salario_Minimo")
    private Double salarioMinimo;
    @Column(name = "Salario_Maximo")
    private Double salarioMaximo;
    @JoinColumn(name = "Estado", referencedColumnName = "Id")
    @ManyToOne
    private Estado estado;
    @JoinColumn(name = "Departamento", referencedColumnName = "Id")
    @ManyToOne
    private Departamentos departamento;
    @JoinColumn(name = "Nivel_Riesgo", referencedColumnName = "Id")
    @ManyToOne
    private NivelRiesgo nivelRiesgo;

    public Puestos() {
    }

    public Puestos(Integer id) {
        this.id = id;
    }

    public Puestos(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    public Double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(Double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public Double getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(Double salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(NivelRiesgo nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
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
        if (!(object instanceof Puestos)) {
            return false;
        }
        Puestos other = (Puestos) object;
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
