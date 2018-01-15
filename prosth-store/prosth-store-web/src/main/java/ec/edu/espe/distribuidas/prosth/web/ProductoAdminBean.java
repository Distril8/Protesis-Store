/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.prosth.web;


import ec.edu.espe.distribuidas.prosth.model.Categoria;
import ec.edu.espe.distribuidas.prosth.model.Producto;
import ec.edu.espe.distribuidas.prosth.service.CategoriaService;
import ec.edu.espe.distribuidas.prosth.service.ProductoService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Hendrix
 */
@Named
@ViewScoped
public class ProductoAdminBean  extends BaseBean implements Serializable{
    
    private String filtro;
    private Integer categoriaBusqueda;
    private boolean enBusquedaPorTipo;
    private List<Categoria> categorias;
    

    
    private List<Producto> productos;
    private Producto producto;
    private Producto productoSel;
    
    @Inject
    private CategoriaService categoriaService;
    @Inject
    private ProductoService productoService;
    
    @PostConstruct
    public void init() {
        this.categorias = this.categoriaService.obtenerTodos();
    }
    
    public void cambiarFiltro() {
        this.enBusquedaPorTipo = !this.enBusquedaPorTipo;
        System.out.println("Valor para enbusqueda: "+this.enBusquedaPorTipo);
    }
    
    public void buscar() {
            this.productos = this.productoService.buscarPorTipo(this.categoriaBusqueda);
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public Integer getCategoriaBusqueda() {
        return categoriaBusqueda;
    }

    public void setCategoriaBusqueda(Integer categoriaBusqueda) {
        this.categoriaBusqueda = categoriaBusqueda;
    }


    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProductoSel() {
        return productoSel;
    }

    public void setProductoSel(Producto productoSel) {
        this.productoSel = productoSel;
    }

   

    public boolean isEnBusquedaPorTipo() {
        return enBusquedaPorTipo;
    }

   
    
    
}
