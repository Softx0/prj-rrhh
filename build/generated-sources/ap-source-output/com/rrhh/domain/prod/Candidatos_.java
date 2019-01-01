package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.CapacitacionCandidato;
import com.rrhh.domain.CompetenciaCandidato;
import com.rrhh.domain.EstadoCandidato;
import com.rrhh.domain.EstadoCivil;
import com.rrhh.domain.ExplaboralCandidato;
import com.rrhh.domain.IdiomaCandidato;
import com.rrhh.domain.RecomendacionCandidato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-01T11:57:56")
@StaticMetamodel(Candidatos.class)
public class Candidatos_ { 

    public static volatile ListAttribute<Candidatos, RecomendacionCandidato> recomendacionCandidatoList;
    public static volatile SingularAttribute<Candidatos, EstadoCandidato> estado;
    public static volatile ListAttribute<Candidatos, CapacitacionCandidato> capacitacionCandidatoList;
    public static volatile SingularAttribute<Candidatos, Date> fechaNacimiento;
    public static volatile SingularAttribute<Candidatos, String> cedula;
    public static volatile SingularAttribute<Candidatos, String> resumen;
    public static volatile SingularAttribute<Candidatos, EstadoCivil> estadoCivil;
    public static volatile SingularAttribute<Candidatos, String> nombre;
    public static volatile ListAttribute<Candidatos, CompetenciaCandidato> competenciaCandidatoList;
    public static volatile ListAttribute<Candidatos, IdiomaCandidato> idiomaCandidatoList;
    public static volatile SingularAttribute<Candidatos, Double> salarioAspira;
    public static volatile SingularAttribute<Candidatos, Integer> id;
    public static volatile SingularAttribute<Candidatos, String> telefono;
    public static volatile ListAttribute<Candidatos, ExplaboralCandidato> explaboralCandidatoList;
    public static volatile SingularAttribute<Candidatos, String> email;

}