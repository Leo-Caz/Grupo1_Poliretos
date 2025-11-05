package Serie6;

import appinfo.InformacionGrupo;
import java.util.Random;
import java.util.Scanner;

public class ControladorSerie6 {
    private static final long RETARDO_MILLIS = 120L;

    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie6 generador = new GeneradorSerie6();

    public ControladorSerie6(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 6 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        System.out.println();

        ejecutarL01();
        ejecutarL02();
        ejecutarL03();
        ejecutarL04();
        ejecutarL05();
        ejecutarL06();
        ejecutarL07();
        ejecutarL08();
        ejecutarL09();
        ejecutarL10();
        ejecutarL11();
        ejecutarL12();
    }

    private void ejecutarL01() {
        System.out.println("--- L01: Indicador rotacional ---");
        mostrarAnimacion("L01 con for", generador.g1_generarL01IndicadorConFor());
        mostrarAnimacion("L01 con while", generador.g1_generarL01IndicadorConWhile());
        mostrarAnimacion("L01 con do while", generador.g1_generarL01IndicadorConDoWhile());
        System.out.println();
    }

    private void ejecutarL02() {
        System.out.println("--- L02: Barra con caracter personalizado ---");
        char simbolo = solicitarCaracter("Ingrese el caracter de carga: ");
        mostrarAnimacion("L02 con for", generador.g1_generarL02BarraPersonalizadaConFor(simbolo));
        mostrarAnimacion("L02 con while", generador.g1_generarL02BarraPersonalizadaConWhile(simbolo));
        mostrarAnimacion("L02 con do while", generador.g1_generarL02BarraPersonalizadaConDoWhile(simbolo));
        System.out.println();
    }

    private void ejecutarL03() {
        System.out.println("--- L03: Barra con caracter deslizante ---");
        char simbolo = solicitarCaracter("Ingrese el caracter que se desplazara: ");
        mostrarAnimacion("L03 con for", generador.g1_generarL03BarraDeslizanteConFor(simbolo));
        mostrarAnimacion("L03 con while", generador.g1_generarL03BarraDeslizanteConWhile(simbolo));
        mostrarAnimacion("L03 con do while", generador.g1_generarL03BarraDeslizanteConDoWhile(simbolo));
        System.out.println();
    }

    private void ejecutarL04() {
        System.out.println("--- L04: Waiting oOo ---");
        mostrarAnimacion("L04 con for", generador.g1_generarL04WaitingConFor());
        mostrarAnimacion("L04 con while", generador.g1_generarL04WaitingConWhile());
        mostrarAnimacion("L04 con do while", generador.g1_generarL04WaitingConDoWhile());
        System.out.println();
    }

    private void ejecutarL05() {
        System.out.println("--- L05: Barra con punta alterna ---");
        mostrarAnimacion("L05 con for", generador.g1_generarL05BarraPuntaAlternaConFor());
        mostrarAnimacion("L05 con while", generador.g1_generarL05BarraPuntaAlternaConWhile());
        mostrarAnimacion("L05 con do while", generador.g1_generarL05BarraPuntaAlternaConDoWhile());
        System.out.println();
    }

    private void ejecutarL06() {
        System.out.println("--- L06: Barra con indicador <=> ---");
        mostrarAnimacion("L06 con for", generador.g1_generarL06BarraIndicadorConFor());
        mostrarAnimacion("L06 con while", generador.g1_generarL06BarraIndicadorConWhile());
        mostrarAnimacion("L06 con do while", generador.g1_generarL06BarraIndicadorConDoWhile());
        System.out.println();
    }

    private void ejecutarL07() {
        System.out.println("--- L07: Barra con punta rotacional ---");
        mostrarAnimacion("L07 con for", generador.g1_generarL07BarraPuntaRotacionalConFor());
        mostrarAnimacion("L07 con while", generador.g1_generarL07BarraPuntaRotacionalConWhile());
        mostrarAnimacion("L07 con do while", generador.g1_generarL07BarraPuntaRotacionalConDoWhile());
        System.out.println();
    }

    private void ejecutarL08() {
        System.out.println("--- L08: Carga letra a letra ---");
        String nombreCompleto = solicitarNombreCompleto();
        mostrarAnimacion("L08 con for", generador.g1_generarL08CargaNombreConFor(nombreCompleto));
        mostrarAnimacion("L08 con while", generador.g1_generarL08CargaNombreConWhile(nombreCompleto));
        mostrarAnimacion("L08 con do while", generador.g1_generarL08CargaNombreConDoWhile(nombreCompleto));
        System.out.println();
    }

    private void ejecutarL09() {
        System.out.println("--- L09: Letras en linea con porcentajes ---");
        String nombreCompleto = solicitarNombreCompleto();
        mostrarAnimacion("L09 con for", generador.g1_generarL09LetrasPorPorcentajeConFor(nombreCompleto));
        mostrarAnimacion("L09 con while", generador.g1_generarL09LetrasPorPorcentajeConWhile(nombreCompleto));
        mostrarAnimacion("L09 con do while", generador.g1_generarL09LetrasPorPorcentajeConDoWhile(nombreCompleto));
        System.out.println();
    }

    private void ejecutarL10() {
        System.out.println("--- L10: Descarga con tamano aleatorio ---");
        Random rng = new Random();
        int tamanoKB = 10 + rng.nextInt(91); // 10-100 inclusive
        GeneradorSerie6.EstadoAnimacion forEstado = generador.g1_generarL10DescargaConFor(tamanoKB);
        GeneradorSerie6.EstadoAnimacion whileEstado = generador.g1_generarL10DescargaConWhile(tamanoKB);
        GeneradorSerie6.EstadoAnimacion doWhileEstado = generador.g1_generarL10DescargaConDoWhile(tamanoKB);
        mostrarAnimacion("L10 con for", forEstado);
        mostrarAnimacion("L10 con while", whileEstado);
        mostrarAnimacion("L10 con do while", doWhileEstado);
        System.out.println();
    }

    private void ejecutarL11() {
        System.out.println("--- L11: Senal simetrica ---");
        GeneradorSerie6.EstadoAnimacion forEstado = generador.g1_generarL11SenalSimetricaConFor();
        GeneradorSerie6.EstadoAnimacion whileEstado = generador.g1_generarL11SenalSimetricaConWhile();
        GeneradorSerie6.EstadoAnimacion doWhileEstado = generador.g1_generarL11SenalSimetricaConDoWhile();
        mostrarAnimacion("L11 con for", forEstado);
        mostrarAnimacion("L11 con while", whileEstado);
        mostrarAnimacion("L11 con do while", doWhileEstado);
        System.out.println();
    }

    private void ejecutarL12() {
        System.out.println("--- L12: Desplazamiento de figura ---");
        GeneradorSerie6.EstadoAnimacion forEstado = generador.g1_generarL12FiguraDesplazadaConFor();
        GeneradorSerie6.EstadoAnimacion whileEstado = generador.g1_generarL12FiguraDesplazadaConWhile();
        GeneradorSerie6.EstadoAnimacion doWhileEstado = generador.g1_generarL12FiguraDesplazadaConDoWhile();
        mostrarAnimacion("L12 con for", forEstado);
        mostrarAnimacion("L12 con while", whileEstado);
        mostrarAnimacion("L12 con do while", doWhileEstado);
        System.out.println();
    }

    private void mostrarAnimacion(String titulo, GeneradorSerie6.EstadoAnimacion animacion) {
        System.out.println(titulo + ":");
        String[] pasos = animacion.getPasos();
        for (int indice = 0; indice < pasos.length; indice++) {
            System.out.println(pasos[indice]);
            if (indice < pasos.length - 1) {
                esperar();
            }
        }
    }

    private void esperar() {
        try {
            Thread.sleep(RETARDO_MILLIS);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private char solicitarCaracter(String mensaje) {
        char caracter = '#';
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

    private String solicitarNombreCompleto() {
        String texto;
        do {
            System.out.print("Ingrese su nombre completo: ");
            texto = lector.nextLine().trim();
        } while (texto.isEmpty());
        return texto;
    }
}
