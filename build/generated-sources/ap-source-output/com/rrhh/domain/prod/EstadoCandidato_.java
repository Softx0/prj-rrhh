package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.EstadoCandidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-01T11:57:56")
@StaticMetamodel(EstadoCandidato.class)
public class EstadoCandidato_ { 

    public static volatile SingularAttribute<EstadoCandidato, Boolean> descripcion;
    public static volatile ListAttribute<EstadoCandidato, Candidatos> candidatosList;
    public static volatile SingularAttribute<EstadoCandidato, Integer> id;

}