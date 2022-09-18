public class Main {
    public static void main(String[] args) {

        OfertaAcademica frontEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso) frontEnd).setDuracion(2);
        ((Curso) frontEnd).setValorHora(1000);
        ((Curso) frontEnd).setCargaHoraria(16);

        OfertaAcademica backEnd = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("BackEnd");
        ((Curso) backEnd).setDuracion(2);
        ((Curso) backEnd).setValorHora(900);
        ((Curso) backEnd).setCargaHoraria(20);

        OfertaAcademica fullStack = OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack-Front y Back");
        ((ProgramaIntensivo) fullStack).setPorcentajeBonificacion(20);
        ((ProgramaIntensivo) fullStack).addOfertaAcademica(frontEnd);
        ((ProgramaIntensivo) fullStack).addOfertaAcademica(backEnd);

        System.out.println(frontEnd.calcularPrecio());
        System.out.println(backEnd.calcularPrecio());
        System.out.println(fullStack.calcularPrecio());

        Instituto dh = new Instituto("Digital House");
        dh.addOfertaAcademica(fullStack);
        dh.addOfertaAcademica(frontEnd);
        dh.addOfertaAcademica(backEnd);
        System.out.println("Informe de ofertas disponibles en el Instituto");
        dh.generarInforme();


    }
}
