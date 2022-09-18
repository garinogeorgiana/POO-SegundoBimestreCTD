package Clinica;

public class Programa {
    public static void main(String[] args) {

        Cardiologo cardiologo = new Cardiologo("Fernandez", "1122", 1000.0);
        Medico medico = new Medico("General", "2442", 1000.0);
        Cirujano cirujano = new Cirujano("Ciruj", "32", 1000.0, 500.0);
        Dermatologo dermatologo = new Dermatologo("Derma", "112323", 1000.0, 555.75);

        Paciente paciente1 = new Paciente(3333333, "Pablo", 33, "Galeno", false, true, false, 3, medico);
        Paciente paciente2 = new Paciente(444444, "Leonel", 42, "Particular", true, false, false, 10, cirujano);
        Paciente paciente3 = new Paciente(555555, "Baltasar", 22, "Osde", false, true, false, 1, dermatologo);
        Paciente paciente4 = new Paciente(555555, "Baltasar", 22, "Osde", false, true, false, 4, cardiologo);

        System.out.println("Medico General");
        paciente1.cancelarDeuda();
        System.out.println("");
        System.out.println("Cirujano");
        paciente2.cancelarDeuda();
        System.out.println("");
        System.out.println("Dermatologo");
        paciente3.cancelarDeuda();
        System.out.println("");

        System.out.println("Cardiologo");
        cardiologo.consultarEstudios(paciente4);
        paciente4.cancelarDeuda();
    }
}
