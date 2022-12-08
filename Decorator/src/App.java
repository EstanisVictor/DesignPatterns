public class App {
    public static void main(String[] args) throws Exception {
        Arvore a = new ArvoreNatal();

        a = new Estrela(a);
        a = new Bola(a);
        a = new Bola(a);
        a = new Bola(a);
        a = new Bola(a);
        a = new Bola(a);
        a = new PiscaPisca(a);

        a.showEnfeites();
    }
}
/*
 * Por exemplo em um game isso é muito útil, pois permite adicionar novos
 * comportamentos, como, ítens novos ao personagem e etc
 */