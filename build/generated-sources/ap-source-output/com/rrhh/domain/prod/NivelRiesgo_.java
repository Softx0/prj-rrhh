package com.rrhh.domain.prod;

import com.rrhh.domain.NivelRiesgo;
import com.rrhh.domain.Puestos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-01T11:57:56")
@StaticMetamodel(NivelRiesgo.class)
public class NivelRiesgo_ { 

    public static volatile SingularAttribute<NivelRiesgo, String> descripcion;
    public static volatile ListAttribute<NivelRiesgo, Puestos> puestosList;
    public static volatile SingularAttribute<NivelRiesgo, Integer> id;

}