package ejercicio13;

public class Impresora {
    private String modelo;
    private String tipoConexion;
    private String fechaFabricacion;
    private int hojasDisponibles;

    public Impresora(String modelo, String tipoConexion, String fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = 0;
    }

    public Impresora(String modelo, String tipoConexion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        hojasDisponibles = 0;
        fechaFabricacion="desconocido";
    }

    private boolean tienePapel(){
        return hojasDisponibles>0;
    }

    public void imprimir(String texto){
        if (tienePapel()){
            System.out.println("La impresora "+modelo+" esta imprimiendo el texto: "+texto);
            hojasDisponibles--;
        }else {
            System.out.println("La impresora "+modelo+" no tiene papel");
        }
    }

    public void cagarPapel(int cantidad){
        hojasDisponibles+=cantidad;
    }

}
