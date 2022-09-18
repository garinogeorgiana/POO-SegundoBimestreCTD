package Espacio;

public class Main {
    public static void main(String[] args) {
        Asteroide destructor=new Asteroide(10,20,'N',2);
        Nave crucero=new Nave(10,11,'S',5);

        destructor.irA(5,10, 'S');
        crucero.irA(4,2,'N');
    }
}
