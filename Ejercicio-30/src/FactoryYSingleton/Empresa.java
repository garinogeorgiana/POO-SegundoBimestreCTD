package FactoryYSingleton;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados = new ArrayList<>();

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;

        //ejemplo de un empleado preexistente.
        EmpleadoRelacionDependecia emp1 = (EmpleadoRelacionDependecia) EmpleadoFactory.getInstance().crearEmpleado("EMP-INT");
        emp1.setNombre("Pablo");
        emp1.setApellido("Cristaldo");
        emp1.setSueldoMensual(10000);

        empleados.add(emp1);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double calcularSueldoTotal(int dias) {
        double total = 0;
        for (Empleado emp : empleados) {
            total += emp.calcularSueldo(dias);
        }
        return total;
    }
}
