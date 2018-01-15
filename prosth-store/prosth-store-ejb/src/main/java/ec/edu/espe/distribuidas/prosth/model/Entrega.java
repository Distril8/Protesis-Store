/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.model;

import java.io.Serializable;
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
@Table(name = "entrega")
public class Entrega implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_ENTREGA", nullable = false, length = 10)
    private String codigo;
    
    @Column(name = "COD_VENTA", nullable = false)
    private Integer codVenta;
    
    @Column(name = "COD_CONDUCTOR", nullable = false)
    private Integer codConductor;
    
    @Column(name = "COD_CAMION", nullable = false)
    private Integer codCamion;

    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    
    @Column(name = "FECHA_SALIDA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;

    @Column(name = "FECHA_LLEGADA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLlegada;
    
    @JoinColumn(name = "COD_VENTA", referencedColumnName = "COD_VENTA",
            nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private Venta venta;
    
    @JoinColumns({
        @JoinColumn(name = "COD_CAMION", referencedColumnName = "COD_CAMION", 
                nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "COD_CONDUCTOR", referencedColumnName = "COD_CONDUCTOR", 
                nullable = false, insertable = false, updatable = false)})
    @ManyToOne
    private Camion camion;

    public Entrega() {
    }

    public Entrega(String codEntrega) {
        this.codigo = codEntrega;
    }


    public String getCodEntrega() {
        return codigo;
    }

    public void setCodEntrega(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Integer codVenta) {
        this.codVenta = codVenta;
    }

    public Integer getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(Integer codConductor) {
        this.codConductor = codConductor;
    }

    public Integer getCodCamion() {
        return codCamion;
    }

    public void setCodCamion(Integer codCamion) {
        this.codCamion = codCamion;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Entrega[ codEntrega=" + codigo + " ]";
    }
    
}
