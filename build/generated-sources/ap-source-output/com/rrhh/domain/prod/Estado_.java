package com.rrhh.domain.prod;

import com.rrhh.domain.Capacitaciones;
import com.rrhh.domain.Competencias;
import com.rrhh.domain.Departamentos;
import com.rrhh.domain.Estado;
import com.rrhh.domain.ExperienciaLaboral;
import com.rrhh.domain.Idiomas;
import com.rrhh.domain.Puestos;
import com.rrhh.domain.Recomendacion;
import com.rrhh.domain.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-01-03T11:19:41")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Boolean> descripcion;
    public static volatile ListAttribute<Estado, Recomendacion> recomendacionList;
    public static volatile ListAttribute<Estado, ExperienciaLaboral> experienciaLaboralList;
    public static volatile ListAttribute<Estado, Usuario> usuarioList;
    public static volatile ListAttribute<Estado, Departamentos> departamentosList;
    public static volatile ListAttribute<Estado, Puestos> puestosList;
    public static volatile ListAttribute<Estado, Competencias> competenciasList;
    public static volatile SingularAttribute<Estado, Integer> id;
    public static volatile ListAttribute<Estado, Idiomas> idiomasList;
    public static volatile ListAttribute<Estado, Capacitaciones> capacitacionesList;

}