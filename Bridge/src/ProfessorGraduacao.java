public class ProfessorGraduacao extends Professor {

    public ProfessorGraduacao(Implementator imp) {
        super(imp);
    }

    @Override
    public void op() {
        imp.op1Imp();
    }

}
