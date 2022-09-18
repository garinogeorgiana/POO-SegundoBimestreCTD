package Clinica;

public class Paciente {
    private int numeroDocument;
    private String nombre;
    private int edad;
    private String nombreOS;
    private boolean particular;
    private boolean cirugia;
    private boolean alta;
    private int catEstudios;
    private Medico medico;

    public Paciente(int numeroDocument, String nombre, int edad, String nombreOS, boolean particular, boolean cirugia, boolean alta, int catEstudios, Medico medico) {
        this.numeroDocument = numeroDocument;
        this.nombre = nombre;
        this.edad = edad;
        this.nombreOS = nombreOS;
        this.particular = particular;
        this.cirugia = cirugia;
        this.alta = alta;
        this.catEstudios = catEstudios;
        this.medico = medico;
    }

    public void asignarMedico(Medico medico){
        System.out.println("Al paciente "+nombre+" se le asigno el medico "+medico.getNombre());
        this.medico = medico;
    }

    public void cancelarDeuda(){
        System.out.println("Se paga la deuda de: " + medico.cobrar());
    }

    public int getNumeroDocument() {
        return numeroDocument;
    }

    public void setNumeroDocument(int numeroDocument) {
        this.numeroDocument = numeroDocument;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreOS() {
        return nombreOS;
    }

    public void setNombreOS(String nombreOS) {
        this.nombreOS = nombreOS;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public boolean isCirugia() {
        return cirugia;
    }

    public void setCirugia(boolean cirugia) {
        this.cirugia = cirugia;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public int getCatEstudios() {
        return catEstudios;
    }

    public void setCatEstudios(int catEstudios) {
        this.catEstudios = catEstudios;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
