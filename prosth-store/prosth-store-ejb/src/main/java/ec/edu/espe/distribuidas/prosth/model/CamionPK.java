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
public class CamionPK implements Serializable {

    @Column(name = "COD_CAMION", nullable = false)
    private int codCamion;

    @Column(name = "COD_CONDUCTOR", nullable = false)
    private int codConductor;

    public CamionPK() {
    }

    public CamionPK(int codCamion, int codConductor) {
        this.codCamion = codCamion;
        this.codConductor = codConductor;
    }

    public int getCodCamion() {
        return codCamion;
    }

    public void setCodCamion(int codCamion) {
        this.codCamion = codCamion;
    }

    public int getCodConductor() {
        return codConductor;
    }

    public void setCodConductor(int codConductor) {
        this.codConductor = codConductor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCamion;
        hash += (int) codConductor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CamionPK)) {
            return false;
        }
        CamionPK other = (CamionPK) object;
        if (this.codCamion != other.codCamion) {
            return false;
        }
        if (this.codConductor != other.codConductor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.proyecto.protesis.model.CamionPK[ codCamion=" + codCamion + ", codConductor=" + codConductor + " ]";
    }
    
}
