/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Protesis Store Corp.
 */
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "COD_CATEGORIA", nullable = false)
    private Integer codigo;
   
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;
  
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    private String descripcion;
    
    public Categoria(Integer codigo) {
        this.codigo = codigo;
    }

    public Categoria() {
        
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash = 89 * hash + Objects.hashCode(this.codigo);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }



  

    
}
