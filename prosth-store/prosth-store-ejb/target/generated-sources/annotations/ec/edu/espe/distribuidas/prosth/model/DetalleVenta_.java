package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.ModoPago;
import ec.edu.espe.distribuidas.prosth.model.Producto;
import ec.edu.espe.distribuidas.prosth.model.Venta;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, String> descripcion;
    public static volatile SingularAttribute<DetalleVenta, String> codigo;
    public static volatile SingularAttribute<DetalleVenta, Integer> codProducto;
    public static volatile SingularAttribute<DetalleVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleVenta, BigDecimal> valorTotal;
    public static volatile SingularAttribute<DetalleVenta, Integer> codPago;
    public static volatile SingularAttribute<DetalleVenta, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleVenta, Integer> codVenta;
    public static volatile SingularAttribute<DetalleVenta, ModoPago> pago;
    public static volatile SingularAttribute<DetalleVenta, BigDecimal> valorUnitario;

}