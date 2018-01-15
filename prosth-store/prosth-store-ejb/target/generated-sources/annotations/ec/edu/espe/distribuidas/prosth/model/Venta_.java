package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Integer> codigo;
    public static volatile SingularAttribute<Venta, Integer> codUsuario;
    public static volatile SingularAttribute<Venta, Integer> codTipoUsuario;
    public static volatile SingularAttribute<Venta, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Venta, Usuario> usuario;

}