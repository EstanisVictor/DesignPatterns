public class HamburguerBuilder extends SanduicheBuilder {

    private Sanduiche s = new Hamburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre o pão do tamanho do disco de hamburguer");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere disco de hamburguer e queijo");
    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha o pão");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Sanduiche pronto!!!");
        return s;
    }

}
