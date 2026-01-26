package Desafio3;

public class Main {

    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Artur Aires";
        funcionario.quantidadeDeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 55.8;
        contratoTrabalho.valorHoraExtra = 65.8;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(150, 10,
                contratoTrabalho);
        holerite.imprimirInforcoesOlerite();


    }

}
