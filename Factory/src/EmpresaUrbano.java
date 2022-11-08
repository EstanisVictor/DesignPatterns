import java.util.Calendar;

public class EmpresaUrbano extends Empresa {

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemUrbano(origem, destino, dataHoraPartida);
    }

}
