package Departamento;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("Vendas");
        departamento.adicionar(new Funcionario("Pamella", 20));
        departamento.adicionar(new Funcionario("Maria", 19));

        System.out.println("Departamento: "+departamento.getNome());
        System.out.println("Funcionarios: ");
        for (Funcionario funcionario: departamento.getFuncionarios()) {
            System.out.println("Nome: "+funcionario.getNome()+", Idade: "+funcionario.getIdade());
        }
    }
}
