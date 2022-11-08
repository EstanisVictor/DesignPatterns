import java.util.Calendar;

public class EmpresaInterEstadual extends Empresa {

    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemInterEstadual(origem, destino, dataHoraPartida);
    }

}
