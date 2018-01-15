package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.Compra;
import ec.edu.espe.distribuidas.prosth.model.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ { 

    public static volatile SingularAttribute<DetalleCompra, String> descripcion;
    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, String> codigo;
    public static volatile SingularAttribute<DetalleCompra, Integer> codProveedor;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> valorTotal;
    public static volatile SingularAttribute<DetalleCompra, Integer> codCompra;
    public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Producto> producto;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> valorUnitario;

}