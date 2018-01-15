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
@Table(name = "detalle_venta")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_DETALLE", nullable = false, length = 10)
    private String codigo;
    
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codVenta;
    
    @Column(name = "COD_PRODUCTO", nullable = false)
    private Integer codProducto;
    
    @Column(name = "COD_PAGO", nullable = false)
    private Integer codPago;

    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    @Column(name = "VALOR_UNITARIO", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorUnitario;

    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumn(name = "COD_PRODUCTO", referencedColumnName = "COD_PRODUCTO", 
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Producto producto;
    
    @JoinColumn(name = "COD_PAGO", referencedColumnName = "COD_PAGO", 
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private ModoPago pago;
    
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA", 
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Venta venta;

    public DetalleVenta() {
    }

    public DetalleVenta(String codDetalle) {
        this.codigo = codDetalle;
    }


    public String getCodDetalle() {
        return codigo;
    }

    public void setCodDetalle(String codDetalle) {
        this.codigo = codDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public Integer getCodPago() {
        return codPago;
    }

    public void setCodPago(Integer codPago) {
        this.codPago = codPago;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public ModoPago getPago() {
        return pago;
    }

    public void setPago(ModoPago pago) {
        this.pago = pago;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.DetalleVenta[ codDetalle=" + codigo + " ]";
    }
    
}
