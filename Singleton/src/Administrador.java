public class Administrador {

    private static Administrador instancia;

    private String nome;
    private double salario;

    private Administrador() {

    }

    public static Administrador getInstance() {
        // Verificando se o objeto é null para instanciar
        if (instancia == null) {
            instancia = new Administrador();
        }

        return instancia;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
