public class FishBurguerBuilder extends SanduicheBuilder {

    private Sanduiche s = new FishBurguer();

    @Override
    public void abrePao() {
        System.out.println("Abre o pão do tamanho do peixe");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere o filé de peixe");
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
