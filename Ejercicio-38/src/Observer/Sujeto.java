package Observer;

public interface Sujeto {
    void agregar(Observador obs);

    void eliminar(Observador obs);

    void notificar();
}
