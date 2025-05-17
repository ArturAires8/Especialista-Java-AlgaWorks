public class Paciente {


    int peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
