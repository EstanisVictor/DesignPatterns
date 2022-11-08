import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        Empresa viacaoXlocal = new EmpresaUrbano();
        Empresa viacaoYinter = new EmpresaInterEstadual();

        Passagem passUrb = viacaoXlocal.emitePassagem("Ipatinga", "Coronel Fabriciano",
                new GregorianCalendar(2022, Calendar.NOVEMBER, 07, 23, 9));
        Passagem passInter = viacaoYinter.emitePassagem("Ouro Branco", "Rio de Janeiro",
                new GregorianCalendar(2022, Calendar.NOVEMBER, 10, 19, 45));

        passUrb.exibeDetalhes();

        passInter.exibeDetalhes();
    }
}
