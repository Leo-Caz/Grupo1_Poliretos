package CadenasCaracteres.C07;

import java.util.Scanner;

public class ControladorC07 {

    private final GeneradorC07 procesador;
    private final Scanner lector;

    public ControladorC07() {
        this.procesador = new GeneradorC07();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C07 - MAYÚSCULAS SIN 'J' (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("FOR: " + procesador.g1_mayusculasSinJFor(frase));
        System.out.println("WHILE: " + procesador.g1_mayusculasSinJWhile(frase));
        System.out.println("DO-WHILE: " + procesador.g1_mayusculasSinJDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC07().run();
    }
}
