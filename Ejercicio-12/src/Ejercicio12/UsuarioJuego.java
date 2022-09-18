package Ejercicio12;

public class UsuarioJuego {
   private String nombre;
   private String clave;
   private Double puntaje;
   int nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0d;
        this.nivel = 0;
    }

    public void aumentarPuntaje(){
        puntaje++;
    }

    public void subirNivel(){
        nivel++;
    }

    public void bonus(int valor){
        puntaje = puntaje + valor;
    }
}
