package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Morador morador1 = new Morador("João", "124578", "123456", 25);
        Morador morador2 = new Morador("Maria", "1876543", "55555555", 25);
        Funcionario funcionario1 = new Funcionario("Pedro", "5555555", "11111111", 2500);
        Funcionario funcionario2 = new Funcionario("Lucas", "6666666", "22222222", 2500);
        Funcionario funcionario3 = new Funcionario("Gabriela", "7777777", "3333333", 2500);
        Imovel imovel1 = new Imovel("Casa Grande", "Rua X, 111", 1200);
        Imovel imovel2 = new Imovel("Apartamento Top", "Rua Z, 222, Ap 145", 700);
        Imobiliaria imobiliaria1 = new Imobiliaria("Arantes");


        //Teste imovel adicionar moradores a lista
        imovel1.listaMoradores();
        imovel1.adicionarMorador(morador1);
        imovel1.listaMoradores();
        System.out.println("-------------------------");

        //Teste imóvel adicionar funcionário resposável.
        imovel1.setFuncionarioResponsavel(funcionario1);
        System.out.println(imovel1.getFuncionarioResponsavel());
        System.out.println("-------------------------");

        //Teste dados imóvel
        System.out.println(imovel1);
        System.out.println("-------------------------");

        //Teste imobiliaria
        System.out.println(imobiliaria1);
        imobiliaria1.adicionarImoveis(imovel1);
        imobiliaria1.adicionarImoveis(imovel2);
        System.out.println(imobiliaria1);
        imobiliaria1.adicionarFuncionario(funcionario1);
        imobiliaria1.adicionarFuncionario(funcionario2);
        imobiliaria1.adicionarFuncionario(funcionario3);
        System.out.println(imobiliaria1);

    }
}
