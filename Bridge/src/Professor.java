public abstract class Professor {
    protected Implementator imp;

    protected Professor(Implementator imp) {
        this.imp = imp;
    }

    // operação de comportamento
    public abstract void op();
}
