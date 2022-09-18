package FinalPoo;

public class PizzaFactory {

    private static PizzaFactory instance;

    private PizzaFactory() {

    }

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }


    public Pizza crearPizza(String tipo) {
        switch (tipo) {
            case "simple":
                return new PizzaSimple();
            case "combinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }

}
