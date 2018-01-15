/*
 * Protesis Store
 * Aplicaciones Distribuidas
 * NRC: 2434 
 * Tutor: HENRY RAMIRO CORAL CORAL 
 * 2017 (c) Protesis Store Corp.
 */
package ec.edu.espe.distribuidas.prosth.web;


import ec.edu.espe.distribuidas.prosth.model.ModoPago;
import ec.edu.espe.distribuidas.prosth.service.ModoPagoService;
import ec.edu.espe.distribuidas.prosth.web.util.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Protesis Store Corp.
 */
@Named
@ViewScoped
public class ModoPagoBean extends BaseBean implements Serializable {

    private List<ModoPago> modosPago;

    private ModoPago modoPago;

    private ModoPago modoPagoSel;

    @Inject
    private ModoPagoService modoPagoService;

    @PostConstruct
    public void init() {
        this.modoPago =  (ModoPago) this.modoPagoService.obtenerTodos();
        this.modoPago = new ModoPago();
    }

    public List<ModoPago> getModosPago() {
        return modosPago;
    }

    @Override
    public void agregar() {
        this.modoPago = new ModoPago();
        super.agregar();
        
    }

    @Override
    public void modificar() {
        super.modificar();
        this.modoPago = new ModoPago();
        this.modoPago.setCodigo(this.modoPagoSel.getCodigo());
     //   this.modoPago.setTipoPago(this.modoPagoSel.getTipoPago());
        this.modoPago.setDescripcion(this.modoPagoSel.getDescripcion());
    }
    
    public void eliminar() {
        try {
            this.modoPagoService.eliminar(this.modoPagoSel.getCodigo());
            this.modoPago =   (ModoPago) this.modoPagoService.obtenerTodos();
            FacesUtil.addMessageInfo("Se elimino el registro ");
            this.modoPagoSel = null;
        } catch (Exception e) {
            FacesUtil.addMessageError(null, "No se puede eliminar el registro seleccionado. Verifique que no tenga informacion relacionada.");
        }
    }

    @Override
    public void detalles() {
        super.detalles();
        this.modoPago = this.modoPagoSel;
    }

    public void cancelar() {
        super.reset();
        this.modoPago = new ModoPago();
    }

    public void guardar() {
        try {
            if (this.enAgregar) {
                this.modoPagoService.crear(this.modoPago);
                FacesUtil.addMessageInfo("Se agregó el Modo de pago: " + this.modoPago.getDescripcion());
            } else {
                this.modoPagoService.modificar(this.modoPago);
                FacesUtil.addMessageInfo("Se modific\u00f3 el Modo de pago con c\u00f3digo: " + this.modoPago.getCodigo());
            }
        } catch (Exception ex) {
            FacesUtil.addMessageError(null, "Ocurrí\u00f3 un error al actualizar la informaci\u00f3n");
        }
        super.reset();
        this.modoPago = new ModoPago();
        this.modoPago = (ModoPago) this.modoPagoService.obtenerTodos();
    }

    public ModoPago getModoPago() {
        return modoPago;
    }

    public void setModoPago(ModoPago modoPago) {
        this.modoPago = modoPago;
    }

    public ModoPago getModoPagoSel() {
        return modoPagoSel;
    }

    public void setModoPagoSel(ModoPago modoPagoSel) {
        this.modoPagoSel = modoPagoSel;
    }

    public ModoPagoService getModoPagoService() {
        return modoPagoService;
    }

    public void setModoPagoService(ModoPagoService modoPagoService) {
        this.modoPagoService = modoPagoService;
    }

  
}
