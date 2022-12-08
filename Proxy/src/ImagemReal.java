public class ImagemReal extends Imagem {

    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    private void carregarImagemDisco() {
        System.out.println("Loading  " + nomeArquivo);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + nomeArquivo);
    }

}
