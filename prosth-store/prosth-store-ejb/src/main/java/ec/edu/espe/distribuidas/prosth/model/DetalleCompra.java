/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "detalle_compra")
public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_DETALLE_COMPRA", nullable = false, length = 10)
    private String codigo;
    
    @Column(name = "COD_COMPRA", nullable = false)
    private Integer codCompra;
    
    @Column(name = "COD_PROVEEDOR", nullable = false)
    private Integer codProveedor;
   
    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;

    @Column(name = "VALOR_UNITARIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorUnitario;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;
    
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO",
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Producto producto;
    
    @JoinColumn(name = "COD_COMPRA", referencedColumnName = "COD_COMPRA",
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Compra compra;

    public DetalleCompra() {
    }

    public DetalleCompra(String codDetalleCompra) {
        this.codigo = codDetalleCompra;
    }


    public String getCodDetalleCompra() {
        return codigo;
    }

    public void setCodDetalleCompra(String codDetalleCompra) {
        this.codigo = codDetalleCompra;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.DetalleCompra[ codDetalleCompra=" + codigo + " ]";
    }
    
}
