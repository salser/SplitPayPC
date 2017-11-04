package org.palitos.negocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.palitos.negocio.entidades.Grupo;
import org.palitos.negocio.entidades.Miembro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-04T10:06:39")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Grupo> grupoList;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Short> isoffline;
    public static volatile ListAttribute<Usuario, Miembro> miembroList;
    public static volatile SingularAttribute<Usuario, String> displayname;
    public static volatile SingularAttribute<Usuario, String> typeid;
    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, Long> userid;
    public static volatile SingularAttribute<Usuario, String> email;

}