public class App {
    public static void main(String[] args) throws Exception {
        Imagem img1 = new ImagemProxy("teste_10mb");
        Imagem img2 = new ImagemProxy("teste_20mb");

        img1.displayImage();
        img2.displayImage();

        //esta imagem já existe na memória, então não precisa recarregar tudo novamente
        img1.displayImage();
    }
}
