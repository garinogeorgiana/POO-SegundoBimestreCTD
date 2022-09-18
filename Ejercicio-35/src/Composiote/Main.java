package Composiote;

public class Main {
    public static void main(String[] args) {
        Comestible c1 = new Comestible(500d, "Hamburguesa");
        Comestible c2 = new Comestible(300d, "SuperPancho");
        Comestible c3 = new Comestible(150d, "Oreo");
        Comestible c4 = new Comestible(300d, "Ensalada");
        Comestible c5 = new Comestible(280d, "Papas Fritas");

        Combo combo1=new Combo("Promo Halloween");
        combo1.addElemento(c1);
        combo1.addElemento(c5);

        Combo combo2=new Combo("Promo Salchipapas");
        combo2.addElemento(c5);
        combo2.addElemento(c2);

        Combo carrito=new Combo("Carrito Pricipal");
        carrito.addElemento(combo1);
        carrito.addElemento(combo2);

        System.out.println("Total del carrito: "+carrito.calcularPrecio());
    }
}
