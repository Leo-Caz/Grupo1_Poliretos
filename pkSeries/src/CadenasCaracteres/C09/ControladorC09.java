package CadenasCaracteres.C09;

import java.util.Scanner;

public class ControladorC09 {

    private final GeneradorC09 procesador;
    private final Scanner lector;

    public ControladorC09() {
        this.procesador = new GeneradorC09();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C09 - ALTERNAR MAYÚSCULAS Y MINÚSCULAS (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("FOR: " + procesador.g1_alternarMayusculasMinusculasFor(frase));
        System.out.println("WHILE: " + procesador.g1_alternarMayusculasMinusculasWhile(frase));
        System.out.println("DO-WHILE: " + procesador.g1_alternarMayusculasMinusculasDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC09().run();
    }
}
