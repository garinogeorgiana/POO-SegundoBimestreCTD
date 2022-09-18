package Espacio;

public class Nave extends Objeto{
    private double velocidad;
    private int vida;


    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    if (getDireccion() != direccion){
        girar(direccion);
        System.out.println("La nave se movio "+x+" lugares en x. "+y+" lugares en y");
    }else {
        System.out.println("La nave se movio "+x+" lugares en x. "+y+" lugares en y");
    }

    }

    private void girar(char direccion){
        setDireccion(direccion);
        System.out.println("La nava gira apuntado a una nueva direccion hacia "+ direccion);
    }
    private void restaVida(int valor){
    }

}
