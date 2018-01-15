package ec.edu.espe.distribuidas.prosth.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Conductor.class)
public class Conductor_ { 

    public static volatile SingularAttribute<Conductor, Integer> codigo;
    public static volatile SingularAttribute<Conductor, BigInteger> licencia;
    public static volatile SingularAttribute<Conductor, Date> fechaNacimiento;
    public static volatile SingularAttribute<Conductor, Long> ci;
    public static volatile SingularAttribute<Conductor, String> apellido;
    public static volatile SingularAttribute<Conductor, String> nombre;

}