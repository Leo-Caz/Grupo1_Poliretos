package Serie2;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorSerie2 {

    private final GeneradorSerie2 generador = new GeneradorSerie2();
    private final InformacionGrupo informacionGrupo;
    private final Scanner lector;

    public ControladorSerie2(InformacionGrupo informacionGrupo, Scanner lector) {
        this.informacionGrupo = informacionGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 2 (Grupo " + informacionGrupo.getNumeroGrupo() + ") ===");
        int cantidad = solicitarCantidad();
        mostrarSeries(cantidad);
    }

    private int solicitarCantidad() {
        System.out.print("Ingrese la cantidad de terminos a generar: ");
        while (!lector.hasNextInt()) {
            System.out.println("Por favor ingrese un numero entero positivo.");
            lector.next();
            System.out.print("Ingrese la cantidad de terminos a generar: ");
        }
        int cantidad = lector.nextInt();
        if (cantidad < 0) {
            cantidad = 0;
        }
        lector.nextLine();
        System.out.println();
        return cantidad;
    }

    private void mostrarSeries(int cantidad) {
        mostrarSerie("S1 con for", generador.g1_generarS1ConFor(cantidad));
        mostrarSerie("S1 con while", generador.g1_generarS1ConWhile(cantidad));
        mostrarSerie("S1 con do while", generador.g1_generarS1ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S2 con for", generador.g1_generarS2ConFor(cantidad));
        mostrarSerie("S2 con while", generador.g1_generarS2ConWhile(cantidad));
        mostrarSerie("S2 con do while", generador.g1_generarS2ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S3 con for", generador.g1_generarS3ConFor(cantidad));
        mostrarSerie("S3 con while", generador.g1_generarS3ConWhile(cantidad));
        mostrarSerie("S3 con do while", generador.g1_generarS3ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S4 con for", generador.g1_generarS4ConFor(cantidad));
        mostrarSerie("S4 con while", generador.g1_generarS4ConWhile(cantidad));
        mostrarSerie("S4 con do while", generador.g1_generarS4ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S5 con for", generador.g1_generarS5ConFor(cantidad));
        mostrarSerie("S5 con while", generador.g1_generarS5ConWhile(cantidad));
        mostrarSerie("S5 con do while", generador.g1_generarS5ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S6 con for", generador.g1_generarS6ConFor(cantidad));
        mostrarSerie("S6 con while", generador.g1_generarS6ConWhile(cantidad));
        mostrarSerie("S6 con do while", generador.g1_generarS6ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S7 con for", generador.g1_generarS7ConFor(cantidad));
        mostrarSerie("S7 con while", generador.g1_generarS7ConWhile(cantidad));
        mostrarSerie("S7 con do while", generador.g1_generarS7ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S8 con for", generador.g1_generarS8ConFor(cantidad));
        mostrarSerie("S8 con while", generador.g1_generarS8ConWhile(cantidad));
        mostrarSerie("S8 con do while", generador.g1_generarS8ConDoWhile(cantidad));
        System.out.println();

        mostrarSerie("S9 con for", generador.g1_generarS9ConFor(cantidad));
        mostrarSerie("S9 con while", generador.g1_generarS9ConWhile(cantidad));
        mostrarSerie("S9 con do while", generador.g1_generarS9ConDoWhile(cantidad));
    }

    private void mostrarSerie(String etiqueta, String contenido) {
        System.out.println(etiqueta + ": " + contenido);
    }
}
