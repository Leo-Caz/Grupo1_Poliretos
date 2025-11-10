package CadenasCaracteres.C05;

import java.util.Scanner;

public class ControladorC05 {

    private final GeneradorC05 procesador;
    private final Scanner lector;

    public ControladorC05() {
        this.procesador = new GeneradorC05();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C05 - INVERTIR CON VOCALES MAYÚSCULAS (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("FOR: " + procesador.g1_invertirConVocalesMayusculasFor(frase));
        System.out.println("WHILE: " + procesador.g1_invertirConVocalesMayusculasWhile(frase));
        System.out.println("DO-WHILE: " + procesador.g1_invertirConVocalesMayusculasDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC05().run();
    }
}
