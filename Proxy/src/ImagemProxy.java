public class ImagemProxy extends Imagem {

    private ImagemReal image;
    private String nomeArquivo;

    public ImagemProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new ImagemReal(nomeArquivo);
        }

        image.displayImage();
    }

}
/*
 * Manipulando a imagem real, porém é usado o proxy para tal manipulação
 * Qualquer mopdificação é feita no proxy
 */