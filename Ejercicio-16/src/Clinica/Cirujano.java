package Clinica;

public class Cirujano extends Medico{
    private double honorariosAyudante;

    public Cirujano(String nombre, String matricula, double importeHonorarios, double honorariosAyudante) {
        super(nombre, matricula, importeHonorarios);
        this.honorariosAyudante = honorariosAyudante;
    }

    @Override public double cobrar(){
        return  honorariosAyudante+getImporteHonorarios();
    }

    public double getHonorariosAyudante() {
        return honorariosAyudante;
    }

    public void setHonorariosAyudante(double honorariosAyudante) {
        this.honorariosAyudante = honorariosAyudante;
    }
}
