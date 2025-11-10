package Arrays.A03;

import java.util.Scanner;

public class ControladorA03 {

    private final GeneradorA03 procesador;
    private final Scanner lector;

    public ControladorA03() {
        this.procesador = new GeneradorA03();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== A03 - GRAFICAR f(x) = 2x (Grupo 1) ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();

        procesador.g1_graficarFuncion(nombre);
    }

    public static void main(String[] args) {
        new ControladorA03().run();
    }
}
