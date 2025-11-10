import appinfo.InformacionGrupo;
import java.util.Scanner;

public class App {
    private static final InformacionGrupo INFORMACION_GRUPO = new InformacionGrupo(
        1,
        new String[] {
            "Bhorques.Nicolas",
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
                    case 1 -> ejecutarSerie1(scanner);
                    case 2 -> ejecutarSerie2(scanner);
                    case 3 -> ejecutarSerie3(scanner);
                    case 4 -> ejecutarSerie4(scanner);
                    case 5 -> ejecutarSerie5(scanner);
                    case 6 -> ejecutarSerie6(scanner);
                    case 7 -> ejecutarSerie7(scanner);
                    case 8 -> ejecutarSerie8(scanner);
                    case 9 -> ejecutarCadenasCaracteres(scanner);
                    case 10 -> ejecutarArrays(scanner); 
                    case 0 -> {
                        continuar = false;
                        
                    }
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
                System.out.println();
            }
        }
    }

    
    private static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1. Ejecutar Serie 1");
        System.out.println("2. Ejecutar Serie 2");
        System.out.println("3. Ejecutar Serie 3");
        System.out.println("4. Ejecutar Serie 4");
        System.out.println("5. Ejecutar Serie 5");
        System.out.println("6. Ejecutar Serie 6");
        System.out.println("7. Ejecutar Serie 7");
        System.out.println("8. Ejecutar Serie 8");
        System.out.println("9. Ejecutar Cadenas de Caracteres");
        System.out.println("10. Ejecutar Arrays");
        System.out.println("0. Salir");
    }

    private static int leerOpcion(Scanner scanner) {
        System.out.print("Seleccione una opción: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Seleccione una opción válida: ");
            scanner.next();
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

      private static void ejecutarSerie1(Scanner scanner) {
        Serie1.ControladorSerie1 controlador = new Serie1.ControladorSerie1(INFORMACION_GRUPO, scanner);
        controlador.run();
    }

    private static void ejecutarSerie2(Scanner scanner) {
        Serie2.ControladorSerie2 controlador = new Serie2.ControladorSerie2(INFORMACION_GRUPO, scanner);
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
        boolean continuar = true;
        while (continuar) {
            System.out.println("SUBMENÚ: Cadenas de Caracteres");
            System.out.println("1. C01 - Contar vocales");
            System.out.println("2. C02 - Contar letras");
            System.out.println("3. C03 - Eliminar vocales");
            System.out.println("4. C04 - Eliminar letra específica");
            System.out.println("5. C05 - Invertir con vocales mayúsculas");
            System.out.println("6. C06 - Invertir con letras mayúsculas");
            System.out.println("7. C07 - Mayúsculas sin 'J'");
            System.out.println("8. C08 - Juego de anagramas");
            System.out.println("9. C09 - Alternar mayúsculas/minúsculas");
            System.out.println("0. Volver al menú principal");

            int opcion = leerOpcion(scanner);
            switch (opcion) {
                case 1 -> new CadenasCaracteres.C01.ControladorC01().run();
                case 2 -> new CadenasCaracteres.C02.ControladorC02().run();
                case 3 -> new CadenasCaracteres.C03.ControladorC03().run();
                case 4 -> new CadenasCaracteres.C04.ControladorC04().run();
                case 5 -> new CadenasCaracteres.C05.ControladorC05().run();
                case 6 -> new CadenasCaracteres.C06.ControladorC06().run();
                case 7 -> new CadenasCaracteres.C07.ControladorC07().run();
                case 8 -> new CadenasCaracteres.C08.ControladorC08().run();
                case 9 -> new CadenasCaracteres.C09.ControladorC09().run();
                case 0 -> continuar = false;
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        }
    }

       private static void ejecutarArrays(Scanner scanner) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("SUBMENÚ: Arrays");
            System.out.println("1. A01 - Porcentaje de carga de palabras");
            System.out.println("2. A02 - Matriz de iniciales");
            System.out.println("3. A03 - Plano f(x)=2x con letras");
            System.out.println("4. A04 - Matriz en forma de X");
            System.out.println("5. A05 - Matriz aleatoria con nombre");
            System.out.println("0. Volver al menú principal");

            int opcion = leerOpcion(scanner);
            switch (opcion) {
                case 1 -> new Arrays.A01.ControladorA01().run();
                case 2 -> new Arrays.A02.ControladorA02().run();
                case 3 -> new Arrays.A03.ControladorA03().run();
                case 4 -> new Arrays.A04.ControladorA04().run();
                case 5 -> new Arrays.A05.ControladorA05().run();
                case 0 -> continuar = false;
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        }
    }
}

