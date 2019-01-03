package com.rrhh.domain.prod;

import com.rrhh.domain.Estado;
import com.rrhh.domain.ExperienciaLaboral;
import com.rrhh.domain.ExplaboralCandidato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(ExperienciaLaboral.class)
public class ExperienciaLaboral_ { 

    public static volatile SingularAttribute<ExperienciaLaboral, Estado> estado;
    public static volatile SingularAttribute<ExperienciaLaboral, Date> fechaHasta;
    public static volatile SingularAttribute<ExperienciaLaboral, Date> fechaDesde;
    public static volatile SingularAttribute<ExperienciaLaboral, Double> salario;
    public static volatile SingularAttribute<ExperienciaLaboral, Integer> id;
    public static volatile SingularAttribute<ExperienciaLaboral, String> empresa;
    public static volatile ListAttribute<ExperienciaLaboral, ExplaboralCandidato> explaboralCandidatoList;
    public static volatile SingularAttribute<ExperienciaLaboral, String> puestoOcupado;
    public static volatile SingularAttribute<ExperienciaLaboral, String> pais;

}