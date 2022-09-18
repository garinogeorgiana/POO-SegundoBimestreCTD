package SistemaReservas;

public class Recorrido {
    private String destino;
    private String partida;

    public Recorrido(String destino, String partida) throws RecorridoException{
        if (destino.equals("Buenos Aires")||destino.equals("Mercedes")||destino.equals("Suipacha")||destino.equals("Chivilcoy")||destino.equals("Bragado")||destino.equals("Alberti")||destino.equals("Lujan")){
            this.destino = destino;
        }else {
            throw new RecorridoException("El destino que se introdujo no es valido");
        }

        if (partida.equals("Buenos Aires")||partida.equals("Mercedes")||partida.equals("Suipacha")||partida.equals("Chivilcoy")||partida.equals("Bragado")||partida.equals("Alberti")||partida.equals("Lujan")) {
            this.partida = partida;
        }else {
            throw new RecorridoException("La estacion de partida que se introdujo no es valida");
        }
    }



    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }
}
