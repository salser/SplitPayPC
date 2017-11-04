package org.palitos.negocio.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.palitos.negocio.entidades.Deuda;
import org.palitos.negocio.entidades.Grupo;
import org.palitos.negocio.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-04T10:06:39")
@StaticMetamodel(Miembro.class)
public class Miembro_ { 

    public static volatile SingularAttribute<Miembro, BigDecimal> balance;
    public static volatile ListAttribute<Miembro, Deuda> deudaList;
    public static volatile SingularAttribute<Miembro, Grupo> groupid;
    public static volatile SingularAttribute<Miembro, Long> idmember;
    public static volatile SingularAttribute<Miembro, Usuario> userid;

}