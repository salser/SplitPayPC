package org.palitos.negocio.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.palitos.negocio.entidades.Factura;
import org.palitos.negocio.entidades.Miembro;
import org.palitos.negocio.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-04T10:06:39")
@StaticMetamodel(Grupo.class)
public class Grupo_ { 

    public static volatile ListAttribute<Grupo, Miembro> miembroList;
    public static volatile SingularAttribute<Grupo, Long> groupid;
    public static volatile SingularAttribute<Grupo, String> displayname;
    public static volatile SingularAttribute<Grupo, Short> isactive;
    public static volatile ListAttribute<Grupo, Factura> facturaList;
    public static volatile SingularAttribute<Grupo, Usuario> leaderid;

}