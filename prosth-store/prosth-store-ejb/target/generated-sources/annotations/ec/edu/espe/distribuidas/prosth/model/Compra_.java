package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.Proveedor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Integer> codigo;
    public static volatile SingularAttribute<Compra, Integer> codProveedor;
    public static volatile SingularAttribute<Compra, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Compra, Proveedor> proveedor;

}