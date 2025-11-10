package Figuras;

import java.util.Scanner;

public class ControladorFiguras {
    private final GeneradorFiguras generador = new GeneradorFiguras();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n--- MENÚ DE FIGURAS ---");
            System.out.println("1. Triángulo rectángulo simple (F1)");
            System.out.println("2. Triángulo rectángulo invertido (F2)");
            System.out.println("3. Pirámide centrada (F3)");
            System.out.println("4. Pirámide invertida centrada (F4)");
            System.out.println("5. Rombo (F5)");
            System.out.println("6. Letra X (F6)");
            System.out.println("7. Diamante (F7)");
            System.out.println("8. Escalera (F8)");
            System.out.println("9. Cuadro hueco (F9)");
            System.out.println("10. Pirámide alternando símbolos (F10)");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 0) break;
            System.out.print("Introduce el número de niveles: ");
            int niveles = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(generador.figuraF1(niveles));
                    break;
                case 2:
                    System.out.println(generador.figuraF2(niveles));
                    break;
                case 3:
                    System.out.println(generador.figuraF3(niveles));
                    break;
                case 4:
                    System.out.println(generador.figuraF4(niveles));
                    break;
                case 5:
                    System.out.println(generador.figuraF5(niveles));
                    break;
                case 6:
                    System.out.println(generador.figuraF6(niveles));
                    break;
                case 7:
                    System.out.println(generador.figuraF7(niveles));
                    break;
                case 8:
                    System.out.println(generador.figuraF8(niveles));
                    break;
                case 9:
                    System.out.println(generador.figuraF9(niveles));
                    break;
                case 10:
                    System.out.println(generador.figuraF10(niveles));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
