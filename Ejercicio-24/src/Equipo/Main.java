package Equipo;

public class Main {
    public static void main(String[] args) {
        Equipo e=new Equipo("Campeones");
        Jugador j1 = new Jugador(1,"Pablo",false,true);
        Jugador j2 = new Jugador(10,"Manu",true,true);
        Jugador j3 = new Jugador(6,"Pedro",true,false);
        Jugador j5 = new Jugador(8,"Angel",true,true);
        Jugador j4 = new Jugador(15,"Guillermo",true,true);
        Jugador j6 = new Jugador(2,"Alexis",false,false);
        Jugador j7 = new Jugador(11,"Lucas",false,true);

        e.addJugador(j1);
        e.addJugador(j2);
        e.addJugador(j3);
        e.addJugador(j4);
        e.addJugador(j5);
        e.addJugador(j6);
        e.addJugador(j7);

        e.mostrarJugadoresTitulares();

        System.out.println("Cantidad lesionados: "+e.getCantidadJugadoresLesionados());
    }
}
