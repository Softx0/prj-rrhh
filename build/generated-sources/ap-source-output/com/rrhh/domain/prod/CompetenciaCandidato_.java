package com.rrhh.domain.prod;

import com.rrhh.domain.Candidatos;
import com.rrhh.domain.CompetenciaCandidato;
import com.rrhh.domain.Competencias;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(CompetenciaCandidato.class)
public class CompetenciaCandidato_ { 

    public static volatile SingularAttribute<CompetenciaCandidato, Integer> id;
    public static volatile SingularAttribute<CompetenciaCandidato, Candidatos> candidato;
    public static volatile SingularAttribute<CompetenciaCandidato, Competencias> competencia;

}