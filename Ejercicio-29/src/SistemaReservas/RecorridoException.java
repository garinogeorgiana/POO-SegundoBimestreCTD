package SistemaReservas;

public class RecorridoException extends Exception {
    public RecorridoException() {
    }

    public RecorridoException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error, se genero la siguiente excepcion: " + getMessage();
    }
}
