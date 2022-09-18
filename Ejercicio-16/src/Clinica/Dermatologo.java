package Clinica;

public class Dermatologo extends Medico{

    private double importeMedicamentos;

    public Dermatologo(String nombre, String matricula, double importeHonorarios, double importeMedicamentos) {
        super(nombre, matricula, importeHonorarios);
        this.importeMedicamentos = importeMedicamentos;
    }

    @Override public double cobrar(){
        return  importeMedicamentos+getImporteHonorarios();
    }
}
