package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.EstadoCivil;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(EstadoCivil.class)
public class EstadoCivil_ { 

    public static volatile SingularAttribute<EstadoCivil, String> descripcion;
    public static volatile ListAttribute<EstadoCivil, Candidatos> candidatosList;
    public static volatile SingularAttribute<EstadoCivil, Integer> id;

}