/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.service;


import ec.edu.espe.distribuidas.prosth.dao.ProveedorFacade;
import ec.edu.espe.distribuidas.prosth.model.Proveedor;
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
public class ProveedorService {
    
    @EJB
    private ProveedorFacade proveedorFacade;

    public List<Proveedor> obtenerTodos() {
        return this.proveedorFacade.findAll();
    }

    public Proveedor obtenerPorCodigo(Integer codigo) {
        return this.proveedorFacade.find(codigo);
    }

    public void crear(Proveedor proveedor) {
        this.proveedorFacade.create(proveedor);
    }

    public void modificar(Proveedor proveedor) {
        this.proveedorFacade.edit(proveedor);
    }

    public void eliminar(Integer codigo) {
        Proveedor proveedor = this.proveedorFacade.find(codigo);
        this.proveedorFacade.remove(proveedor);
    }
}
