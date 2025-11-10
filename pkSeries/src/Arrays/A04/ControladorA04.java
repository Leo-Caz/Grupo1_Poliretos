package Arrays.A04;

import java.util.Scanner;

public class ControladorA04 {

    private final GeneradorA04 procesador;
    private final Scanner lector;

    public ControladorA04() {
        this.procesador = new GeneradorA04();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== A04 - MATRIZ EN FORMA DE X (Grupo 1) ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = lector.nextLine();

        procesador.g1_formarX(nombre, apellido);
    }

    public static void main(String[] args) {
        new ControladorA04().run();
    }
}
