package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.Camion;
import ec.edu.espe.distribuidas.prosth.model.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile SingularAttribute<Entrega, String> descripcion;
    public static volatile SingularAttribute<Entrega, Camion> camion;
    public static volatile SingularAttribute<Entrega, String> codigo;
    public static volatile SingularAttribute<Entrega, Venta> venta;
    public static volatile SingularAttribute<Entrega, Date> fechaLlegada;
    public static volatile SingularAttribute<Entrega, Integer> codConductor;
    public static volatile SingularAttribute<Entrega, Integer> codCamion;
    public static volatile SingularAttribute<Entrega, Date> fechaSalida;
    public static volatile SingularAttribute<Entrega, Integer> codVenta;

}