package Desafio2;

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

        double salarioDevido = folhaPagamento.calcularSalario(160, 10,
                contratoTrabalho);

        System.out.printf("Salário devido = R$ %.2f%n", salarioDevido);


    }

}
