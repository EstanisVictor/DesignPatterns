import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        EmpresaOnibus viacao = new ConcreateEmpresaOnibus();

        Passagem passUrb = viacao.emitePassagemUrbano("Ipatinga", "Coronel Fabriciano",
                new GregorianCalendar(2022, Calendar.NOVEMBER, 07, 23, 9));
        Passagem passInter = viacao.emitePassagemInterEstadual("Ouro Branco", "Rio de Janeiro",
                new GregorianCalendar(2022, Calendar.NOVEMBER, 10, 19, 45));

        passUrb.exibeDetalhes();

        passInter.exibeDetalhes();
    }
}
