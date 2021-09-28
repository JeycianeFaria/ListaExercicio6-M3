package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    //Atributos
    private String nomeImovel;
    private String enderecoImovel;
    private double valorAluguel;
    private Funcionario funcionarioResponsavel;
    private List<Morador> listaMoradores = new ArrayList<>();


    //construtor
    public Imovel() {
    }

    public Imovel(String nomeImovel, String enderecoImovel, double valorAluguel) {
        this.nomeImovel = nomeImovel;
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
    }


    //Getters e Setters
    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
        this.nomeImovel = nomeImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getListaMoradores() {
        return listaMoradores;
    }

    public void setListaMoradores(List<Morador> listaMoradores) {
        this.listaMoradores = listaMoradores;
    }


    //Métodos
    //Acionar morador a lista
    public void adicionarMorador(Morador morador) {
        listaMoradores.add(morador);
    }

    //exibir lista de moradores
    public void listaMoradores() {
        for (Morador referencia : listaMoradores) {
            System.out.println(referencia);
        }
    }

    //Exibir dados do imovél
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Imovel: " + getNomeImovel());
        retorno.append("\nEndereço: " + getEnderecoImovel() + ".");
        retorno.append("\nValor Aluguel: R$ " + getValorAluguel());
        retorno.append("\nResponsável: " + getFuncionarioResponsavel());
        retorno.append("\nMoradores: " + listaMoradores);
        return retorno.toString();
    }

}
