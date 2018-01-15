/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.service;


import ec.edu.espe.distribuidas.prosth.dao.CategoriaFacade;
import ec.edu.espe.distribuidas.prosth.model.Categoria;
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
public class CategoriaService {
    
    @EJB
    private CategoriaFacade categoriaFacade;

    public List<Categoria> obtenerTodos() {
        return this.categoriaFacade.findAll();
    }

    public Categoria obtenerPorCodigo(Integer codigo) {
        return this.categoriaFacade.find(codigo);
    }

    public void crear(Categoria categoria) {
        this.categoriaFacade.create(categoria);
    }

    public void modificar(Categoria categoria) {
        this.categoriaFacade.edit(categoria);
    }

    public void eliminar(Integer codigo) {
        Categoria categoria = this.categoriaFacade.find(codigo);
        this.categoriaFacade.remove(categoria);
    }
}
