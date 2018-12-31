package com.rrhh.domain.prod;

import com.rrhh.domain.Hablado;
import com.rrhh.domain.Idiomas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-31T00:12:32")
@StaticMetamodel(Hablado.class)
public class Hablado_ { 

    public static volatile SingularAttribute<Hablado, String> descripcion;
    public static volatile SingularAttribute<Hablado, Integer> id;
    public static volatile ListAttribute<Hablado, Idiomas> idiomasList;

}