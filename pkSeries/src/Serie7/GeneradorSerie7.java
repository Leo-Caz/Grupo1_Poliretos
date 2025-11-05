package Serie7;

public class GeneradorSerie7 {
    public long g1_factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser >= 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * g1_factorial(n - 1);
    }

    public int g1_sumar(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (b > 0) {
            return g1_sumar(a + 1, b - 1);
        }
        return g1_sumar(a - 1, b + 1);
    }

    public long g1_multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + g1_multiplicar(a, b - 1);
        }
        return -g1_multiplicar(a, -b);
    }

    public long g1_potencia(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("El exponente debe ser >= 0");
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        long mitad = g1_potencia(a, b / 2);
        long resultado = mitad * mitad;
        if (b % 2 != 0) {
            resultado = resultado * a;
        }
        return resultado;
    }

    public String g1_conteoProgresivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser >= 0");
        }
        StringBuilder texto = new StringBuilder();
        g1_conteoProgresivoRec(0, n, texto);
        return texto.toString().trim();
    }

    private void g1_conteoProgresivoRec(int actual, int limite, StringBuilder texto) {
        texto.append(actual).append(" ");
        if (actual == limite) {
            return;
        }
        g1_conteoProgresivoRec(actual + 1, limite, texto);
    }

    public String g1_conteoRegresivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n debe ser >= 0");
        }
        StringBuilder texto = new StringBuilder();
        g1_conteoRegresivoRec(n, texto);
        return texto.toString().trim();
    }

    private void g1_conteoRegresivoRec(int actual, StringBuilder texto) {
        texto.append(actual).append(" ");
        if (actual == 0) {
            return;
        }
        g1_conteoRegresivoRec(actual - 1, texto);
    }
}
