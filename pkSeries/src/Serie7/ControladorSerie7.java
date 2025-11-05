package Serie7;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorSerie7 {
    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie7 generador = new GeneradorSerie7();

    public ControladorSerie7(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 7 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        System.out.println();

        ejecutarR01();
        ejecutarR02();
        ejecutarR03();
        ejecutarR04();
        ejecutarR05();
        ejecutarR06();
    }

    private void ejecutarR01() {
        System.out.println("--- R01: Factorial ---");
        int n = solicitarEnteroNoNegativo("Ingrese n (>= 0): ");
        long resultado = generador.g1_factorial(n);
        System.out.println("Factorial de " + n + " = " + resultado);
        System.out.println();
    }

    private void ejecutarR02() {
        System.out.println("--- R02: Suma de a y b ---");
        int a = solicitarEntero("Ingrese a: ");
        int b = solicitarEntero("Ingrese b: ");
        int resultado = generador.g1_sumar(a, b);
        System.out.println(a + " + " + b + " = " + resultado);
        System.out.println();
    }

    private void ejecutarR03() {
        System.out.println("--- R03: Multiplicacion de a y b ---");
        int a = solicitarEntero("Ingrese a: ");
        int b = solicitarEntero("Ingrese b: ");
        long resultado = generador.g1_multiplicar(a, b);
        System.out.println(a + " * " + b + " = " + resultado);
        System.out.println();
    }

    private void ejecutarR04() {
        System.out.println("--- R04: Potencia a^b ---");
        int a = solicitarEntero("Ingrese base a: ");
        int b = solicitarEnteroNoNegativo("Ingrese exponente b (>= 0): ");
        long resultado = generador.g1_potencia(a, b);
        System.out.println(a + "^" + b + " = " + resultado);
        System.out.println();
    }

    private void ejecutarR05() {
        System.out.println("--- R05: Conteo progresivo ---");
        int n = solicitarEnteroNoNegativo("Contar desde 0 hasta n (>= 0). Ingrese n: ");
        String avance = generador.g1_conteoProgresivo(n);
        System.out.println("Avance: " + avance);
        System.out.println();
    }

    private void ejecutarR06() {
        System.out.println("--- R06: Conteo regresivo ---");
        int n = solicitarEnteroNoNegativo("Contar desde n hasta 0 (>= 0). Ingrese n: ");
        String avance = generador.g1_conteoRegresivo(n);
        System.out.println("Avance: " + avance);
        System.out.println();
    }

    private int solicitarEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (lector.hasNextInt()) {
                int valor = lector.nextInt();
                lector.nextLine();
                return valor;
            } else {
                System.out.println("Ingrese un numero entero valido.");
                lector.nextLine();
            }
        }
    }

    private int solicitarEnteroNoNegativo(String mensaje) {
        int valor;
        do {
            valor = solicitarEntero(mensaje);
            if (valor < 0) {
                System.out.println("El valor debe ser >= 0.");
            }
        } while (valor < 0);
        return valor;
    }
}
