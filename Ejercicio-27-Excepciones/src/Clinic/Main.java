package Clinic;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws PacienteException {
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2021-1900, 5-1,10));
            paciente.darAlta(new Date(2022-1950,12-1,10));
        }catch (PacienteException e){
            e.printStackTrace();
        }




    }
}
