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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codigo;
    
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codUsuario;
    
    @Column(name = "COD_TIPO_USUARIO", nullable = false)
    private Integer codTipoUsuario;

    @Column(name = "FECHA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "VALOR_TOTAL", nullable = false, precision = 8, scale = 2)
    private BigDecimal valorTotal;
    
    @JoinColumns({
        @JoinColumn(name = "COD_USUARIO", referencedColumnName = "COD_USUARIO",
                nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_TIPO_USUARIO", referencedColumnName = "COD_TIPO_USUARIO",
                nullable = false, insertable = false, updatable = false)})
    @ManyToOne
    private Usuario usuario;

    public Venta() {
    }

    public Venta(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodVenta() {
        return codigo;
    }

    public void setCodVenta(Integer codigo) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(Integer codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Venta[ codVenta=" + codigo + " ]";
    }
    
}
