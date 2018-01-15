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
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "compra")
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_COMPRA", nullable = false)
    private Integer codigo;
    
    @Column(name = "COD_PROVEEDOR", nullable = false)
    private Integer codProveedor;
    
    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumn(name = "COD_PROVEEDOR", referencedColumnName = "COD_PROVEEDOR", 
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Proveedor proveedor;


    public Compra() {
    }

    public Compra(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodCompra() {
        return codigo;
    }

    public void setCodCompra(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Integer codProveedor) {
        this.codProveedor = codProveedor;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Compra[ codCompra=" + codigo + " ]";
    }
    
}
