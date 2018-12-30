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
@Table(name = "idiomas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Idiomas.findAll", query = "SELECT i FROM Idiomas i")
    , @NamedQuery(name = "Idiomas.findById", query = "SELECT i FROM Idiomas i WHERE i.id = :id")
    , @NamedQuery(name = "Idiomas.findByIdioma", query = "SELECT i FROM Idiomas i WHERE i.idioma = :idioma")})
public class Idiomas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Idioma")
    private String idioma;
    @OneToMany(mappedBy = "idioma")
    private List<IdiomaCandidato> idiomaCandidatoList;
    @JoinColumn(name = "Escrito", referencedColumnName = "Id")
    @ManyToOne
    private Escrito escrito;
    @JoinColumn(name = "Hablado", referencedColumnName = "Id")
    @ManyToOne
    private Hablado hablado;
    @JoinColumn(name = "Estado", referencedColumnName = "Id")
    @ManyToOne
    private Estado estado;

    public Idiomas() {
    }

    public Idiomas(Integer id) {
        this.id = id;
    }

    public Idiomas(Integer id, String idioma) {
        this.id = id;
        this.idioma = idioma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @XmlTransient
    public List<IdiomaCandidato> getIdiomaCandidatoList() {
        return idiomaCandidatoList;
    }

    public void setIdiomaCandidatoList(List<IdiomaCandidato> idiomaCandidatoList) {
        this.idiomaCandidatoList = idiomaCandidatoList;
    }

    public Escrito getEscrito() {
        return escrito;
    }

    public void setEscrito(Escrito escrito) {
        this.escrito = escrito;
    }

    public Hablado getHablado() {
        return hablado;
    }

    public void setHablado(Hablado hablado) {
        this.hablado = hablado;
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
        if (!(object instanceof Idiomas)) {
            return false;
        }
        Idiomas other = (Idiomas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+idioma;
    }
    
}
