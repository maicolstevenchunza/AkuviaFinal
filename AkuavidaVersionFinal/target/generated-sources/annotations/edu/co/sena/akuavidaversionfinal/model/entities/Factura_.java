package edu.co.sena.akuavidaversionfinal.model.entities;

import edu.co.sena.akuavidaversionfinal.model.entities.Cuenta;
import edu.co.sena.akuavidaversionfinal.model.entities.Pago;
import edu.co.sena.akuavidaversionfinal.model.entities.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-02T17:18:50")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Pago> pago;
    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Pedido> pedido;
    public static volatile SingularAttribute<Factura, Integer> iDFactura;
    public static volatile SingularAttribute<Factura, Cuenta> cuenta;

}