package CadenasCaracteres.C03;

import java.util.Scanner;

public class ControladorC03 {

    private final GeneradorC03 procesador;
    private final Scanner lector;

    public ControladorC03() {
        this.procesador = new GeneradorC03();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C03 - ELIMINAR VOCALES (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();

        System.out.println("FOR: " + procesador.g1_eliminarVocalesFor(frase));
        System.out.println("WHILE: " + procesador.g1_eliminarVocalesWhile(frase));
        System.out.println("DO-WHILE: " + procesador.g1_eliminarVocalesDoWhile(frase));
    }

    public static void main(String[] args) {
        new ControladorC03().run();
    }
}
