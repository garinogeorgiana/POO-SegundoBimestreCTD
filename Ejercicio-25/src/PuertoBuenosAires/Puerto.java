package PuertoBuenosAires;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores = new ArrayList<>();

    public Puerto(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarContenedor(Contenedor cont) {
        contenedores.add(cont);
    }

    public void mostrarContenedores() {
        contenedores.sort(null);
        for (Contenedor cont : contenedores){
            System.out.println(cont.toString());
        }
    }

    public int calcularContenedoresPeligrosos(){
        int cantidadPeligrosos = 0;
        for(Contenedor cont:contenedores){
            if (cont.isEsPeligroso()){
                cantidadPeligrosos++;
            }
        }
        return cantidadPeligrosos;
    }
}
