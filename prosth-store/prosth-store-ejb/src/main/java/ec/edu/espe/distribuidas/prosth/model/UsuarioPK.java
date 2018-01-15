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
import javax.persistence.Embeddable;

/**
 *
 * @author Protesis Store Corp.
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Column(name = "COD_USUARIO", nullable = false, length = 10)
    private String codUsuario;

    @Column(name = "COD_TIPO_USUARIO", nullable = false)
    private int codTipoUsuario;

    public UsuarioPK() {
    }

    public UsuarioPK(String codUsuario, int codTipoUsuario) {
        this.codUsuario = codUsuario;
        this.codTipoUsuario = codTipoUsuario;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(int codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        hash += (int) codTipoUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        if (this.codTipoUsuario != other.codTipoUsuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.UsuarioPK[ codUsuario=" + codUsuario + ", codTipoUsuario=" + codTipoUsuario + " ]";
    }
    
}
