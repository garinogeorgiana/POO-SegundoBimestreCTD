package Clinica;

public class Cardiologo extends Medico{
    private double importeEstudios;

    public Cardiologo(String nombre, String matricula, double importeHonorarios) {
        super(nombre, matricula, importeHonorarios);
    }

    @Override public double cobrar(){
        return  importeEstudios+getImporteHonorarios();
    }

    public void consultarEstudios(Paciente paciente){
        importeEstudios = paciente.getCatEstudios()*200;
    }

    public double getImporteEstudios() {
        return importeEstudios;
    }

    public void setImporteEstudios(double importeEstudios) {
        this.importeEstudios = importeEstudios;
    }
}
