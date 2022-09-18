import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private double porcentajeBonificacion;
    private List<OfertaAcademica> programa = new ArrayList<>();

    @Override
    public double calcularPrecio() {
        double resultado = 0;
        for (OfertaAcademica o : programa) {
            resultado += o.calcularPrecio();
        }
        return resultado;
    }

    public void addOfertaAcademica(OfertaAcademica o){
        programa.add(o);
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public List<OfertaAcademica> getPrograma() {
        return programa;
    }

    public void setPrograma(List<OfertaAcademica> programa) {
        this.programa = programa;
    }
}
