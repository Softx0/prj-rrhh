package com.rrhh.domain.prod;

import com.rrhh.domain.Estado;
import com.rrhh.domain.Recomendacion;
import com.rrhh.domain.RecomendacionCandidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(Recomendacion.class)
public class Recomendacion_ { 

    public static volatile SingularAttribute<Recomendacion, String> puesto;
    public static volatile ListAttribute<Recomendacion, RecomendacionCandidato> recomendacionCandidatoList;
    public static volatile SingularAttribute<Recomendacion, Estado> estado;
    public static volatile SingularAttribute<Recomendacion, Integer> id;
    public static volatile SingularAttribute<Recomendacion, String> empresa;
    public static volatile SingularAttribute<Recomendacion, String> telefono;
    public static volatile SingularAttribute<Recomendacion, String> nombre;

}