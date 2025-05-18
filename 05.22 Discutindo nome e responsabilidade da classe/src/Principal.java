
public class Principal {

    public static void main(String[] args) {


        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.82;
        calculadoraImc.peso = 175;


        IndiceMassaCorporal imc = calculadoraImc.calcular();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);


    }
}