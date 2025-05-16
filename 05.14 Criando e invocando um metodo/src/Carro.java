public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;


    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda: %s %d%n",
                modelo, anoFabricacao);

    }


}
