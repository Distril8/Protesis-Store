/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.model;


import ec.edu.espe.distribuidas.prosth.enums.TipoPagoEnum;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "modo_pago")
public class ModoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_PAGO", nullable = false)
    private Integer codigo;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_PAGO", nullable = false, length = 3)
    private TipoPagoEnum tipo;

    @Column(name = "DESCRIPCION", length = 200)
    private String descripcion;

    public ModoPago() {
    }

    public ModoPago(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

  

    public TipoPagoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagoEnum tipo) {
        this.tipo = tipo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModoPago other = (ModoPago) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModoPago{" + "codigo=" + codigo + ", tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }
    

    
}
