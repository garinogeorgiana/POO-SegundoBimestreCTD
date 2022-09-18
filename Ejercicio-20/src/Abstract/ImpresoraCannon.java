package Abstract;

public class ImpresoraCannon extends Impresora{

    @Override
    public String imprimir() {
        return "Imprimiendo con la impresora Cannon";
    }

    @Override
    public boolean necesitaTinta() {
        return getPorcentajeTinta()<20;
    }
}
