package Serie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorSerie5 {
    private enum TipoBucle {
        FOR,
        WHILE,
        DO_WHILE
    }

    public String g1_generarCargaNombresConFor(String[] palabras, int[] porcentajes) {
        return g1_generarCargaNombres(palabras, porcentajes, TipoBucle.FOR);
    }

    public String g1_generarCargaNombresConWhile(String[] palabras, int[] porcentajes) {
        return g1_generarCargaNombres(palabras, porcentajes, TipoBucle.WHILE);
    }

    public String g1_generarCargaNombresConDoWhile(String[] palabras, int[] porcentajes) {
        return g1_generarCargaNombres(palabras, porcentajes, TipoBucle.DO_WHILE);
    }

    public String g1_generarInicialesConFor(String nombre, String apellido, int tamano, char simbolo) {
        return g1_generarIniciales(nombre, apellido, tamano, simbolo, TipoBucle.FOR);
    }

    public String g1_generarInicialesConWhile(String nombre, String apellido, int tamano, char simbolo) {
        return g1_generarIniciales(nombre, apellido, tamano, simbolo, TipoBucle.WHILE);
    }

    public String g1_generarInicialesConDoWhile(String nombre, String apellido, int tamano, char simbolo) {
        return g1_generarIniciales(nombre, apellido, tamano, simbolo, TipoBucle.DO_WHILE);
    }

    public String g1_graficarPlanoConFor(String nombre) {
        return g1_graficarPlano(nombre, TipoBucle.FOR);
    }

    public String g1_graficarPlanoConWhile(String nombre) {
        return g1_graficarPlano(nombre, TipoBucle.WHILE);
    }

    public String g1_graficarPlanoConDoWhile(String nombre) {
        return g1_graficarPlano(nombre, TipoBucle.DO_WHILE);
    }

    public String g1_generarXConFor(String texto) {
        return g1_generarX(texto, TipoBucle.FOR);
    }

    public String g1_generarXConWhile(String texto) {
        return g1_generarX(texto, TipoBucle.WHILE);
    }

    public String g1_generarXConDoWhile(String texto) {
        return g1_generarX(texto, TipoBucle.DO_WHILE);
    }

    public EstadoAnimacion g1_generarMatrizAleatoriaConFor(String nombre, String apellido) {
        return g1_generarMatrizAleatoria(nombre, apellido, TipoBucle.FOR);
    }

    public EstadoAnimacion g1_generarMatrizAleatoriaConWhile(String nombre, String apellido) {
        return g1_generarMatrizAleatoria(nombre, apellido, TipoBucle.WHILE);
    }

    public EstadoAnimacion g1_generarMatrizAleatoriaConDoWhile(String nombre, String apellido) {
        return g1_generarMatrizAleatoria(nombre, apellido, TipoBucle.DO_WHILE);
    }

    private String g1_generarCargaNombres(String[] palabras, int[] porcentajes, TipoBucle tipo) {
        if (palabras == null || porcentajes == null || palabras.length != porcentajes.length) {
            return "(datos incompletos)";
        }
        StringBuilder texto = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < palabras.length; indice++) {
                    texto.append(g1_construirBarraCarga(palabras[indice], porcentajes[indice]));
                    if (indice < palabras.length - 1) {
                        texto.append(System.lineSeparator());
                    }
                }
                break;
            case WHILE:
                int indice = 0;
                while (indice < palabras.length) {
                    texto.append(g1_construirBarraCarga(palabras[indice], porcentajes[indice]));
                    if (indice < palabras.length - 1) {
                        texto.append(System.lineSeparator());
                    }
                    indice++;
                }
                break;
            case DO_WHILE:
                if (palabras.length == 0) {
                    return "";
                }
                int indiceDo = 0;
                do {
                    texto.append(g1_construirBarraCarga(palabras[indiceDo], porcentajes[indiceDo]));
                    indiceDo++;
                    if (indiceDo < palabras.length) {
                        texto.append(System.lineSeparator());
                    }
                } while (indiceDo < palabras.length);
                break;
        }
        return texto.toString();
    }

    private String g1_generarIniciales(String nombre, String apellido, int tamano, char simbolo, TipoBucle tipo) {
        if (tamano <= 1) {
            return "(tamano insuficiente)";
        }
        int ancho = tamano * 2 + 1;
        char[][] matriz = new char[tamano][ancho];
        g1_rellenarEspacios(matriz);
        switch (tipo) {
            case FOR:
                for (int fila = 0; fila < tamano; fila++) {
                    g1_dibujarP(matriz, fila, 0, tamano, simbolo);
                    g1_dibujarP(matriz, fila, tamano + 1, tamano, simbolo);
                }
                break;
            case WHILE:
                int filaWhile = 0;
                while (filaWhile < tamano) {
                    g1_dibujarP(matriz, filaWhile, 0, tamano, simbolo);
                    g1_dibujarP(matriz, filaWhile, tamano + 1, tamano, simbolo);
                    filaWhile++;
                }
                break;
            case DO_WHILE:
                int filaDo = 0;
                if (tamano > 0) {
                    do {
                        g1_dibujarP(matriz, filaDo, 0, tamano, simbolo);
                        g1_dibujarP(matriz, filaDo, tamano + 1, tamano, simbolo);
                        filaDo++;
                    } while (filaDo < tamano);
                }
                break;
        }
        return g1_matrizATexto(matriz);
    }

    private void g1_dibujarP(char[][] matriz, int fila, int inicioColumna, int tamano, char simbolo) {
        int columnaMax = inicioColumna + tamano - 1;
        if (fila == 0 || fila == tamano / 2) {
            for (int columna = inicioColumna; columna <= columnaMax; columna++) {
                matriz[fila][columna] = simbolo;
            }
        } else if (fila < tamano / 2) {
            matriz[fila][inicioColumna] = simbolo;
            matriz[fila][columnaMax] = simbolo;
        } else {
            matriz[fila][inicioColumna] = simbolo;
        }
    }

    private String g1_graficarPlano(String nombre, TipoBucle tipo) {
        String texto = nombre == null ? "" : nombre.replaceAll("\\s+", "");
        if (texto.isEmpty()) {
            return "(sin nombre)";
        }
        StringBuilder resultado = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int nivel = texto.length(); nivel >= 1; nivel--) {
                    resultado.append(g1_lineaPlano(nivel, texto.charAt(nivel - 1), nivel - 1));
                    resultado.append(System.lineSeparator());
                }
                break;
            case WHILE:
                int nivelWhile = texto.length();
                while (nivelWhile >= 1) {
                    resultado.append(g1_lineaPlano(nivelWhile, texto.charAt(nivelWhile - 1), nivelWhile - 1));
                    resultado.append(System.lineSeparator());
                    nivelWhile--;
                }
                break;
            case DO_WHILE:
                int nivelDo = texto.length();
                if (nivelDo > 0) {
                    do {
                        resultado.append(g1_lineaPlano(nivelDo, texto.charAt(nivelDo - 1), nivelDo - 1));
                        resultado.append(System.lineSeparator());
                        nivelDo--;
                    } while (nivelDo >= 1);
                }
                break;
        }
        resultado.append(g1_lineaBasePlano(texto.length()));
        return resultado.toString();
    }

    private String g1_generarX(String texto, TipoBucle tipo) {
        String limpio = texto == null ? "" : texto.replaceAll("\\s+", "");
        if (limpio.isEmpty()) {
            return "(sin texto)";
        }
        int tamano = limpio.length();
        char[][] matriz = new char[tamano][tamano];
        g1_rellenarEspacios(matriz);
        switch (tipo) {
            case FOR:
                for (int fila = 0; fila < tamano; fila++) {
                    char caracter = limpio.charAt(fila % limpio.length());
                    matriz[fila][fila] = caracter;
                    matriz[fila][tamano - 1 - fila] = caracter;
                }
                break;
            case WHILE:
                int filaWhile = 0;
                while (filaWhile < tamano) {
                    char caracter = limpio.charAt(filaWhile % limpio.length());
                    matriz[filaWhile][filaWhile] = caracter;
                    matriz[filaWhile][tamano - 1 - filaWhile] = caracter;
                    filaWhile++;
                }
                break;
            case DO_WHILE:
                int filaDo = 0;
                do {
                    char caracter = limpio.charAt(filaDo % limpio.length());
                    matriz[filaDo][filaDo] = caracter;
                    matriz[filaDo][tamano - 1 - filaDo] = caracter;
                    filaDo++;
                } while (filaDo < tamano);
                break;
        }
        return g1_matrizATexto(matriz);
    }

    private EstadoAnimacion g1_generarMatrizAleatoria(String nombre, String apellido, TipoBucle tipo) {
        String base = nombre == null ? "" : nombre.replaceAll("\\s+", "");
        String complemento = apellido == null ? "" : apellido.replaceAll("\\s+", "");
        if (base.isEmpty() && complemento.isEmpty()) {
            return new EstadoAnimacion(new String[] {"(sin datos)"});
        }
        int tamano = Math.max(Math.max(base.length(), complemento.length()), 2);
        char[][] matriz = new char[tamano][tamano];
        g1_rellenarEspacios(matriz);
        List<String> estados = new ArrayList<>();
        estados.add(g1_matrizATexto(matriz));

        Random aleatorio = new Random(base.hashCode() * 31L + complemento.hashCode() + tipo.ordinal());
        g1_colocarTexto(matriz, base, aleatorio, tipo, estados);
        g1_colocarTexto(matriz, complemento, aleatorio, tipo, estados);

        return new EstadoAnimacion(estados.toArray(new String[0]));
    }

    private void g1_colocarTexto(char[][] matriz, String texto, Random aleatorio, TipoBucle tipo, List<String> estados) {
        if (texto.isEmpty()) {
            return;
        }
        char[] letras = texto.toCharArray();
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < letras.length; indice++) {
                    g1_colocarCaracter(matriz, letras[indice], aleatorio);
                    estados.add(g1_matrizATexto(matriz));
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < letras.length) {
                    g1_colocarCaracter(matriz, letras[indiceWhile], aleatorio);
                    estados.add(g1_matrizATexto(matriz));
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                int indiceDo = 0;
                do {
                    g1_colocarCaracter(matriz, letras[indiceDo], aleatorio);
                    estados.add(g1_matrizATexto(matriz));
                    indiceDo++;
                } while (indiceDo < letras.length);
                break;
        }
    }

    private void g1_colocarCaracter(char[][] matriz, char caracter, Random aleatorio) {
        int tamano = matriz.length;
        int posicion = aleatorio.nextInt(tamano * tamano);
        int fila = posicion / tamano;
        int columna = posicion % tamano;
        if (matriz[fila][columna] == ' ') {
            matriz[fila][columna] = caracter;
        } else if (matriz[fila][columna] == caracter) {
            matriz[fila][columna] = '*';
        } else {
            matriz[fila][columna] = '*';
        }
    }

    private void g1_rellenarEspacios(char[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = ' ';
            }
        }
    }

    private String g1_construirBarraCarga(String palabra, int porcentaje) {
        int longitud = 15;
        int llenos = Math.max(0, Math.min(longitud, porcentaje * longitud / 100));
        StringBuilder barra = new StringBuilder();
        barra.append("[");
        for (int indice = 0; indice < llenos; indice++) {
            barra.append("=");
        }
        for (int indice = llenos; indice < longitud; indice++) {
            barra.append(" ");
        }
        barra.append(">] ");
        barra.append(String.format("%3d%% ", porcentaje));
        barra.append(palabra == null ? "" : palabra.substring(0, Math.min(palabra.length(), 7)));
        return barra.toString();
    }

    private String g1_lineaPlano(int nivel, char caracter, int desplazamiento) {
        StringBuilder linea = new StringBuilder();
        linea.append(String.format("%2d |", nivel));
        for (int indice = 0; indice < desplazamiento; indice++) {
            linea.append(" ");
        }
        linea.append(caracter);
        return linea.toString();
    }

    private String g1_lineaBasePlano(int longitud) {
        StringBuilder linea = new StringBuilder();
        linea.append(" 0 |");
        for (int indice = 0; indice < longitud + 2; indice++) {
            linea.append("_");
        }
        return linea.toString();
    }

    private String g1_matrizATexto(char[][] matriz) {
        StringBuilder texto = new StringBuilder();
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                texto.append(matriz[fila][columna]);
                if (columna < matriz[fila].length - 1) {
                    texto.append(' ');
                }
            }
            if (fila < matriz.length - 1) {
                texto.append(System.lineSeparator());
            }
        }
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
