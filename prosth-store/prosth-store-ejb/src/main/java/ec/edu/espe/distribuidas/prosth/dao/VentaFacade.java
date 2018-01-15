/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.dao;


import ec.edu.espe.distribuidas.prosth.model.Venta;
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
public class VentaFacade extends AbstractFacade<Venta> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em1;

    @Override
    protected EntityManager getEntityManager() {
        return em1;
    }

    public VentaFacade() {
        super(Venta.class);
    }
    
    public List<Venta> findByCodigo(Integer codigo) {
        Query qry = this.em1.createQuery("SELECT obj FROM Venta obj WHERE obj.codigo=?1");
        qry.setParameter(1, codigo);
        return qry.getResultList();
    }
    
}
