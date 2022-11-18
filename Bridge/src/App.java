public class App {
    public static void main(String[] args) throws Exception {
        ProfessorGraduacao graduacao = new ProfessorGraduacao(new ProfessorImpGraduacao());

        graduacao.op();

        ProfessorPosGraduacao pos = new ProfessorPosGraduacao(new ProfessorImpPosGraduacao());

        pos.op();
    }
}
