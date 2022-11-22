public class App {
    public static void main(String[] args) throws Exception {

        PlugAmericano pEUA = new PlugAmericano();

        //Adapter permite desenvolver/ajustar métodos específicos que seriam relacionados a outra classe
        AdapterAmericanToBr adapter = new AdapterAmericanToBr();

        String s = adapter.conecta(pEUA);

        System.out.println(s);
    }
}
