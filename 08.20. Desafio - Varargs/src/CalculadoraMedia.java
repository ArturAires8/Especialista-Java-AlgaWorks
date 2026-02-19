public class CalculadoraMedia {


    double calcularMedia(double numero1, double numero2, double... outrosNumeros) {

        double soma = numero1 + numero2;

        for (double outrosNumero : outrosNumeros) {
            soma += outrosNumero;
        }
        return soma / (2 + outrosNumeros.length);

    }

}
