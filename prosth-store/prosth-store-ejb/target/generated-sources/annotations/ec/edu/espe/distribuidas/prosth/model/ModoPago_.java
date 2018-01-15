package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.enums.TipoPagoEnum;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(ModoPago.class)
public class ModoPago_ { 

    public static volatile SingularAttribute<ModoPago, String> descripcion;
    public static volatile SingularAttribute<ModoPago, Integer> codigo;
    public static volatile SingularAttribute<ModoPago, TipoPagoEnum> tipo;

}