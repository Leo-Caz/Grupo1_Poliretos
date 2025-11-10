package Arrays.A01;

import java.util.Scanner;

public class ControladorA01 {

    private final GeneradorA01 procesador;
    private final Scanner lector;

    public ControladorA01() {
        this.procesador = new GeneradorA01();
        this.lector = new Scanner(System.in);
    }

    public void run() {
        System.out.println("=== A01 - PORCENTAJE DE CARGA (Grupo 1) ===");
        System.out.print("Ingrese su nombre completo (ejemplo: Pancracia Carmeliana Altamirano Perez): ");
        String nombreCompleto = lector.nextLine();

        String[] palabras = nombreCompleto.split(" ");
        int[] porcentajes = new int[palabras.length];

        System.out.println("Ingrese los porcentajes de carga para cada palabra:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + ": ");
            porcentajes[i] = lector.nextInt();
        }

        procesador.g1_cargarPalabras(palabras, porcentajes);
    }

    public static void main(String[] args) {
        new ControladorA01().run();
    }
}
