package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    //Atributos
    private String nomeImobiliaria;
    private List<Imovel> catalogoImoveis = new ArrayList<>();
    private List<Funcionario> listaFuncionarios = new ArrayList<>();


    //construtor
    public Imobiliaria() {
    }

    public Imobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }


    //Getters e Setters
    public String getNomeImobiliaria() {
        return nomeImobiliaria;
    }

    public void setNomeImobiliaria(String nomeImobiliaria) {
        this.nomeImobiliaria = nomeImobiliaria;
    }

    public List<Imovel> getCatalogoImoveis() {
        return catalogoImoveis;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }


    //Métodos
    //Adicionar Imoveis
    public void adicionarImoveis(Imovel imovel){
        catalogoImoveis.add(imovel);
    }

    //Adicionar Funcionários
    public void adicionarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    //Exibir dados Imobiliaria
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("====Imobiliaria " + getNomeImobiliaria() + "====");
        retorno.append("\nFuncionários:  " + getListaFuncionarios());
        retorno.append("\nCatálogo de Imoveis: " + getCatalogoImoveis());
        return retorno.toString();
    }

}
