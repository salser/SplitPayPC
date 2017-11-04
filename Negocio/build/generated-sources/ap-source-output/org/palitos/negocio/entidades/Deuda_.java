package org.palitos.negocio.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.palitos.negocio.entidades.Factura;
import org.palitos.negocio.entidades.Miembro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-04T10:06:39")
@StaticMetamodel(Deuda.class)
public class Deuda_ { 

    public static volatile SingularAttribute<Deuda, Miembro> idmember;
    public static volatile SingularAttribute<Deuda, Long> idebt;
    public static volatile SingularAttribute<Deuda, BigDecimal> debt;
    public static volatile SingularAttribute<Deuda, Factura> idbill;

}