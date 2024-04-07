public class Funcionario {
	private String nome;
    private double salarioPorHora;
    private int horasTrabalhadasPorMes;

    public Funcionario(String nome, double salarioPorHora, int horasTrabalhadasPorMes) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }

    public void setHorasTrabalhadasPorMes(int horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }
}
