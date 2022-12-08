public class Bola extends Decorator {

    public Bola(Arvore arvore) {
        super(arvore);
    }

    @Override
    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Bola Natal, ");
    }
    
}
