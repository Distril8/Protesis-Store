/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.dao;


import ec.edu.espe.distribuidas.prosth.model.Camion;
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
public class CamionFacade extends AbstractFacade<Camion> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em1;

    @Override
    protected EntityManager getEntityManager() {
        return em1;
    }

    public CamionFacade() {
        super(Camion.class);
    }
    
    public List<Camion> findByPlaca(String placa) {
        Query qry = this.em1.createQuery("SELECT obj FROM Camion obj WHERE obj.placa=?1");
        qry.setParameter(1, placa);
        return qry.getResultList();
    }
}
