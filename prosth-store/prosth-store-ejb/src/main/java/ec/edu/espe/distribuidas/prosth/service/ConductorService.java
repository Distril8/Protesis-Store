/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.service;


import ec.edu.espe.distribuidas.prosth.dao.ConductorFacade;
import ec.edu.espe.distribuidas.prosth.model.Conductor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Protesis Store Corp.
 */
@Stateless
@LocalBean
public class ConductorService {
    
    @EJB
    private ConductorFacade conductorFacade;

    public List<Conductor> obtenerTodos() {
        return this.conductorFacade.findAll();
    }

    public Conductor obtenerPorCodigo(Integer codigo) {
        return this.conductorFacade.find(codigo);
    }

    public void crear(Conductor conductor) {
        this.conductorFacade.create(conductor);
    }

    public void modificar(Conductor conductor) {
        this.conductorFacade.edit(conductor);
    }

    public void eliminar(Integer codigo) {
        Conductor conductor = this.conductorFacade.find(codigo);
        this.conductorFacade.remove(conductor);
    }
}
