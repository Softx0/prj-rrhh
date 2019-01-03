package com.rrhh.domain.prod;

import com.rrhh.domain.Escrito;
import com.rrhh.domain.Estado;
import com.rrhh.domain.Hablado;
import com.rrhh.domain.IdiomaCandidato;
import com.rrhh.domain.Idiomas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(Idiomas.class)
public class Idiomas_ { 

    public static volatile ListAttribute<Idiomas, IdiomaCandidato> idiomaCandidatoList;
    public static volatile SingularAttribute<Idiomas, Estado> estado;
    public static volatile SingularAttribute<Idiomas, String> idioma;
    public static volatile SingularAttribute<Idiomas, Integer> id;
    public static volatile SingularAttribute<Idiomas, Escrito> escrito;
    public static volatile SingularAttribute<Idiomas, Hablado> hablado;

}