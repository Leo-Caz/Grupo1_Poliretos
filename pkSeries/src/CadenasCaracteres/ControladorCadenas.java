package CadenasCaracteres;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorCadenas {
    private final InformacionGrupo infoGrupo;
    private final GeneradorCadenas procesador;
    private final Scanner lector;

    public ControladorCadenas(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.procesador = new GeneradorCadenas();
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Cadenas de Caracteres (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        
        int opcion;
        do {
            mostrarMenu();
            opcion = lector.nextInt();
            lector.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    ejecutarC01();
                    break;
                case 2:
                    ejecutarC02();
                    break;
                case 3:
                    ejecutarC03();
                    break;
                case 4:
                    ejecutarC04();
                    break;
                case 5:
                    ejecutarC05();
                    break;
                case 6:
                    ejecutarC06();
                    break;
                case 7:
                    ejecutarC07();
                    break;
                case 8:
                    ejecutarC08();
                    break;
                case 9:
                    ejecutarC09();
                    break;
                case 0:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            if (opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                lector.nextLine();
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n=== MENÚ CADENAS ===");
        System.out.println("1. C01 - Contar vocales (3 métodos)");
        System.out.println("2. C02 - Contar letras (3 métodos)");
        System.out.println("3. C03 - Eliminar vocal (3 métodos)");
        System.out.println("4. C04 - Eliminar letra (3 métodos)");
        System.out.println("5. C05 - Invertir con vocales mayúsculas (3 métodos)");
        System.out.println("6. C06 - Invertir con letras mayúsculas (3 métodos)");
        System.out.println("7. C07 - Mayúsculas sin J (3 métodos)");
        System.out.println("8. C08 - Anagramas");
        System.out.println("9. C09 - Alternar mayúsculas/minúsculas (3 métodos)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void ejecutarC01() {
        System.out.println("\n=== C01 - CONTAR VOCALES ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_contarVocalesFor(frase) + " vocales");
        System.out.println("Con WHILE: " + procesador.g1_contarVocalesWhile(frase) + " vocales");
        System.out.println("Con DO-WHILE: " + procesador.g1_contarVocalesDoWhile(frase) + " vocales");
    }

    private void ejecutarC02() {
        System.out.println("\n=== C02 - CONTAR LETRAS ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_contarLetrasFor(frase) + " letras");
        System.out.println("Con WHILE: " + procesador.g1_contarLetrasWhile(frase) + " letras");
        System.out.println("Con DO-WHILE: " + procesador.g1_contarLetrasDoWhile(frase) + " letras");
    }

    private void ejecutarC03() {
        System.out.println("\n=== C03 - ELIMINAR VOCAL ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        System.out.print("Ingrese la vocal a eliminar: ");
        char vocal = lector.nextLine().charAt(0);
        
        System.out.println("Con FOR: " + procesador.g1_eliminarVocalFor(frase, vocal));
        System.out.println("Con WHILE: " + procesador.g1_eliminarVocalWhile(frase, vocal));
        System.out.println("Con DO-WHILE: " + procesador.g1_eliminarVocalDoWhile(frase, vocal));
    }

    private void ejecutarC04() {
        System.out.println("\n=== C04 - ELIMINAR LETRA ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        System.out.print("Ingrese la letra a eliminar: ");
        char letra = lector.nextLine().charAt(0);
        
        System.out.println("Con FOR: " + procesador.g1_eliminarLetraFor(frase, letra));
        System.out.println("Con WHILE: " + procesador.g1_eliminarLetraWhile(frase, letra));
        System.out.println("Con DO-WHILE: " + procesador.g1_eliminarLetraDoWhile(frase, letra));
    }

    private void ejecutarC05() {
        System.out.println("\n=== C05 - INVERTIR CON VOCALES MAYÚSCULAS ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_invertirConVocalesMayusculasFor(frase));
        System.out.println("Con WHILE: " + procesador.g1_invertirConVocalesMayusculasWhile(frase));
        System.out.println("Con DO-WHILE: " + procesador.g1_invertirConVocalesMayusculasDoWhile(frase));
    }

    private void ejecutarC06() {
        System.out.println("\n=== C06 - INVERTIR CON LETRAS MAYÚSCULAS ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_invertirConLetrasMayusculasFor(frase));
        System.out.println("Con WHILE: " + procesador.g1_invertirConLetrasMayusculasWhile(frase));
        System.out.println("Con DO-WHILE: " + procesador.g1_invertirConLetrasMayusculasDoWhile(frase));
    }

    private void ejecutarC07() {
        System.out.println("\n=== C07 - MAYÚSCULAS SIN J ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_mayusculasSinJFor(frase));
        System.out.println("Con WHILE: " + procesador.g1_mayusculasSinJWhile(frase));
        System.out.println("Con DO-WHILE: " + procesador.g1_mayusculasSinJDoWhile(frase));
    }

    private void ejecutarC08() {
        System.out.println("\n=== C08 - ANAGRAMAS ===");
        procesador.g1_juegoAnagramas(lector);
    }

    private void ejecutarC09() {
        System.out.println("\n=== C09 - ALTERNAR MAYÚSCULAS/MINÚSCULAS ===");
        System.out.print("Ingrese una frase: ");
        String frase = lector.nextLine();
        
        System.out.println("Con FOR: " + procesador.g1_alternarMayusculasMinusculasFor(frase));
        System.out.println("Con WHILE: " + procesador.g1_alternarMayusculasMinusculasWhile(frase));
        System.out.println("Con DO-WHILE: " + procesador.g1_alternarMayusculasMinusculasDoWhile(frase));
    }
}