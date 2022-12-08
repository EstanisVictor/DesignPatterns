public class Estrela extends Decorator {

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Estrela de Natal, ");
    }

    public Estrela(Arvore arvore) {
        super(arvore);
    }

}
