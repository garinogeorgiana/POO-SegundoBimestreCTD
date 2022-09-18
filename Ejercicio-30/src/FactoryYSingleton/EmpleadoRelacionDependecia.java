package FactoryYSingleton;

public class EmpleadoRelacionDependecia extends Empleado {

    private double sueldoMensual;




    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSeuldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return dias * (sueldoMensual / 30);
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }


}
