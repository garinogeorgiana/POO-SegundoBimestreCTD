package Institucion;

import java.time.Year;

public class Perro {
    private String nombre;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean conChip;
    private boolean estaLastimado;
    private boolean enAdopcion;


    public Perro(String nombre, String raza, int anioNacimiento, boolean conChip, boolean estaLastimado, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.conChip = conChip;
        this.estaLastimado = estaLastimado;
        this.peso = peso;
    }

    public String preguntarEdad() {
        return "La edad de " + nombre + " es de " + (2022 - anioNacimiento) + "años";
    }

    public String factiblePerderse() {
        String respuesta;
        if (conChip) {
            respuesta = "No puede perderse, tiene el chip para localizarlo.";
        } else {
            respuesta = "Puede perderse, se recomienda ponerle un Chip para localizarlo.";
        }
        return respuesta;
    }

    public String enviarAdopcion(){
        String respuesta;
        if (!estaLastimado && peso>5){
            respuesta = "El perro "+nombre+" fue enviado en adopcion";
        }else if(estaLastimado && peso<=5){
            respuesta = "El perro "+nombre+" no puede ser puesto en adopcion por que esta lastimado y con bajo peso";
        }else if(!estaLastimado && peso<=5){
            respuesta = "El perro "+nombre+" no puede ser puesto en adopcion por que tiene un peso bajo";
        }else {
            respuesta = "El perro "+nombre+" no puede ser puesto en adopcion por que esta lastimado";
        }
        return respuesta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public boolean isConChip() {
        return conChip;
    }

    public void setConChip(boolean conChip) {
        this.conChip = conChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }
}
