package Arrays.A02;

import java.util.Scanner;

public class ControladorA02 {

    private final GeneradorA02 procesador;
    private final Scanner lector;

    public ControladorA02() {
        this.procesador = new GeneradorA02();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== A02 - MATRIZ DE INICIALES (Grupo 1) ===");
        System.out.print("Ingrese su nombre y apellido: ");
        String[] partes = lector.nextLine().split(" ");
        String iniciales = "" + partes[0].charAt(0) + partes[1].charAt(0);

        System.out.print("Ingrese el tamaño: ");
        int tamaño = lector.nextInt();
        System.out.print("Ingrese el caracter: ");
        char caracter = lector.next().charAt(0);

        procesador.g1_dibujarIniciales(iniciales, tamaño, caracter);
    }

    public static void main(String[] args) {
        new ControladorA02().run();
    }
}
