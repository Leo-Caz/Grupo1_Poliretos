package CadenasCaracteres.C06;

import java.util.Scanner;

public class ControladorC06 {

    private final GeneradorC06 procesador;
    private final Scanner lector;

    public ControladorC06() {
        this.procesador = new GeneradorC06();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C06 - INVERTIR CON LETRAS MAYÚSCULAS (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("FOR: " + procesador.g1_invertirConLetrasMayusculasFor(frase));
        System.out.println("WHILE: " + procesador.g1_invertirConLetrasMayusculasWhile(frase));
        System.out.println("DO-WHILE: " + procesador.g1_invertirConLetrasMayusculasDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC06().run();
    }
}
