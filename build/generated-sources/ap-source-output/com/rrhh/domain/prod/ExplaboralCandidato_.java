package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.ExperienciaLaboral;
import com.rrhh.domain.ExplaboralCandidato;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-01T11:57:56")
@StaticMetamodel(ExplaboralCandidato.class)
public class ExplaboralCandidato_ { 

    public static volatile SingularAttribute<ExplaboralCandidato, ExperienciaLaboral> experienciaLaboral;
    public static volatile SingularAttribute<ExplaboralCandidato, Integer> id;
    public static volatile SingularAttribute<ExplaboralCandidato, Candidatos> candidato;

}