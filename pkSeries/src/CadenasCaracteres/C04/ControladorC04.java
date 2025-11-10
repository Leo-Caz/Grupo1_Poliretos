package CadenasCaracteres.C04;

import java.util.Scanner;

public class ControladorC04 {

    private final GeneradorC04 procesador;
    private final Scanner lector;

    public ControladorC04() {
        this.procesador = new GeneradorC04();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C04 - ELIMINAR LETRA (Grupo 1) ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        System.out.print("Ingrese la letra a eliminar: ");
        char letra = lector.next().charAt(0);

        System.out.println("FOR: " + procesador.g1_eliminarLetraFor(frase, letra));
        System.out.println("WHILE: " + procesador.g1_eliminarLetraWhile(frase, letra));
        System.out.println("DO-WHILE: " + procesador.g1_eliminarLetraDoWhile(frase, letra));
    }

    public static void main(String[] args) {
        new ControladorC04().run();
    }
}
