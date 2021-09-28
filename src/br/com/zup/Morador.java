package br.com.zup;

public class Morador extends Pessoa {

    //Atributos
    private int idade;


    //Construtor
    public Morador() {
    }

    public Morador(String nome, String cpf, String telefone, int idade) {
        super(nome, cpf, telefone);
        this.idade = idade;
    }


    //getters e setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    //Métodos
    //Exibir dados do morador
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + getNome());
        retorno.append(", " + getIdade() + " anos");
        return retorno.toString();
    }

}
