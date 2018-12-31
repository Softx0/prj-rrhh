package com.rrhh.domain.prod;

import com.rrhh.domain.Capacitaciones;
import com.rrhh.domain.NivelAcademico;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-31T00:12:32")
@StaticMetamodel(NivelAcademico.class)
public class NivelAcademico_ { 

    public static volatile SingularAttribute<NivelAcademico, String> descripcion;
    public static volatile SingularAttribute<NivelAcademico, Integer> id;
    public static volatile ListAttribute<NivelAcademico, Capacitaciones> capacitacionesList;

}