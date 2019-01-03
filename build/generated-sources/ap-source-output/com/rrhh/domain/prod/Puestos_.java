package com.rrhh.domain.prod;

import com.rrhh.domain.Departamentos;
import com.rrhh.domain.Estado;
import com.rrhh.domain.NivelRiesgo;
import com.rrhh.domain.Puestos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T10:29:54")
@StaticMetamodel(Puestos.class)
public class Puestos_ { 

    public static volatile SingularAttribute<Puestos, String> descripcion;
    public static volatile SingularAttribute<Puestos, Estado> estado;
    public static volatile SingularAttribute<Puestos, NivelRiesgo> nivelRiesgo;
    public static volatile SingularAttribute<Puestos, Departamentos> departamento;
    public static volatile SingularAttribute<Puestos, Integer> id;
    public static volatile SingularAttribute<Puestos, Double> salarioMaximo;
    public static volatile SingularAttribute<Puestos, Double> salarioMinimo;

}