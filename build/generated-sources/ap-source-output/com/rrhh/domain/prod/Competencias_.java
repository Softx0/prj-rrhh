package com.rrhh.domain.prod;

import com.rrhh.domain.CompetenciaCandidato;
import com.rrhh.domain.Competencias;
import com.rrhh.domain.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-31T00:12:32")
@StaticMetamodel(Competencias.class)
public class Competencias_ { 

    public static volatile ListAttribute<Competencias, CompetenciaCandidato> competenciaCandidatoList;
    public static volatile SingularAttribute<Competencias, Estado> estado;
    public static volatile SingularAttribute<Competencias, Integer> id;
    public static volatile SingularAttribute<Competencias, String> competencia;

}