package CadenasCaracteres.C02;

import java.util.Scanner;

public class ControladorC02 {

    private final GeneradorC02 procesador;
    private final Scanner lector;

    public ControladorC02() {
        this.procesador = new GeneradorC02();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C02 - CONTAR LETRAS (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("Con FOR: " + procesador.g1_contarLetrasFor(frase));
        System.out.println("Con WHILE: " + procesador.g1_contarLetrasWhile(frase));
        System.out.println("Con DO-WHILE: " + procesador.g1_contarLetrasDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC02().run();
    }
}
