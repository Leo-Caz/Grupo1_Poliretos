package BarrasAnimaciones;

import java.util.Scanner;

public class ControladorAnimaciones {
    private final GeneradorAnimaciones generador = new GeneradorAnimaciones();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== MENÚ BARRAS Y ANIMACIONES ===");
            System.out.println("1. Barra de carga básica");
            System.out.println("2. Spinner animado");
            System.out.println("3. Barra de carga inversa");
            System.out.println("4. Barra tipo ping-pong");
            System.out.println("5. Barra con símbolos alternados");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos pasos para la barra de carga? ");
                    int pasos = scanner.nextInt();
                    generador.barraCargaBasica(pasos);
                    break;
                case 2:
                    System.out.print("¿Cuántas vueltas debe girar el spinner? ");
                    int vueltas = scanner.nextInt();
                    generador.spinnerAnimado(vueltas);
                    break;
                case 3:
                    System.out.print("¿Cuántos pasos para la barra inversa? ");
                    int pasosInv = scanner.nextInt();
                    generador.barraCargaInversa(pasosInv);
                    break;
                case 4:
                    System.out.print("¿Cuántos ciclos para la barra ping-pong? ");
                    int ciclos = scanner.nextInt();
                    generador.barraPingPong(ciclos);
                    break;
                case 5:
                    System.out.print("¿Cuántos pasos para la barra alternada? ");
                    int pasosAlt = scanner.nextInt();
                    generador.barraSimbolosAlternados(pasosAlt);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
