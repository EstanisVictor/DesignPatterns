import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PassagemUrbano extends Passagem {

    public PassagemUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    public void exibeDetalhes() {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Passagem de Onibus urbano: " + this.getOrigem() + " para " + this.getDestino()
                + ", Data/Hora: " + df.format(this.getDataHoraPartida().getTime()));
    }
}
