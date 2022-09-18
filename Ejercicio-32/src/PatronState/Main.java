package PatronState;

public class Main {
    public static void main(String[] args) {
        Tamagochi monchito = new Tamagochi();
        monchito.setEstado(new Triste(monchito));
        monchito.comer();
        monchito.recibirMimos();

    }
}
