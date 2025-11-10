import appinfo.InformacionGrupo;
import java.util.Scanner;

public class App {
    private static final InformacionGrupo INFORMACION_GRUPO = new InformacionGrupo(
        1,
        new String[] {
            "Bohorquez.Nicolas",
            "Cando.Alexander",
            "Cartuche.Zoe",
            "Castro.Leandro"
        }
    );

    public static void main(String[] args) {
        INFORMACION_GRUPO.mostrarResumen();
        System.out.println();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            while (continuar) {
                mostrarMenu();
                int opcion = leerOpcion(scanner);
                switch (opcion) {
                    case 1:
                        ejecutarSerie1(scanner);
                        break;
                    case 2:
                        ejecutarSerie2(scanner);
                        break;
                    case 3:
                        ejecutarSerie3(scanner);
                        break;
                    case 4:
                        ejecutarSerie4(scanner);
                        break;
                    case 5:
                        ejecutarSerie5(scanner);
                        break;
                    case 6:
                        ejecutarSerie6(scanner);
                        break;
                    case 7:
                        ejecutarSerie7(scanner);
                        break;
                    case 8:
                        ejecutarSerie8(scanner);
                        break;
                    case 9:
                        ejecutarCadenasCaracteres(scanner); // Nueva opción
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Hasta luego!");
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                        break;
                }
                System.out.println();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("=== Menu Principal ===");
        System.out.println("1. Ejecutar Serie 1");
        System.out.println("2. Ejecutar Serie 2");
        System.out.println("3. Ejecutar Serie 3");
        System.out.println("4. Ejecutar Serie 4");
        System.out.println("5. Ejecutar Serie 5");
        System.out.println("6. Ejecutar Serie 6");
        System.out.println("7. Ejecutar Serie 7");
        System.out.println("8. Ejecutar Serie 8");
        System.out.println("9. Ejecutar Cadenas de Caracteres");
        System.out.println("0. Salir");
    }

    private static int leerOpcion(Scanner scanner) {
        System.out.print("Seleccione una opcion: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Seleccione una opcion valida: ");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    private static void ejecutarSerie1(Scanner scanner) {
        pkSerie.Serie1.ControladorSerie1 controlador = new pkSerie.Serie1.ControladorSerie1(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie2(Scanner scanner) {
        pkSerie.Serie2.ControladorSerie2 controlador = new pkSerie.Serie2.ControladorSerie2(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie3(Scanner scanner) {
        Serie3.ControladorSerie3 controlador = new Serie3.ControladorSerie3(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie4(Scanner scanner) {
        Serie4.ControladorSerie4 controlador = new Serie4.ControladorSerie4(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie5(Scanner scanner) {
        Serie5.ControladorSerie5 controlador = new Serie5.ControladorSerie5(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie6(Scanner scanner) {
        Serie6.ControladorSerie6 controlador = new Serie6.ControladorSerie6(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie7(Scanner scanner) {
        Serie7.ControladorSerie7 controlador = new Serie7.ControladorSerie7(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie8(Scanner scanner) {
        Serie8.ControladorSerie8 controlador = new Serie8.ControladorSerie8(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarCadenasCaracteres(Scanner scanner) {
        CadenasCaracteres.ControladorCadenas controlador = new CadenasCaracteres.ControladorCadenas(INFORMACION_GRUPO, scanner);
        controlador.run();
    }
}
