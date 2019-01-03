package com.rrhh.domain.prod;

import com.rrhh.domain.Escrito;
import com.rrhh.domain.Idiomas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(Escrito.class)
public class Escrito_ { 

    public static volatile SingularAttribute<Escrito, String> descripcion;
    public static volatile SingularAttribute<Escrito, Integer> id;
    public static volatile ListAttribute<Escrito, Idiomas> idiomasList;

}