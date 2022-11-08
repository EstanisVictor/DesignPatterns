import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PassagemInterEstadual extends Passagem {

    public PassagemInterEstadual(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    public void exibeDetalhes() {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Passagem de Onibus interestadual: " + this.getOrigem() + " para " + this.getDestino()
                + ", Data/Hora: " + df.format(this.getDataHoraPartida().getTime()));
    }
}
