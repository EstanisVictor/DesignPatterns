import java.util.Calendar;

public abstract class EmpresaOnibus {
    
    public abstract PassagemUrbano emitePassagemUrbano(String origem, String destino, Calendar dataHoraPartida);

    public abstract PassagemInterEstadual emitePassagemInterEstadual(String origem, String destino, Calendar dataHoraPartida);

}   
