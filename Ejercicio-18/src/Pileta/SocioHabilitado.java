package Pileta;

public class SocioHabilitado extends Socio{

    private Double costoPileta;
    private boolean habilitado;

    public SocioHabilitado(String numero, String nombre, String actividad, Double cuota, Double costoIngreso) {
        super(numero, nombre, actividad, cuota);
        costoPileta = costoIngreso;
        this.habilitado = true;
    }

    @Override public Double costoMensual(){
        if(habilitado){
            return costoPileta+getCuotaMensual();
        }else{
            return getCuotaMensual();
        }

    }

    public Double getCostoPileta() {
        return costoPileta;
    }

    public void setCostoPileta(Double costoPileta) {
        this.costoPileta = costoPileta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
