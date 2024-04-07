public class TesteFuncionario {
    public static void main(String[] args) {
        FuncionarioRegular funcionario1 = new FuncionarioRegular("Vitor", 50, 176);
        FuncionarioTerceirizado funcionario2 = new FuncionarioTerceirizado("Cleber", 50, 180, 100);

        System.out.println("Funcionário Regular: " + funcionario1.getNome() + " - Salário Mensal: " + funcionario1.calcularSalarioMensal());
        System.out.println("Funcionário Terceirizado: " + funcionario2.getNome() + " - Salário Mensal: " + funcionario2.calcularSalarioMensal());
    }
}
