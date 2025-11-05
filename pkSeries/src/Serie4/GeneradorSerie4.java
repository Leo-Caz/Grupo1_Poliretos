package Serie4;

import java.util.Arrays;

public class GeneradorSerie4 {
    private enum TipoBucle {
        FOR,
        WHILE,
        DO_WHILE
    }

    private static final String VOCALES = "aeiouAEIOU\u00E1\u00E9\u00ED\u00F3\u00FA\u00C1\u00C9\u00CD\u00D3\u00DA";
    private static final JuegoAnagrama[] JUEGOS_ANAGRAMA = new JuegoAnagrama[] {
        new JuegoAnagrama("delira", new String[] {"lidera", "redila", "dilera"}),
        new JuegoAnagrama("ballena", new String[] {"llenaba"}),
        new JuegoAnagrama("alondra", new String[] {"ladrona"}),
        new JuegoAnagrama("enrique", new String[] {"quieren"}),
        new JuegoAnagrama("espana", new String[] {"apanes"})
    };

    private int indiceJuego = 0;

    public int g1_contarVocalesConFor(String frase) {
        return g1_contarVocales(frase, TipoBucle.FOR);
    }

    public int g1_contarVocalesConWhile(String frase) {
        return g1_contarVocales(frase, TipoBucle.WHILE);
    }

    public int g1_contarVocalesConDoWhile(String frase) {
        return g1_contarVocales(frase, TipoBucle.DO_WHILE);
    }

    public int g1_contarConsonantesConFor(String frase) {
        return g1_contarConsonantes(frase, TipoBucle.FOR);
    }

    public int g1_contarConsonantesConWhile(String frase) {
        return g1_contarConsonantes(frase, TipoBucle.WHILE);
    }

    public int g1_contarConsonantesConDoWhile(String frase) {
        return g1_contarConsonantes(frase, TipoBucle.DO_WHILE);
    }

    public String g1_eliminarVocalConFor(String frase, char vocal) {
        return g1_eliminarVocal(frase, vocal, TipoBucle.FOR);
    }

    public String g1_eliminarVocalConWhile(String frase, char vocal) {
        return g1_eliminarVocal(frase, vocal, TipoBucle.WHILE);
    }

    public String g1_eliminarVocalConDoWhile(String frase, char vocal) {
        return g1_eliminarVocal(frase, vocal, TipoBucle.DO_WHILE);
    }

    public String g1_eliminarLetraConFor(String frase, char letra) {
        return g1_eliminarLetra(frase, letra, TipoBucle.FOR);
    }

    public String g1_eliminarLetraConWhile(String frase, char letra) {
        return g1_eliminarLetra(frase, letra, TipoBucle.WHILE);
    }

    public String g1_eliminarLetraConDoWhile(String frase, char letra) {
        return g1_eliminarLetra(frase, letra, TipoBucle.DO_WHILE);
    }

    public String g1_invertirVocalesMayusConFor(String frase) {
        return g1_invertirYTransformar(frase, true, TipoBucle.FOR);
    }

    public String g1_invertirVocalesMayusConWhile(String frase) {
        return g1_invertirYTransformar(frase, true, TipoBucle.WHILE);
    }

    public String g1_invertirVocalesMayusConDoWhile(String frase) {
        return g1_invertirYTransformar(frase, true, TipoBucle.DO_WHILE);
    }

    public String g1_invertirConsonantesMayusConFor(String frase) {
        return g1_invertirYTransformar(frase, false, TipoBucle.FOR);
    }

    public String g1_invertirConsonantesMayusConWhile(String frase) {
        return g1_invertirYTransformar(frase, false, TipoBucle.WHILE);
    }

    public String g1_invertirConsonantesMayusConDoWhile(String frase) {
        return g1_invertirYTransformar(frase, false, TipoBucle.DO_WHILE);
    }

    public String g1_mayusculasSinJConFor(String frase) {
        return g1_mayusculasSinJ(frase, TipoBucle.FOR);
    }

    public String g1_mayusculasSinJConWhile(String frase) {
        return g1_mayusculasSinJ(frase, TipoBucle.WHILE);
    }

    public String g1_mayusculasSinJConDoWhile(String frase) {
        return g1_mayusculasSinJ(frase, TipoBucle.DO_WHILE);
    }

    public JuegoAnagrama g1_obtenerJuegoAnagrama() {
        JuegoAnagrama juego = JUEGOS_ANAGRAMA[indiceJuego].copiar();
        indiceJuego = (indiceJuego + 1) % JUEGOS_ANAGRAMA.length;
        return juego;
    }

    public boolean g1_esAnagramaConFor(String base, String intento) {
        return g1_esAnagrama(base, intento, TipoBucle.FOR);
    }

    public boolean g1_esAnagramaConWhile(String base, String intento) {
        return g1_esAnagrama(base, intento, TipoBucle.WHILE);
    }

    public boolean g1_esAnagramaConDoWhile(String base, String intento) {
        return g1_esAnagrama(base, intento, TipoBucle.DO_WHILE);
    }

    public String g1_resolverAnagramaConFor(JuegoAnagrama juego, String[] intentos) {
        return g1_resolverAnagrama(juego, intentos, TipoBucle.FOR);
    }

    public String g1_resolverAnagramaConWhile(JuegoAnagrama juego, String[] intentos) {
        return g1_resolverAnagrama(juego, intentos, TipoBucle.WHILE);
    }

    public String g1_resolverAnagramaConDoWhile(JuegoAnagrama juego, String[] intentos) {
        return g1_resolverAnagrama(juego, intentos, TipoBucle.DO_WHILE);
    }

    public String g1_alternarMayusMinusConFor(String frase) {
        return g1_alternarMayusMinus(frase, TipoBucle.FOR);
    }

    public String g1_alternarMayusMinusConWhile(String frase) {
        return g1_alternarMayusMinus(frase, TipoBucle.WHILE);
    }

    public String g1_alternarMayusMinusConDoWhile(String frase) {
        return g1_alternarMayusMinus(frase, TipoBucle.DO_WHILE);
    }

    private int g1_contarVocales(String frase, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        int contador = 0;
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = texto.charAt(indice);
                    if (esVocal(caracter)) {
                        contador++;
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = texto.charAt(indiceWhile);
                    if (esVocal(caracter)) {
                        contador++;
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return 0;
                }
                int indiceDo = 0;
                do {
                    char caracter = texto.charAt(indiceDo);
                    if (esVocal(caracter)) {
                        contador++;
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return contador;
    }

    private int g1_contarConsonantes(String frase, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        int contador = 0;
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = texto.charAt(indice);
                    if (esConsonante(caracter)) {
                        contador++;
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = texto.charAt(indiceWhile);
                    if (esConsonante(caracter)) {
                        contador++;
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return 0;
                }
                int indiceDo = 0;
                do {
                    char caracter = texto.charAt(indiceDo);
                    if (esConsonante(caracter)) {
                        contador++;
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return contador;
    }

    private String g1_eliminarVocal(String frase, char vocal, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        char objetivo = Character.toLowerCase(vocal);
        StringBuilder resultado = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = texto.charAt(indice);
                    if (Character.toLowerCase(caracter) == objetivo && esVocal(caracter)) {
                        resultado.append(' ');
                    } else {
                        resultado.append(caracter);
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = texto.charAt(indiceWhile);
                    if (Character.toLowerCase(caracter) == objetivo && esVocal(caracter)) {
                        resultado.append(' ');
                    } else {
                        resultado.append(caracter);
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return "";
                }
                int indiceDo = 0;
                do {
                    char caracter = texto.charAt(indiceDo);
                    if (Character.toLowerCase(caracter) == objetivo && esVocal(caracter)) {
                        resultado.append(' ');
                    } else {
                        resultado.append(caracter);
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return resultado.toString();
    }

    private String g1_eliminarLetra(String frase, char letra, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        char objetivo = Character.toLowerCase(letra);
        StringBuilder resultado = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = texto.charAt(indice);
                    if (Character.toLowerCase(caracter) != objetivo) {
                        resultado.append(caracter);
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = texto.charAt(indiceWhile);
                    if (Character.toLowerCase(caracter) != objetivo) {
                        resultado.append(caracter);
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return "";
                }
                int indiceDo = 0;
                do {
                    char caracter = texto.charAt(indiceDo);
                    if (Character.toLowerCase(caracter) != objetivo) {
                        resultado.append(caracter);
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return resultado.toString();
    }

    private String g1_invertirYTransformar(String frase, boolean vocalesEnMayuscula, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        StringBuilder resultado = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int indice = texto.length() - 1; indice >= 0; indice--) {
                    char caracter = texto.charAt(indice);
                    resultado.append(transformarCaracter(caracter, vocalesEnMayuscula));
                }
                break;
            case WHILE:
                int indiceWhile = texto.length() - 1;
                while (indiceWhile >= 0) {
                    char caracter = texto.charAt(indiceWhile);
                    resultado.append(transformarCaracter(caracter, vocalesEnMayuscula));
                    indiceWhile--;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return "";
                }
                int indiceDo = texto.length() - 1;
                do {
                    char caracter = texto.charAt(indiceDo);
                    resultado.append(transformarCaracter(caracter, vocalesEnMayuscula));
                    indiceDo--;
                } while (indiceDo >= 0);
                break;
        }
        return resultado.toString();
    }

    private String g1_mayusculasSinJ(String frase, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        StringBuilder resultado = new StringBuilder();
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = Character.toUpperCase(texto.charAt(indice));
                    if (caracter != 'J') {
                        resultado.append(caracter);
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = Character.toUpperCase(texto.charAt(indiceWhile));
                    if (caracter != 'J') {
                        resultado.append(caracter);
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return "";
                }
                int indiceDo = 0;
                do {
                    char caracter = Character.toUpperCase(texto.charAt(indiceDo));
                    if (caracter != 'J') {
                        resultado.append(caracter);
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return resultado.toString();
    }

    private boolean g1_esAnagrama(String base, String intento, TipoBucle tipo) {
        char[] baseNormalizada = normalizarAnagrama(base);
        char[] intentoNormalizado = normalizarAnagrama(intento);
        if (baseNormalizada.length != intentoNormalizado.length) {
            return false;
        }
        int[] conteo = new int[Character.MAX_VALUE + 1];
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < baseNormalizada.length; indice++) {
                    conteo[baseNormalizada[indice]]++;
                    conteo[intentoNormalizado[indice]]--;
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < baseNormalizada.length) {
                    conteo[baseNormalizada[indiceWhile]]++;
                    conteo[intentoNormalizado[indiceWhile]]--;
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (baseNormalizada.length == 0) {
                    return true;
                }
                int indiceDo = 0;
                do {
                    conteo[baseNormalizada[indiceDo]]++;
                    conteo[intentoNormalizado[indiceDo]]--;
                    indiceDo++;
                } while (indiceDo < baseNormalizada.length);
                break;
        }
        for (int indice = 0; indice < conteo.length; indice++) {
            if (conteo[indice] != 0) {
                return false;
            }
        }
        return true;
    }

    private String g1_resolverAnagrama(JuegoAnagrama juego, String[] intentos, TipoBucle tipo) {
        if (intentos == null || intentos.length == 0) {
            return "No se ingresaron intentos. Una posible respuesta: " + juego.obtenerSugerencia();
        }
        boolean acierto = false;
        int intentoExitoso = -1;
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < intentos.length; indice++) {
                    String intento = intentos[indice];
                    if (intento == null) {
                        break;
                    }
                    if (g1_esAnagramaConFor(juego.getPalabraBase(), intento)) {
                        acierto = true;
                        intentoExitoso = indice;
                        break;
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < intentos.length) {
                    String intento = intentos[indiceWhile];
                    if (intento == null) {
                        break;
                    }
                    if (g1_esAnagramaConWhile(juego.getPalabraBase(), intento)) {
                        acierto = true;
                        intentoExitoso = indiceWhile;
                        break;
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                int indiceDo = 0;
                if (intentos.length > 0) {
                    do {
                        String intento = intentos[indiceDo];
                        if (intento == null) {
                            break;
                        }
                        if (g1_esAnagramaConDoWhile(juego.getPalabraBase(), intento)) {
                            acierto = true;
                            intentoExitoso = indiceDo;
                            break;
                        }
                        indiceDo++;
                    } while (indiceDo < intentos.length);
                }
                break;
        }
        if (acierto && intentoExitoso >= 0) {
            return "Correcto en el intento " + (intentoExitoso + 1) + ": " + intentos[intentoExitoso];
        }
        return "Intentos agotados. Una posible respuesta: " + juego.obtenerSugerencia();
    }

    private String g1_alternarMayusMinus(String frase, TipoBucle tipo) {
        String texto = frase == null ? "" : frase;
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;
        switch (tipo) {
            case FOR:
                for (int indice = 0; indice < texto.length(); indice++) {
                    char caracter = texto.charAt(indice);
                    if (Character.isLetter(caracter)) {
                        resultado.append(mayuscula ? Character.toUpperCase(caracter) : Character.toLowerCase(caracter));
                        mayuscula = !mayuscula;
                    } else {
                        resultado.append(caracter);
                    }
                }
                break;
            case WHILE:
                int indiceWhile = 0;
                while (indiceWhile < texto.length()) {
                    char caracter = texto.charAt(indiceWhile);
                    if (Character.isLetter(caracter)) {
                        resultado.append(mayuscula ? Character.toUpperCase(caracter) : Character.toLowerCase(caracter));
                        mayuscula = !mayuscula;
                    } else {
                        resultado.append(caracter);
                    }
                    indiceWhile++;
                }
                break;
            case DO_WHILE:
                if (texto.length() == 0) {
                    return "";
                }
                int indiceDo = 0;
                do {
                    char caracter = texto.charAt(indiceDo);
                    if (Character.isLetter(caracter)) {
                        resultado.append(mayuscula ? Character.toUpperCase(caracter) : Character.toLowerCase(caracter));
                        mayuscula = !mayuscula;
                    } else {
                        resultado.append(caracter);
                    }
                    indiceDo++;
                } while (indiceDo < texto.length());
                break;
        }
        return resultado.toString();
    }

    private char transformarCaracter(char caracter, boolean vocalesEnMayuscula) {
        if (Character.isLetter(caracter)) {
            if (vocalesEnMayuscula) {
                if (esVocal(caracter)) {
                    return Character.toUpperCase(caracter);
                }
                return Character.toLowerCase(caracter);
            }
            if (esConsonante(caracter)) {
                return Character.toUpperCase(caracter);
            }
            return Character.toLowerCase(caracter);
        }
        return caracter;
    }

    private boolean esVocal(char caracter) {
        char minuscula = Character.toLowerCase(caracter);
        return VOCALES.indexOf(minuscula) >= 0;
    }

    private boolean esConsonante(char caracter) {
        return Character.isLetter(caracter) && !esVocal(caracter);
    }

    private char[] normalizarAnagrama(String texto) {
        if (texto == null) {
            return new char[0];
        }
        StringBuilder limpiado = new StringBuilder();
        for (int indice = 0; indice < texto.length(); indice++) {
            char caracter = texto.charAt(indice);
            if (Character.isLetter(caracter)) {
                limpiado.append(Character.toLowerCase(caracter));
            }
        }
        char[] resultado = new char[limpiado.length()];
        for (int indice = 0; indice < limpiado.length(); indice++) {
            resultado[indice] = limpiado.charAt(indice);
        }
        return resultado;
    }

    public static class JuegoAnagrama {
        private final String palabraBase;
        private final String[] soluciones;

        public JuegoAnagrama(String palabraBase, String[] soluciones) {
            this.palabraBase = palabraBase;
            this.soluciones = soluciones == null ? new String[0] : Arrays.copyOf(soluciones, soluciones.length);
        }

        public String getPalabraBase() {
            return palabraBase;
        }

        public String[] getSoluciones() {
            return Arrays.copyOf(soluciones, soluciones.length);
        }

        public String obtenerSugerencia() {
            return soluciones.length == 0 ? palabraBase : soluciones[0];
        }

        public JuegoAnagrama copiar() {
            return new JuegoAnagrama(palabraBase, soluciones);
        }
    }
}
