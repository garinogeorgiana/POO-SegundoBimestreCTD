package PatronState;

public class Triste implements Estado {

    private Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
        System.out.println("Triste.");
    }

    @Override
    public void comer() {
        System.out.println("Beep. Beep. Vomitando :S");
    }

    @Override
    public void beber() {
        System.out.println("Beep Beep Beep. *Titilando*");
    }

    @Override
    public void recibirMimos() {
        t.setEstado(new Feliz(t));
    }
}
