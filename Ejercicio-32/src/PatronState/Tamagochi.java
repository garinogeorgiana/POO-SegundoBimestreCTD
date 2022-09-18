package PatronState;

public class Tamagochi {
    private Estado estado;

    public Tamagochi() {
        estado = new Hambriento(this);
    }

    public void comer() {
        estado.comer();
    }

    public void beber() {
        estado.beber();
    }

    public void recibirMimos() {
        estado.recibirMimos();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
