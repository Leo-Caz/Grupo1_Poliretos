package Arrays.A05;

import java.util.Scanner;

public class ControladorA05 {

    private final GeneradorA05 procesador;
    private final Scanner lector;

    public ControladorA05() {
        this.procesador = new GeneradorA05();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== A05 - MATRIZ ALEATORIA CON NOMBRE (Grupo 1) ===");
        System.out.print("Ingrese su nombre completo: ");
        String nombre = lector.nextLine();

        procesador.g1_matrizAleatoria(nombre);
    }

    public static void main(String[] args) {
        new ControladorA05().run();
    }
}
