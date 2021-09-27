package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {

    //Atributos
    private List<Morador> listaMoradores = new ArrayList<>();
    private String enderecoImovel;
    private double valorAluguel;
    private Funcionario funcionarioResponsavel;


    //construtor
    public Imovel() {
    }

    public Imovel(String enderecoImovel, double valorAluguel) {
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
    }


    //Getters e Setters
    public List<Morador> getListaMoradores() {
        return listaMoradores;
    }

    public void setListaMoradores(List<Morador> listaMoradores) {
        this.listaMoradores = listaMoradores;
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


    //Métodos
    //Acionar morador a lista
    public void adicionarMorador(Morador morador){
        listaMoradores.add(morador);
    }


    //exibir lista de moradores
    public void listaMoradores(){
        for (Morador referencia: listaMoradores){
            System.out.println("Moradores: " + referencia.getNome());
        }
    }


}
