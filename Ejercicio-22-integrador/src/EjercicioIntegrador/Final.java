package EjercicioIntegrador;

public class Final extends Examen implements Comparable {
    private double notaOral;
    private String temaOral;

    public Final(String titulo, String enuncaido, double nota, Alumno alumno, double notaOral, String temaOral) {
        super(titulo, enuncaido, nota, alumno);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    @Override
    public boolean estaAprobado() {
        return (notaOral >= 4 && getNota() >= 4);
    }


    @Override
    public int compareTo(Object o) {
        int respuesta;

        double promedioMio = ((notaOral + getNota()) / 2);
        double promedioParametro = ((((Final) o).notaOral + ((Final) o).getNota()) / 2);

        if (promedioMio > promedioParametro) {
            respuesta = 1;
        } else if (promedioMio < promedioParametro) {
            respuesta = -1;
        } else {
            respuesta = 0;
        }
        return respuesta;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getTemaOral() {
        return temaOral;
    }

    public void setTemaOral(String temaOral) {
        this.temaOral = temaOral;
    }
}
