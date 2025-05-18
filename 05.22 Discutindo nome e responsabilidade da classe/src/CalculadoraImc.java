public class CalculadoraImc {

    int peso;
    double altura;

    IndiceMassaCorporal calcular() {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }


}
