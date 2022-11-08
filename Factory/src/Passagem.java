import java.util.Calendar;

public class Passagem {
    private String origem;
    private String destino;
    private Calendar dataHoraPartida;

    public Passagem(String origem, String destino, Calendar dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public Calendar getDataHoraPartida() {
        return dataHoraPartida;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setDataHoraPartida(Calendar dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void exibeDetalhes() {
        System.out.println("passagem...");
    }

}
