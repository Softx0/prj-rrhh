/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rrhh.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "candidatos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Candidatos.findAll", query = "SELECT c FROM Candidatos c")
    , @NamedQuery(name = "Candidatos.findById", query = "SELECT c FROM Candidatos c WHERE c.id = :id")
    , @NamedQuery(name = "Candidatos.findByCedula", query = "SELECT c FROM Candidatos c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Candidatos.findByNombre", query = "SELECT c FROM Candidatos c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Candidatos.findBySalarioAspira", query = "SELECT c FROM Candidatos c WHERE c.salarioAspira = :salarioAspira")
    , @NamedQuery(name = "Candidatos.findByFechaNacimiento", query = "SELECT c FROM Candidatos c WHERE c.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Candidatos.findByEmail", query = "SELECT c FROM Candidatos c WHERE c.email = :email")
    , @NamedQuery(name = "Candidatos.findByTelefono", query = "SELECT c FROM Candidatos c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Candidatos.findByResumen", query = "SELECT c FROM Candidatos c WHERE c.resumen = :resumen")})
public class Candidatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "Cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Salario_Aspira")
    private Double salarioAspira;
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "Email")
    private String email;
    @Size(max = 100)
    @Column(name = "Telefono")
    private String telefono;
    @Size(max = 400)
    @Column(name = "Resumen")
    private String resumen;
    @OneToMany(mappedBy = "candidato")
    private List<RecomendacionCandidato> recomendacionCandidatoList;
    @JoinColumn(name = "Estado", referencedColumnName = "Id")
    @ManyToOne
    private EstadoCandidato estado;
    @JoinColumn(name = "EstadoCivil", referencedColumnName = "Id")
    @ManyToOne
    private EstadoCivil estadoCivil;
    @OneToMany(mappedBy = "candidato")
    private List<CapacitacionCandidato> capacitacionCandidatoList;
    @OneToMany(mappedBy = "candidato")
    private List<CompetenciaCandidato> competenciaCandidatoList;
    @OneToMany(mappedBy = "candidato")
    private List<IdiomaCandidato> idiomaCandidatoList;
    @OneToMany(mappedBy = "candidato")
    private List<ExplaboralCandidato> explaboralCandidatoList;

    public Candidatos() {
    }

    public Candidatos(Integer id) {
        this.id = id;
    }

    public Candidatos(Integer id, String cedula, String nombre) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalarioAspira() {
        return salarioAspira;
    }

    public void setSalarioAspira(Double salarioAspira) {
        this.salarioAspira = salarioAspira;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @XmlTransient
    public List<RecomendacionCandidato> getRecomendacionCandidatoList() {
        return recomendacionCandidatoList;
    }

    public void setRecomendacionCandidatoList(List<RecomendacionCandidato> recomendacionCandidatoList) {
        this.recomendacionCandidatoList = recomendacionCandidatoList;
    }

    public EstadoCandidato getEstado() {
        return estado;
    }

    public void setEstado(EstadoCandidato estado) {
        this.estado = estado;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @XmlTransient
    public List<CapacitacionCandidato> getCapacitacionCandidatoList() {
        return capacitacionCandidatoList;
    }

    public void setCapacitacionCandidatoList(List<CapacitacionCandidato> capacitacionCandidatoList) {
        this.capacitacionCandidatoList = capacitacionCandidatoList;
    }

    @XmlTransient
    public List<CompetenciaCandidato> getCompetenciaCandidatoList() {
        return competenciaCandidatoList;
    }

    public void setCompetenciaCandidatoList(List<CompetenciaCandidato> competenciaCandidatoList) {
        this.competenciaCandidatoList = competenciaCandidatoList;
    }

    @XmlTransient
    public List<IdiomaCandidato> getIdiomaCandidatoList() {
        return idiomaCandidatoList;
    }

    public void setIdiomaCandidatoList(List<IdiomaCandidato> idiomaCandidatoList) {
        this.idiomaCandidatoList = idiomaCandidatoList;
    }

    @XmlTransient
    public List<ExplaboralCandidato> getExplaboralCandidatoList() {
        return explaboralCandidatoList;
    }

    public void setExplaboralCandidatoList(List<ExplaboralCandidato> explaboralCandidatoList) {
        this.explaboralCandidatoList = explaboralCandidatoList;
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
        if (!(object instanceof Candidatos)) {
            return false;
        }
        Candidatos other = (Candidatos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nombre;
    }

}
