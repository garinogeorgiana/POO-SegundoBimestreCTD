package Institucion;

public class App {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais","Salchicha",2010,true,false,15);
        Perro perro2 = new Perro("Manchita","Dogo",2015,true,true,4);
        Perro perro3 = new Perro("Snoopy","Fox Terrier",2018,true,false,4);
        Perro perro4 = new Perro("Fido","ChowChow",2007,false,true,15);


        System.out.println(perro1.preguntarEdad());
        System.out.println(perro1.factiblePerderse());
        System.out.println(perro4.factiblePerderse());


        System.out.println(perro1.enviarAdopcion());
        System.out.println(perro2.enviarAdopcion());
        System.out.println(perro3.enviarAdopcion());
        System.out.println(perro4.enviarAdopcion());


    }

}
