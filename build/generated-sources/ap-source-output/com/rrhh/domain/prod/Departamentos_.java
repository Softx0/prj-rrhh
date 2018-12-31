package com.rrhh.domain.prod;

import com.rrhh.domain.Departamentos;
import com.rrhh.domain.Estado;
import com.rrhh.domain.Puestos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-31T00:12:32")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, String> descripcion;
    public static volatile SingularAttribute<Departamentos, Estado> estado;
    public static volatile ListAttribute<Departamentos, Puestos> puestosList;
    public static volatile SingularAttribute<Departamentos, Integer> id;

}