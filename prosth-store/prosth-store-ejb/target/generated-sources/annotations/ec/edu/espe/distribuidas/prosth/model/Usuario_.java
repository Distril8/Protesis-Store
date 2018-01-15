package ec.edu.espe.distribuidas.prosth.model;

import ec.edu.espe.distribuidas.prosth.model.Ciudad;
import ec.edu.espe.distribuidas.prosth.model.TipoUsuario;
import ec.edu.espe.distribuidas.prosth.model.UsuarioPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-14T20:32:32")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile SingularAttribute<Usuario, String> ci;
    public static volatile SingularAttribute<Usuario, String> callePrincipal;
    public static volatile SingularAttribute<Usuario, Integer> codCiudad;
    public static volatile SingularAttribute<Usuario, UsuarioPK> usuarioPK;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Ciudad> ciudad;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipoUsuario;
    public static volatile SingularAttribute<Usuario, Integer> codPostal;
    public static volatile SingularAttribute<Usuario, String> calleSecundaria;
    public static volatile SingularAttribute<Usuario, String> email;

}