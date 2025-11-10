package CadenasCaracteres.C01;

import java.util.Scanner;

public class ControladorC01 {

    private final GeneradorC01 procesador;
    private final Scanner lector;

    public ControladorC01() {
        this.procesador = new GeneradorC01();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C01 - CONTAR VOCALES (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("Con FOR: " + procesador.g1_contarVocalesFor(frase) + " vocales");
        System.out.println("Con WHILE: " + procesador.g1_contarVocalesWhile(frase) + " vocales");
        System.out.println("Con DO-WHILE: " + procesador.g1_contarVocalesDoWhile(frase) + " vocales");
    }

    public static void main(String[] args) {
        new ControladorC01().run();
    }
}
