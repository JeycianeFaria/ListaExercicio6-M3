package br.com.zup;

public class Funcionario extends Pessoa {

    //Atributos
    private double salario;


    //construtor
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String telefone, double salario) {
        super(nome, cpf, telefone);
        this.salario = salario;
    }


    //Getters e Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Métodos
    //Exibir dados do funcionário
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Funcionário " + getNome());
        retorno.append("\tTelefone: " + getTelefone());
        return retorno.toString();
    }

}
