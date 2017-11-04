package org.palitos.negocio.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.palitos.negocio.entidades.Deuda;
import org.palitos.negocio.entidades.Grupo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-04T10:06:39")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, BigDecimal> amount;
    public static volatile ListAttribute<Factura, Deuda> deudaList;
    public static volatile SingularAttribute<Factura, String> expensetitle;
    public static volatile SingularAttribute<Factura, Long> billid;
    public static volatile SingularAttribute<Factura, Grupo> groupid;

}