package FinalPoo;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> list_pizzas = new ArrayList<>();

    public void addPizza(Pizza pizza){
        list_pizzas.add(pizza);
    }

    public List<Pizza> getList_pizzas() {
        return list_pizzas;
    }

    public void setList_pizzas(List<Pizza> list_pizzas) {
        this.list_pizzas = list_pizzas;
    }

    @Override
    public double calcularPrecio() {
        int contador = 0;
        double total =0.0;
        for (Pizza pizza: list_pizzas) {
            total+=pizza.calcularPrecio();
            contador++;
        }
        return total/contador;

    }
}
