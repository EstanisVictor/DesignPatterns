public class App {
    public static void main(String[] args) throws Exception {
        Usuario teste = new Usuario("joao", "123");

        Usuario teste2 = teste.clone();

        teste.setNome("BILL");

        System.out.println(teste.getNome());
        System.out.println(teste2.getNome());

    }
}
