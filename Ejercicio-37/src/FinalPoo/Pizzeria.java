package FinalPoo;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> list_pizzas;


    public Pizzeria(String nombre) {
        this.nombre = nombre;
        list_pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza){
        list_pizzas.add(pizza);
    }

    public void mostrarPizzas(){
        System.out.println("\n Listado de Pizzas");
        for (Pizza pizza:list_pizzas) {
            System.out.println("Pizza: "+pizza.getNombre()+ " - Precio: "+pizza.calcularPrecio()+" pesos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pizza> getList_pizzas() {
        return list_pizzas;
    }

    public void setList_pizzas(List<Pizza> list_pizzas) {
        this.list_pizzas = list_pizzas;
    }
}
