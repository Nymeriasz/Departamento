package Departamento;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome){
        this.nome=nome;
        this.funcionarios=new ArrayList<>();
    }
    public void adicionar(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public String getNome() {
        return nome;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
