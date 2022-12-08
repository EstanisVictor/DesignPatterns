public class PiscaPisca extends Decorator {

    public PiscaPisca(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Pisca Pisca, ");
    }

}
