package Serie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;

public class GeneradorSerie6 {
    private enum TipoBucle {
        FOR,
        WHILE,
        DO_WHILE
    }

    private static final char[] ROTACION = {'|', '/', '-', '\\'};
    private static final String[] ESPERA_O0O = {"o0o", "0o0", "oo0", "0oo"};
    private static final int BARRA_LONGITUD = 20;
    private static final int TOTAL_PORCENTAJE = 100;

    public EstadoAnimacion g1_generarL01IndicadorConFor() {
        return g1_generarL01Indicador(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL01IndicadorConWhile() {
        return g1_generarL01Indicador(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL01IndicadorConDoWhile() {
        return g1_generarL01Indicador(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL02BarraPersonalizadaConFor(char simbolo) {
        return g1_generarL02BarraPersonalizada(simbolo, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL02BarraPersonalizadaConWhile(char simbolo) {
        return g1_generarL02BarraPersonalizada(simbolo, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL02BarraPersonalizadaConDoWhile(char simbolo) {
        return g1_generarL02BarraPersonalizada(simbolo, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL03BarraDeslizanteConFor(char simbolo) {
        return g1_generarL03BarraDeslizante(simbolo, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL03BarraDeslizanteConWhile(char simbolo) {
        return g1_generarL03BarraDeslizante(simbolo, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL03BarraDeslizanteConDoWhile(char simbolo) {
        return g1_generarL03BarraDeslizante(simbolo, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL04WaitingConFor() {
        return g1_generarL04Waiting(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL04WaitingConWhile() {
        return g1_generarL04Waiting(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL04WaitingConDoWhile() {
        return g1_generarL04Waiting(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL05BarraPuntaAlternaConFor() {
        return g1_generarL05BarraPuntaAlterna(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL05BarraPuntaAlternaConWhile() {
        return g1_generarL05BarraPuntaAlterna(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL05BarraPuntaAlternaConDoWhile() {
        return g1_generarL05BarraPuntaAlterna(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL06BarraIndicadorConFor() {
        return g1_generarL06BarraIndicador(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL06BarraIndicadorConWhile() {
        return g1_generarL06BarraIndicador(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL06BarraIndicadorConDoWhile() {
        return g1_generarL06BarraIndicador(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL07BarraPuntaRotacionalConFor() {
        return g1_generarL07BarraPuntaRotacional(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL07BarraPuntaRotacionalConWhile() {
        return g1_generarL07BarraPuntaRotacional(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL07BarraPuntaRotacionalConDoWhile() {
        return g1_generarL07BarraPuntaRotacional(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL08CargaNombreConFor(String nombreCompleto) {
        return g1_generarL08CargaNombre(nombreCompleto, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL08CargaNombreConWhile(String nombreCompleto) {
        return g1_generarL08CargaNombre(nombreCompleto, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL08CargaNombreConDoWhile(String nombreCompleto) {
        return g1_generarL08CargaNombre(nombreCompleto, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL09LetrasPorPorcentajeConFor(String nombreCompleto) {
        return g1_generarL09LetrasPorPorcentaje(nombreCompleto, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL09LetrasPorPorcentajeConWhile(String nombreCompleto) {
        return g1_generarL09LetrasPorPorcentaje(nombreCompleto, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL09LetrasPorPorcentajeConDoWhile(String nombreCompleto) {
        return g1_generarL09LetrasPorPorcentaje(nombreCompleto, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL10DescargaConFor(int tamanoKB) {
        return g1_generarL10Descarga(tamanoKB, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL10DescargaConWhile(int tamanoKB) {
        return g1_generarL10Descarga(tamanoKB, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL10DescargaConDoWhile(int tamanoKB) {
        return g1_generarL10Descarga(tamanoKB, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL11SenalSimetricaConFor() {
        return g1_generarL11SenalSimetrica(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL11SenalSimetricaConWhile() {
        return g1_generarL11SenalSimetrica(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL11SenalSimetricaConDoWhile() {
        return g1_generarL11SenalSimetrica(TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarL12FiguraDesplazadaConFor() {
        return g1_generarL12FiguraDesplazada(TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarL12FiguraDesplazadaConWhile() {
        return g1_generarL12FiguraDesplazada(TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarL12FiguraDesplazadaConDoWhile() {
        return g1_generarL12FiguraDesplazada(TipoBucle.DO_WHILE);
    }

    private EstadoAnimacion g1_generarL01Indicador(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> {
            int indice = porcentaje / 5;
            char simbolo = ROTACION[indice % ROTACION.length];
            pasos.add(String.format("%c %3d%%", simbolo, porcentaje));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL02BarraPersonalizada(char simbolo, TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> pasos.add(g1_formatearBarraSimple(porcentaje, simbolo)));
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL03BarraDeslizante(char simbolo, TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, BARRA_LONGITUD - 1, 1, tipo, posicion -> {
            int porcentaje = (posicion * 100) / Math.max(1, BARRA_LONGITUD - 1);
            pasos.add(g1_formatearBarraDeslizante(posicion, simbolo, porcentaje));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL04Waiting(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> {
            int indice = (porcentaje / 5) % ESPERA_O0O.length;
            pasos.add(String.format("%s %3d%%", ESPERA_O0O[indice], porcentaje));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL05BarraPuntaAlterna(TipoBucle tipo) {
        char[] puntas = {'>', '-'};
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> {
            int indice = (porcentaje / 5) % puntas.length;
            pasos.add(g1_formatearBarraConPunta(porcentaje, '=', puntas[indice]));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL06BarraIndicador(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> pasos.add(g1_formatearBarraIndicadorCentral(porcentaje)));
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL07BarraPuntaRotacional(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, TOTAL_PORCENTAJE, 5, tipo, porcentaje -> {
            int indice = (porcentaje / 5) % ROTACION.length;
            pasos.add(g1_formatearBarraConPunta(porcentaje, '=', ROTACION[indice]));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL08CargaNombre(String nombreCompleto, TipoBucle tipo) {
        String limpio = nombreCompleto == null ? "" : nombreCompleto.trim();
        if (limpio.isEmpty()) {
            return new EstadoAnimacion(new String[] {"(sin nombre)"});
        }
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, limpio.length(), 1, tipo, procesadas -> {
            int porcentaje = limpio.length() == 0 ? 100 : procesadas * 100 / Math.max(1, limpio.length());
            if (procesadas >= limpio.length()) {
                porcentaje = 100;
            }
            String visible = limpio.substring(0, Math.min(procesadas, limpio.length()));
            StringBuilder barra = new StringBuilder();
            barra.append('[');
            barra.append(visible);
            for (int indice = visible.length(); indice < limpio.length(); indice++) {
                barra.append(' ');
            }
            barra.append("] ");
            barra.append(String.format("%3d%%", porcentaje));
            pasos.add(barra.toString());
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL09LetrasPorPorcentaje(String nombreCompleto, TipoBucle tipo) {
        String limpio = nombreCompleto == null ? "" : nombreCompleto.replaceAll("\\s+", "");
        if (limpio.isEmpty()) {
            return new EstadoAnimacion(new String[] {"(sin nombre)"});
        }
        List<String> pasos = new ArrayList<>();
        g1_iterarRango(0, limpio.length() - 1, 1, tipo, indice -> {
            char letra = limpio.charAt(indice);
            int porcentaje = (indice + 1) * 100 / Math.max(1, limpio.length());
            pasos.add(String.format("%c %3d%%", letra, Math.min(100, porcentaje)));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL10Descarga(int tamanoKB, TipoBucle tipo) {
        int total = Math.max(10, tamanoKB);
        int paso = Math.max(1, total / 15);
        List<String> pasos = new ArrayList<>();
        pasos.add("Downloading ArchivoYarl-win_amd64.whl (" + total + " kB)");
        g1_iterarRango(0, total, paso, tipo, progreso -> {
            int valor = Math.min(progreso, total);
            int porcentaje = total == 0 ? 100 : (valor * 100) / total;
            pasos.add(g1_formatearDescarga(valor, total, porcentaje));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL11SenalSimetrica(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        Random rng = new Random(20250411L + tipo.ordinal());
        int niveles = 50;
        g1_iterarRango(1, niveles, 1, tipo, nivel -> {
            int longitud = rng.nextInt(11);
            pasos.add(g1_formatearSenalSimetrica(longitud, nivel));
        });
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private EstadoAnimacion g1_generarL12FiguraDesplazada(TipoBucle tipo) {
        List<String> pasos = new ArrayList<>();
        int maxDesplazamiento = 12;
        List<Integer> posiciones = new ArrayList<>();
        switch (tipo) {
            case FOR:
                for (int posicion = 0; posicion <= maxDesplazamiento; posicion++) {
                    posiciones.add(posicion);
                }
                for (int posicion = maxDesplazamiento - 1; posicion >= 0; posicion--) {
                    posiciones.add(posicion);
                }
                break;
            case WHILE:
                int posicionWhile = 0;
                while (posicionWhile <= maxDesplazamiento) {
                    posiciones.add(posicionWhile);
                    posicionWhile++;
                }
                posicionWhile = maxDesplazamiento - 1;
                while (posicionWhile >= 0) {
                    posiciones.add(posicionWhile);
                    posicionWhile--;
                }
                break;
            case DO_WHILE:
                int posicionDo = 0;
                if (maxDesplazamiento >= 0) {
                    do {
                        posiciones.add(posicionDo);
                        posicionDo++;
                    } while (posicionDo <= maxDesplazamiento);
                    posicionDo = maxDesplazamiento - 1;
                    if (posicionDo >= 0) {
                        do {
                            posiciones.add(posicionDo);
                            posicionDo--;
                        } while (posicionDo >= 0);
                    }
                }
                break;
        }
        for (int posicion : posiciones) {
            pasos.add(g1_formatearFiguraDesplazada(posicion));
        }
        return new EstadoAnimacion(pasos.toArray(new String[0]));
    }

    private void g1_iterarRango(int inicio, int fin, int paso, TipoBucle tipo, IntConsumer accion) {
        if (paso <= 0) {
            paso = 1;
        }
        switch (tipo) {
            case FOR: {
                int ultimo = Integer.MIN_VALUE;
                for (int valor = inicio; valor <= fin; valor += paso) {
                    accion.accept(valor);
                    ultimo = valor;
                }
                if (ultimo < fin) {
                    accion.accept(fin);
                }
                break;
            }
            case WHILE: {
                int valor = inicio;
                int ultimo = Integer.MIN_VALUE;
                while (valor <= fin) {
                    accion.accept(valor);
                    ultimo = valor;
                    valor += paso;
                }
                if (ultimo < fin) {
                    accion.accept(fin);
                }
                break;
            }
            case DO_WHILE: {
                if (inicio > fin) {
                    accion.accept(fin);
                    break;
                }
                int valor = inicio;
                int ultimo = Integer.MIN_VALUE;
                do {
                    accion.accept(valor);
                    ultimo = valor;
                    valor += paso;
                } while (valor <= fin);
                if (ultimo < fin) {
                    accion.accept(fin);
                }
                break;
            }
        }
    }

    private String g1_formatearBarraSimple(int porcentaje, char simbolo) {
        int llenos = porcentaje * BARRA_LONGITUD / TOTAL_PORCENTAJE;
        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int indice = 0; indice < BARRA_LONGITUD; indice++) {
            barra.append(indice < llenos ? simbolo : ' ');
        }
        barra.append("] ");
        barra.append(String.format("%3d%%", porcentaje));
        return barra.toString();
    }

    private String g1_formatearBarraDeslizante(int posicion, char simbolo, int porcentaje) {
        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int indice = 0; indice < BARRA_LONGITUD; indice++) {
            if (indice == posicion) {
                barra.append(simbolo);
            } else {
                barra.append(' ');
            }
        }
        barra.append("] ");
        barra.append(String.format("%3d%%", Math.min(100, porcentaje)));
        return barra.toString();
    }

    private String g1_formatearBarraConPunta(int porcentaje, char relleno, char punta) {
        int llenos = porcentaje * BARRA_LONGITUD / TOTAL_PORCENTAJE;
        int posicionPunta = Math.min(BARRA_LONGITUD - 1, Math.max(0, llenos));
        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int indice = 0; indice < BARRA_LONGITUD; indice++) {
            if (indice < posicionPunta) {
                barra.append(relleno);
            } else if (indice == posicionPunta) {
                barra.append(punta);
            } else {
                barra.append(' ');
            }
        }
        barra.append("] ");
        barra.append(String.format("%3d%%", porcentaje));
        return barra.toString();
    }

    private String g1_formatearBarraIndicadorCentral(int porcentaje) {
        int anchoIndicador = 3;
        int maxPosicion = Math.max(1, BARRA_LONGITUD - anchoIndicador);
        int posicion = porcentaje * maxPosicion / TOTAL_PORCENTAJE;
        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int indice = 0; indice < BARRA_LONGITUD; indice++) {
            if (indice < posicion) {
                barra.append('=');
            } else if (indice == posicion) {
                barra.append('<');
            } else if (indice == posicion + 1) {
                barra.append('=');
            } else if (indice == posicion + 2) {
                barra.append('>');
            } else {
                barra.append(' ');
            }
        }
        barra.append("] ");
        barra.append(String.format("%3d%%", porcentaje));
        return barra.toString();
    }

    private String g1_formatearDescarga(int progreso, int total, int porcentaje) {
        int llenos = total == 0 ? BARRA_LONGITUD : progreso * BARRA_LONGITUD / total;
        StringBuilder barra = new StringBuilder();
        barra.append('[');
        for (int indice = 0; indice < BARRA_LONGITUD; indice++) {
            barra.append(indice < llenos ? '#' : ' ');
        }
        barra.append("] ");
        barra.append(String.format("%3d%%  (%3d kB / %3d kB) [verde]", Math.min(100, porcentaje), progreso, total));
        return barra.toString();
    }

    private String g1_formatearSenalSimetrica(int longitud, int nivel) {
        StringBuilder izquierda = new StringBuilder();
        for (int indice = 0; indice < longitud; indice++) {
            izquierda.append('-');
        }
        String derecha = izquierda.toString();
        String color = (nivel % 2 == 0) ? "[cyan]" : "[magenta]";
        return izquierda + "|" + derecha + " " + color + " nivel " + nivel + " valor " + longitud;
    }

    private String g1_formatearFiguraDesplazada(int desplazamiento) {
        String espacio = " ".repeat(Math.max(0, desplazamiento));
        StringBuilder texto = new StringBuilder();
        texto.append(espacio).append("\\|||/").append(System.lineSeparator());
        texto.append(espacio).append("(> <)").append(System.lineSeparator());
        texto.append(espacio).append("ooO-(_)-Ooo");
        return texto.toString();
    }

    public static class EstadoAnimacion {
        private final String[] pasos;

        public EstadoAnimacion(String[] pasos) {
            this.pasos = pasos == null ? new String[0] : pasos.clone();
        }

        public String[] getPasos() {
            return pasos.clone();
        }
    }
}
