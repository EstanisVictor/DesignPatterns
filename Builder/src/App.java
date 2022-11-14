public class App {
    public static void main(String[] args) throws Exception {
        SanduicheBuilder b1 = new HamburguerBuilder();
        SanduicheBuilder b2 = new FishBurguerBuilder();
        
        System.out.println();
        Cozinha cozinha = new Cozinha();
        
        cozinha.fazSanduiche(b2);

        Sanduiche s1 = b2.getSanduiche();
        System.out.println(s1.getNome());

        System.out.println();
        cozinha.fazSanduiche(b1);

        Sanduiche s2 = b1.getSanduiche();
        System.out.println(s2.getNome());
    }
}
