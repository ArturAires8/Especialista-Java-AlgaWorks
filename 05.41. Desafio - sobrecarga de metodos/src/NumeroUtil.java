public class NumeroUtil {


    static int descobrirMaiorNumero(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    static int descobrirMaiorNumero(int numero1, int numero2, int numero3) {
        if (numero1 >= numero2 && numero1 >= numero3) {
            return numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

    static double descobrirMaiorNumero(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    static double descobrirMaiorNumero(double numero1, double numero2, double numero3) {
        if (numero1 >= numero2 && numero1 >= numero3) {
            return numero1;

        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return numero2;
        } else {
            return numero3;
        }

    }

}
