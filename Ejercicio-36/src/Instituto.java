import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombre;
    private List<OfertaAcademica> ofertasDisponibles = new ArrayList<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public void addOfertaAcademica(OfertaAcademica oa) {
        ofertasDisponibles.add(oa);
    }

    public void generarInforme(){
        for (OfertaAcademica oferta:ofertasDisponibles) {
            System.out.println(oferta.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<OfertaAcademica> getOfertasDisponibles() {
        return ofertasDisponibles;
    }

    public void setOfertasDisponibles(List<OfertaAcademica> ofertasDisponibles) {
        this.ofertasDisponibles = ofertasDisponibles;
    }
}