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

    public void setCatalogoImoveis(List<Imovel> catalogoImoveis) {
        this.catalogoImoveis = catalogoImoveis;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
}
