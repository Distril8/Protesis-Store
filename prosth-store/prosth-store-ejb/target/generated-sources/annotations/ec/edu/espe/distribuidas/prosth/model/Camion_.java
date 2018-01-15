package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.CamionPK;
import ec.edu.espe.distribuidas.prosth.model.Conductor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Camion.class)
public class Camion_ { 

    public static volatile SingularAttribute<Camion, String> marca;
    public static volatile SingularAttribute<Camion, String> color;
    public static volatile SingularAttribute<Camion, CamionPK> camionPK;
    public static volatile SingularAttribute<Camion, String> modelo;
    public static volatile SingularAttribute<Camion, Conductor> conductor;
    public static volatile SingularAttribute<Camion, String> placa;

}