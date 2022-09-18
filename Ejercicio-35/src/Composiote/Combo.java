package Composiote;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Elemento{
    List<Elemento> combo = new ArrayList<>();

    public Combo(String nom) {
        super(nom);
    }

    @Override
    public double calcularPrecio() {
        double resultado = 0;
        for (Elemento ele:combo) {
            resultado += ele.calcularPrecio();
        }
        return resultado;
    }

    @Override
    public String mostrarNombre() {
        return getNombre();
    }

    public void addElemento(Elemento elemento){
        combo.add(elemento);
    }
}
