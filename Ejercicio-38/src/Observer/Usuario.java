package Observer;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Sujeto {
    private String nombre;
    private String apellido;
    private boolean fotoSubida;

    private List<Observador> seguidores = new ArrayList<>();

    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fotoSubida = false;


    }

    @Override
    public void agregar(Observador obs) {
        seguidores.add(obs);
    }

    @Override
    public void eliminar(Observador obs) {
        seguidores.remove(obs);
    }

    @Override
    public void notificar() {
        for (Observador obs : seguidores) {
            obs.actualizar(((Seguidor)obs).getNombre()+" fue notificado de la foto que subio " + nombre);
        }
        fotoSubida=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isFotoSubida() {
        return fotoSubida;
    }

    public void setFotoSubida(boolean fotoSubida) {
        this.fotoSubida = fotoSubida;
        if (fotoSubida==true){
            notificar();
        }
    }

    public List<Observador> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(List<Observador> seguidores) {
        this.seguidores = seguidores;
    }
}
