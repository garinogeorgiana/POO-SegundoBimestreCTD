package PuertoBuenosAires;

public class Contenedor implements Comparable<Contenedor> {
    private int nroIdentificacion;
    private String procedencia;
    private boolean esPeligroso;

    public Contenedor(int nroIdentificacion, String procedencia, boolean esPeligroso) {
        this.nroIdentificacion = nroIdentificacion;
        this.procedencia = procedencia;
        this.esPeligroso = esPeligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        int resultado = 0;
        if (nroIdentificacion > o.nroIdentificacion) {
            resultado = 1;
        }
        if (nroIdentificacion < o.nroIdentificacion) {
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public String toString(){
        String respuesta = "";
        if (esPeligroso){
            respuesta = "El contendor N°"+nroIdentificacion+" contiene un carga peligrosa, ";
        }else {
            respuesta = "El contendor N°"+nroIdentificacion+" no lleva una carga peligrosa, ";
        }
        if (procedencia.toLowerCase().equals("desconocida")){
            respuesta = respuesta + "Su procedencia es desconocida";
        }else {
            respuesta = respuesta + "Procede de "+procedencia;
        }
        return respuesta;
    }




    public int getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(int nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }
}
