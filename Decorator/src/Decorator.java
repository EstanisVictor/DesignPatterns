public abstract class Decorator extends Arvore {

    //Referencia é o mais importante, não é perdido a referência e seus comportamentos agregados
    private final Arvore arvore;

    public Decorator(Arvore arvore) {
        this.arvore = arvore;
    }

    @Override
    public void showEnfeites() {
        arvore.showEnfeites();
    }

}
