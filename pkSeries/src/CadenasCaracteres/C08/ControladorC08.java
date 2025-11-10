package CadenasCaracteres.C08;

import java.util.Scanner;

public class ControladorC08 {

    private final GeneradorC08 procesador;
    private final Scanner lector;

    public ControladorC08() {
        this.procesador = new GeneradorC08();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== C08 - JUEGO DE ANAGRAMAS (Grupo 1) ===");
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = lector.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = lector.nextLine();

        if (procesador.g1_sonAnagramas(palabra1, palabra2)) {
            System.out.println("✅ Son anagramas");
        } else {
            System.out.println("❌ No son anagramas");
        }
    }

    public static void main(String[] args) {
        new ControladorC08().run();
    }
}
