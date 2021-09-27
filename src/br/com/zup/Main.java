package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //instanciando objetos
        Morador morador1 = new Morador("João", "124578", "123456", 25);
        Funcionario funcionario1 = new Funcionario("Pedro", "5555555", "11111111", 2500);
        Imovel imovel1 = new Imovel("Rua X, 111",700);


        //Teste imovel
        imovel1.listaMoradores();
        imovel1.adicionarMorador(morador1);
        imovel1.listaMoradores();

    }
}
