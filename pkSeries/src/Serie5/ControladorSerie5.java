package Serie5;

import appinfo.InformacionGrupo;
import java.util.Arrays;
import java.util.Scanner;

public class ControladorSerie5 {
    private static final long RETARDO_MILLIS = 300L;
    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie5 generador = new GeneradorSerie5();

    public ControladorSerie5(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 5 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        System.out.println();

        String nombreCompleto = solicitarNombreCompleto();
        String[] palabrasNombre = nombreCompleto.trim().split("\\s+");
        String primerNombre = palabrasNombre.length > 0 ? palabrasNombre[0] : "";
        String primerApellido = palabrasNombre.length > 1 ? palabrasNombre[palabrasNombre.length - 1] : primerNombre;

        ejecutarA01(palabrasNombre);
        ejecutarA02(primerNombre, primerApellido);
        ejecutarA03(primerNombre);
        ejecutarA04(primerNombre + primerApellido);
        ejecutarA05(primerNombre, primerApellido);
    }

    private void ejecutarA01(String[] palabrasNombre) {
        System.out.println("--- A01: Carga por palabra ---");
        int[] porcentajes = solicitarPorcentajes(palabrasNombre.length);
        String forResultado = generador.g1_generarCargaNombresConFor(palabrasNombre, porcentajes);
        String whileResultado = generador.g1_generarCargaNombresConWhile(palabrasNombre, porcentajes);
        String doWhileResultado = generador.g1_generarCargaNombresConDoWhile(palabrasNombre, porcentajes);

        System.out.println("A01 con for:\n" + forResultado);
        System.out.println("A01 con while:\n" + whileResultado);
        System.out.println("A01 con do while:\n" + doWhileResultado);
        System.out.println();
    }

    private void ejecutarA02(String nombre, String apellido) {
        System.out.println("--- A02: Matriz de iniciales ---");
        int tamano = solicitarEnteroPositivo("Ingrese el tamano de la matriz: ");
        char simbolo = solicitarCaracter("Ingrese el caracter para dibujar: ");

        String forResultado = generador.g1_generarInicialesConFor(nombre, apellido, tamano, simbolo);
        String whileResultado = generador.g1_generarInicialesConWhile(nombre, apellido, tamano, simbolo);
        String doWhileResultado = generador.g1_generarInicialesConDoWhile(nombre, apellido, tamano, simbolo);

        System.out.println("A02 con for:\n" + forResultado);
        System.out.println("A02 con while:\n" + whileResultado);
        System.out.println("A02 con do while:\n" + doWhileResultado);
        System.out.println();
    }

    private void ejecutarA03(String nombre) {
        System.out.println("--- A03: Plano f(x) = 2x ---");
        String forResultado = generador.g1_graficarPlanoConFor(nombre);
        String whileResultado = generador.g1_graficarPlanoConWhile(nombre);
        String doWhileResultado = generador.g1_graficarPlanoConDoWhile(nombre);
        System.out.println("A03 con for:\n" + forResultado);
        System.out.println("A03 con while:\n" + whileResultado);
        System.out.println("A03 con do while:\n" + doWhileResultado);
        System.out.println();
    }

    private void ejecutarA04(String texto) {
        System.out.println("--- A04: Matriz en X ---");
        String forResultado = generador.g1_generarXConFor(texto);
        String whileResultado = generador.g1_generarXConWhile(texto);
        String doWhileResultado = generador.g1_generarXConDoWhile(texto);
        System.out.println("A04 con for:\n" + forResultado);
        System.out.println("A04 con while:\n" + whileResultado);
        System.out.println("A04 con do while:\n" + doWhileResultado);
        System.out.println();
    }

    private void ejecutarA05(String nombre, String apellido) {
        System.out.println("--- A05: Matriz aleatoria con nombres ---");
        GeneradorSerie5.EstadoAnimacion forEstado = generador.g1_generarMatrizAleatoriaConFor(nombre, apellido);
        GeneradorSerie5.EstadoAnimacion whileEstado = generador.g1_generarMatrizAleatoriaConWhile(nombre, apellido);
        GeneradorSerie5.EstadoAnimacion doWhileEstado = generador.g1_generarMatrizAleatoriaConDoWhile(nombre, apellido);

        mostrarAnimacion("A05 con for", forEstado);
        mostrarAnimacion("A05 con while", whileEstado);
        mostrarAnimacion("A05 con do while", doWhileEstado);
        System.out.println();
    }

    private void mostrarAnimacion(String titulo, GeneradorSerie5.EstadoAnimacion estado) {
        System.out.println(titulo + ":");
        String[] pasos = estado.getPasos();
        for (int indice = 0; indice < pasos.length; indice++) {
            System.out.println(pasos[indice]);
            if (indice < pasos.length - 1) {
                intentarDormir(RETARDO_MILLIS);
                System.out.println();
            }
        }
    }

    private void intentarDormir(long milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private String solicitarNombreCompleto() {
        String texto;
        do {
            System.out.print("Ingrese su nombre completo: ");
            texto = lector.nextLine().trim();
        } while (texto.isEmpty());
        return texto;
    }

    private int[] solicitarPorcentajes(int cantidad) {
        int[] valores = new int[cantidad];
        boolean valido = false;
        while (!valido) {
            System.out.print("Ingrese " + cantidad + " porcentajes separados por espacio: ");
            String linea = lector.nextLine();
            String[] partes = linea.trim().split("\\s+");
            if (partes.length != cantidad) {
                System.out.println("Debe ingresar exactamente " + cantidad + " valores.");
                continue;
            }
            boolean error = false;
            for (int indice = 0; indice < cantidad; indice++) {
                try {
                    valores[indice] = Integer.parseInt(partes[indice]);
                } catch (NumberFormatException ex) {
                    error = true;
                    break;
                }
            }
            if (!error) {
                valido = true;
            } else {
                System.out.println("Ingrese solo numeros enteros.");
            }
        }
        return valores;
    }

    private int solicitarEnteroPositivo(String mensaje) {
        int valor = -1;
        while (valor <= 0) {
            System.out.print(mensaje);
            if (lector.hasNextInt()) {
                valor = lector.nextInt();
                lector.nextLine();
                if (valor <= 0) {
                    System.out.println("El valor debe ser mayor a cero.");
                }
            } else {
                System.out.println("Ingrese un numero entero valido.");
                lector.nextLine();
            }
        }
        return valor;
    }

    private char solicitarCaracter(String mensaje) {
        char caracter = 'X';
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            String linea = lector.nextLine();
            if (!linea.isEmpty()) {
                caracter = linea.charAt(0);
                valido = true;
            }
        }
        return caracter;
    }
}
