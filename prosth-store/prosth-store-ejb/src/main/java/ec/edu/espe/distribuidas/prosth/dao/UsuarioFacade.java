/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.dao;


import ec.edu.espe.distribuidas.prosth.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em1;

    @Override
    protected EntityManager getEntityManager() {
        return em1;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public List<Usuario> findByCodigo(String codUsuario, Integer codTipoUsuario) {
        Query qry = this.em1.createQuery("SELECT obj FROM Consumo obj WHERE obj.usuarioPK.codUsuario =?1 AND obj.usuarioPK.codTipoUsuario = ?2");
        qry.setParameter(1, codUsuario);
        qry.setParameter(2, codTipoUsuario);
        return qry.getResultList();
    }
    
    public List<Usuario> findByNombre(String nombre) {
        Query qry = this.em1.createQuery("SELECT obj FROM Usuario obj WHERE obj.nombre=?1");
        qry.setParameter(1, nombre);
        return qry.getResultList();
    }
    
    public List<Usuario> findByApellido(String apellido) {
        Query qry = this.em1.createQuery("SELECT obj FROM Usuario obj WHERE obj.apellido=?1");
        qry.setParameter(1, apellido);
        return qry.getResultList();
    }
    
    public List<Usuario> findByCi(String ci) {
        Query qry = this.em1.createQuery("SELECT obj FROM Usuario obj WHERE obj.ci=?1");
        qry.setParameter(1, ci);
        return qry.getResultList();
    }
}
