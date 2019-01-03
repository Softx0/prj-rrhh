package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.Recomendacion;
import com.rrhh.domain.RecomendacionCandidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(RecomendacionCandidato.class)
public class RecomendacionCandidato_ { 

    public static volatile SingularAttribute<RecomendacionCandidato, Recomendacion> recomendacion;
    public static volatile SingularAttribute<RecomendacionCandidato, Integer> id;
    public static volatile SingularAttribute<RecomendacionCandidato, Candidatos> candidato;

}