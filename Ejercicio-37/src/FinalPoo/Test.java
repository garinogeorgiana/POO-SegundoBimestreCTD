package FinalPoo;

public class Test {
    public static void main(String[] args) {

        PizzaSimple muzaChica = ((PizzaSimple)PizzaFactory.getInstance().crearPizza("simple"));
        muzaChica.setEsGrande(false);
        muzaChica.setPrecioBase(700.0);
        muzaChica.setNombre("Pizza de Muzzarella");
        muzaChica.setDescripcion("Pizza de con queso Muzzarela y Salsa de Tomate");
        System.out.println("\nPrecio de la Pizza Muzza chica.");
        System.out.println(muzaChica.calcularPrecio());

        PizzaSimple especialChica = ((PizzaSimple)PizzaFactory.getInstance().crearPizza("simple"));
        especialChica.setEsGrande(false);
        especialChica.setPrecioBase(850.0);
        especialChica.setNombre("Especial de la Casa");
        especialChica.setDescripcion("Ingredientes secretos de la Casa.");
        System.out.println("\nPrecio de la Pizza Especial chica");
        System.out.println(especialChica.calcularPrecio());

        PizzaSimple ananaChica = ((PizzaSimple)PizzaFactory.getInstance().crearPizza("simple"));
        ananaChica.setEsGrande(false);
        ananaChica.setPrecioBase(950);
        ananaChica.setNombre("Pizza de anana");
        ananaChica.setDescripcion("Pizza con rodajas de anana");
        System.out.println("\nPrecio de la Pizza de Anana chica.");
        System.out.println(ananaChica.calcularPrecio());
        //¿quien come pizza de anana? dios mio...

        PizzaCombinada combinadaLoca = ((PizzaCombinada)PizzaFactory.getInstance().crearPizza("combinada"));
        combinadaLoca.setNombre("Pizza muy muy loca");
        combinadaLoca.setDescripcion("Pizza con ingredientes locos");
        combinadaLoca.addPizza(especialChica);
        combinadaLoca.addPizza(ananaChica);
        System.out.println("\nPrecio de la pizza combinada loca.");
        System.out.println(combinadaLoca.calcularPrecio());

        Pizzeria pizzeria = new Pizzeria("Camada 1");
        pizzeria.addPizza(muzaChica);
        pizzeria.addPizza(especialChica);
        pizzeria.addPizza(ananaChica);
        pizzeria.addPizza(combinadaLoca);
        pizzeria.mostrarPizzas();
    }
}
