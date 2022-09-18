package Observer;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario ("Pablo","Cristaldo");
        Seguidor seguidor1 = new Seguidor("Leonel","Fernandez");
        Seguidor seguidor2 = new Seguidor("Matias","Sochiz");
        Seguidor seguidor3 = new Seguidor("Susana","Poblen");

        usuario1.agregar(seguidor1);
        usuario1.agregar(seguidor2);
        usuario1.agregar(seguidor3);
        usuario1.setFotoSubida(true);
        usuario1.setFotoSubida(true);

        System.out.println("Cantidad de notificaciones de "+seguidor1.getNombre()+": "+seguidor1.getCantNotificaciones());
    }
}
