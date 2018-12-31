package com.rrhh.domain.prod;

import com.rrhh.domain.CapacitacionCandidato;
import com.rrhh.domain.Capacitaciones;
import com.rrhh.domain.Estado;
import com.rrhh.domain.NivelAcademico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-31T00:12:32")
@StaticMetamodel(Capacitaciones.class)
public class Capacitaciones_ { 

    public static volatile SingularAttribute<Capacitaciones, Estado> estado;
    public static volatile SingularAttribute<Capacitaciones, Date> fechaHasta;
    public static volatile ListAttribute<Capacitaciones, CapacitacionCandidato> capacitacionCandidatoList;
    public static volatile SingularAttribute<Capacitaciones, Date> fechaDesde;
    public static volatile SingularAttribute<Capacitaciones, String> institucion;
    public static volatile SingularAttribute<Capacitaciones, String> titulo;
    public static volatile SingularAttribute<Capacitaciones, Integer> id;
    public static volatile SingularAttribute<Capacitaciones, NivelAcademico> nivelAcademico;
    public static volatile SingularAttribute<Capacitaciones, Integer> nivel;

}