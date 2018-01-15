/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.service;


import ec.edu.espe.distribuidas.prosth.dao.ProductoFacade;
import ec.edu.espe.distribuidas.prosth.dao.ProveedorFacade;
import ec.edu.espe.distribuidas.prosth.model.Producto;
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
public class ProductoService {
    
    @EJB
    private ProductoFacade productoFacade;

    public List<Producto> obtenerTodos() {
        return this.productoFacade.findAll();
    }

    public Producto obtenerPorCodigo(Integer codigo) {
        return this.productoFacade.find(codigo);
    }

    public void crear(Producto producto) {
        this.productoFacade.create(producto);
    }

    public void modificar(Producto producto) {
        this.productoFacade.edit(producto);
    }

    public void eliminar(Integer codigo) {
        Producto producto = this.productoFacade.find(codigo);
        this.productoFacade.remove(producto);
    }
    
     public List<Producto> buscarPorTipo(Integer tipoProductoBusqueda) {
        return this.productoFacade.findByTipo(tipoProductoBusqueda);
    }
    
}
