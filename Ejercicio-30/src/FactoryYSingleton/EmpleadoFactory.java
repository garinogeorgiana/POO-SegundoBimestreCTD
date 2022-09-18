package FactoryYSingleton;

public class EmpleadoFactory {

    //singleton
    private static EmpleadoFactory instance;

    private EmpleadoFactory() {

    }

    public static EmpleadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }


    //factory
    public Empleado crearEmpleado(String tipo) {
        Empleado resultado = null;
        switch (tipo) {
            case "EMP-INT":
                resultado = new EmpleadoRelacionDependecia();
                break;
            case "EMP-EXT":
                resultado = new EmpleadoContratado();
                break;
        }
        return resultado;
    }
}
