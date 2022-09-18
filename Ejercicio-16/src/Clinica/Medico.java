package Clinica;

public class Medico {
    private String nombre;
    private String matricula;
    private double importeHonorarios;

    public Medico(String nombre, String matricula, double importeHonorarios) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.importeHonorarios = importeHonorarios;
    }


    public double cobrar(){
     return  importeHonorarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getImporteHonorarios() {
        return importeHonorarios;
    }

    public void setImporteHonorarios(double importeHonorarios) {
        this.importeHonorarios = importeHonorarios;
    }
}
