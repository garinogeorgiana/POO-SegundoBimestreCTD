package SistemaReservas;

public class EmpresaException extends Exception {
    public EmpresaException() {
    }

    public EmpresaException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Error, se genero la siguiente excepcion: " + getMessage();
    }
}
