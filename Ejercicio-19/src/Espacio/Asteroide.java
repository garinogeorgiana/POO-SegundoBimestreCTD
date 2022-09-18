package Espacio;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
        System.out.println("El asteroide se movio "+x+" lugares en x. "+y+" lugares en y");
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
