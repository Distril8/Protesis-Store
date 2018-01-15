/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * Protesis Store Corp.
 */

@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_CIUDAD", nullable = false)
    private Integer codCiudad;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "COD_PROVINCIA", nullable = false, length = 100)
    private Integer codProvincia;
    
    @JoinColumn(name = "COD_PROVINCIA", referencedColumnName = "COD_PROVINCIA", nullable = false , insertable = false, updatable = false)
    @ManyToOne
    private Provincia provincia;

    public Ciudad() {
    }

    public Ciudad(Integer codCiudad) {
        this.codCiudad = codCiudad;
    }


    public Integer getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(Integer codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(Integer codProvincia) {
        this.codProvincia = codProvincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCiudad != null ? codCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.codCiudad == null && other.codCiudad != null) || (this.codCiudad != null && !this.codCiudad.equals(other.codCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.Ciudad[ codCiudad=" + codCiudad + " ]";
    }
    
}
