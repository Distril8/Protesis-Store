/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.dao;


import ec.edu.espe.distribuidas.prosth.model.ModoPago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
public class ModoPagoFacade extends AbstractFacade<ModoPago> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em1;

    @Override
    protected EntityManager getEntityManager() {
        return em1;
    }

    public ModoPagoFacade() {
        super(ModoPago.class);
    }
    
}
