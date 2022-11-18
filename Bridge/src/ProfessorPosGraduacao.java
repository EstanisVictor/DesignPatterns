public class ProfessorPosGraduacao extends Professor {

    protected ProfessorPosGraduacao(Implementator imp) {
        super(imp);
    }

    @Override
    public void op() {
        imp.op1Imp();
    }

}
