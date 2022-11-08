public class App {
    public static void main(String[] args) throws Exception {

        Administrador adm = Administrador.getInstance();

        adm.setNome("Estanis");
        adm.setSalario(1300);

        System.out.println(adm.getNome());

        Administrador adm2 = Administrador.getInstance();

        /*
         * adm e adm2 estão apontando para o mesmo endereço de memória por causa do singleton
         * Então quando uma alteração é feita em uma das variáveis, ela altera as duas
        */

        adm2.setNome("Victor");

        System.out.println(adm.getNome());
        System.out.println(adm2.getNome());
    }
}
