/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.enums;

/**
 *
 * @author Protesis Store Corp.
 */
public enum TipoPagoEnum {
    
    EFE("EFECTIVO"),
    
    TAR("TARJETA");

    private String texto;

    private TipoPagoEnum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }  
}
