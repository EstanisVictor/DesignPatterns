import java.util.Calendar;

public class ConcreateEmpresaOnibus extends EmpresaOnibus {

    @Override
    public PassagemUrbano emitePassagemUrbano(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemUrbano(origem, destino, dataHoraPartida);
    }

    @Override
    public PassagemInterEstadual emitePassagemInterEstadual(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemInterEstadual(origem, destino, dataHoraPartida);
    }

}
