public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    protected Usuario clone() {
        try { // pedindo para acontecer um clone da classe Usuario
            return (Usuario) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Super classe nao implementa a interface clone");
        }
        return null;
    }
}
