package Serie4;

import appinfo.InformacionGrupo;
import java.util.Arrays;
import java.util.Scanner;

public class ControladorSerie4 {
    private static final int MAX_INTENTOS_ANAGRAMA = 3;

    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie4 generador = new GeneradorSerie4();

    public ControladorSerie4(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 4 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        System.out.println();

        ejecutarCasoC01();
        ejecutarCasoC02();
        ejecutarCasoC03();
        ejecutarCasoC04();
        ejecutarCasoC05();
        ejecutarCasoC06();
        ejecutarCasoC07();
        ejecutarCasoC08();
        ejecutarCasoC09();
    }

    private void ejecutarCasoC01() {
        System.out.println("--- C01: Contar vocales ---");
        String frase = solicitarFrase();
        int forResultado = generador.g1_contarVocalesConFor(frase);
        int whileResultado = generador.g1_contarVocalesConWhile(frase);
        int doWhileResultado = generador.g1_contarVocalesConDoWhile(frase);
        System.out.println("C01 con for: tiene " + forResultado + " vocal(es)");
        System.out.println("C01 con while: tiene " + whileResultado + " vocal(es)");
        System.out.println("C01 con do while: tiene " + doWhileResultado + " vocal(es)");
        System.out.println();
    }

    private void ejecutarCasoC02() {
        System.out.println("--- C02: Contar consonantes ---");
        String frase = solicitarFrase();
        int forResultado = generador.g1_contarConsonantesConFor(frase);
        int whileResultado = generador.g1_contarConsonantesConWhile(frase);
        int doWhileResultado = generador.g1_contarConsonantesConDoWhile(frase);
        System.out.println("C02 con for: tiene " + forResultado + " consonante(s)");
        System.out.println("C02 con while: tiene " + whileResultado + " consonante(s)");
        System.out.println("C02 con do while: tiene " + doWhileResultado + " consonante(s)");
        System.out.println();
    }

    private void ejecutarCasoC03() {
        System.out.println("--- C03: Eliminar una vocal ---");
        String frase = solicitarFrase();
        char vocal = solicitarVocal();
        String forResultado = generador.g1_eliminarVocalConFor(frase, vocal);
        String whileResultado = generador.g1_eliminarVocalConWhile(frase, vocal);
        String doWhileResultado = generador.g1_eliminarVocalConDoWhile(frase, vocal);
        System.out.println("C03 con for: " + forResultado);
        System.out.println("C03 con while: " + whileResultado);
        System.out.println("C03 con do while: " + doWhileResultado);
        System.out.println();
    }

    private void ejecutarCasoC04() {
        System.out.println("--- C04: Eliminar una letra ---");
        String frase = solicitarFrase();
        char letra = solicitarLetra();
        String forResultado = generador.g1_eliminarLetraConFor(frase, letra);
        String whileResultado = generador.g1_eliminarLetraConWhile(frase, letra);
        String doWhileResultado = generador.g1_eliminarLetraConDoWhile(frase, letra);
        System.out.println("C04 con for: " + forResultado);
        System.out.println("C04 con while: " + whileResultado);
        System.out.println("C04 con do while: " + doWhileResultado);
        System.out.println();
    }

    private void ejecutarCasoC05() {
        System.out.println("--- C05: Invertir frase con vocales en mayusculas ---");
        String frase = solicitarFrase();
        String forResultado = generador.g1_invertirVocalesMayusConFor(frase);
        String whileResultado = generador.g1_invertirVocalesMayusConWhile(frase);
        String doWhileResultado = generador.g1_invertirVocalesMayusConDoWhile(frase);
        System.out.println("C05 con for: " + forResultado);
        System.out.println("C05 con while: " + whileResultado);
        System.out.println("C05 con do while: " + doWhileResultado);
        System.out.println();
    }

    private void ejecutarCasoC06() {
        System.out.println("--- C06: Invertir frase con consonantes en mayusculas ---");
        String frase = solicitarFrase();
        String forResultado = generador.g1_invertirConsonantesMayusConFor(frase);
        String whileResultado = generador.g1_invertirConsonantesMayusConWhile(frase);
        String doWhileResultado = generador.g1_invertirConsonantesMayusConDoWhile(frase);
        System.out.println("C06 con for: " + forResultado);
        System.out.println("C06 con while: " + whileResultado);
        System.out.println("C06 con do while: " + doWhileResultado);
        System.out.println();
    }

    private void ejecutarCasoC07() {
        System.out.println("--- C07: Mayusculas sin la letra J ---");
        String frase = solicitarFrase();
        String forResultado = generador.g1_mayusculasSinJConFor(frase);
        String whileResultado = generador.g1_mayusculasSinJConWhile(frase);
        String doWhileResultado = generador.g1_mayusculasSinJConDoWhile(frase);
        System.out.println("C07 con for: " + forResultado);
        System.out.println("C07 con while: " + whileResultado);
        System.out.println("C07 con do while: " + doWhileResultado);
        System.out.println();
    }

    private void ejecutarCasoC08() {
        System.out.println("--- C08: Juego de anagramas ---");
        GeneradorSerie4.JuegoAnagrama juego = generador.g1_obtenerJuegoAnagrama();
        System.out.println("Palabra base: " + juego.getPalabraBase());
        System.out.println("Ingrese un anagrama (tiene " + MAX_INTENTOS_ANAGRAMA + " intento(s)):");

        String[] intentos = new String[MAX_INTENTOS_ANAGRAMA];
        int usados = 0;
        while (usados < MAX_INTENTOS_ANAGRAMA) {
            System.out.print("Intento " + (usados + 1) + ": ");
            String intento = lector.nextLine().trim();
            intentos[usados] = intento;
            usados++;
            if (generador.g1_esAnagramaConFor(juego.getPalabraBase(), intento)) {
                System.out.println("Correcto! Detenemos las preguntas.");
                break;
            } else if (usados < MAX_INTENTOS_ANAGRAMA) {
                System.out.println("No coincide, intenta nuevamente.");
            }
        }
        System.out.println("C08 con for: " + generador.g1_resolverAnagramaConFor(juego, Arrays.copyOf(intentos, usados)));
        System.out.println("C08 con while: " + generador.g1_resolverAnagramaConWhile(juego, Arrays.copyOf(intentos, usados)));
        System.out.println("C08 con do while: " + generador.g1_resolverAnagramaConDoWhile(juego, Arrays.copyOf(intentos, usados)));
        System.out.println();
    }

    private void ejecutarCasoC09() {
        System.out.println("--- C09: Alternar mayusculas y minusculas ---");
        String frase = solicitarFrase();
        String forResultado = generador.g1_alternarMayusMinusConFor(frase);
        String whileResultado = generador.g1_alternarMayusMinusConWhile(frase);
        String doWhileResultado = generador.g1_alternarMayusMinusConDoWhile(frase);
        System.out.println("C09 con for: " + forResultado);
        System.out.println("C09 con while: " + whileResultado);
        System.out.println("C09 con do while: " + doWhileResultado);
        System.out.println();
    }

    private String solicitarFrase() {
        String frase;
        do {
            System.out.print("Ingrese una frase: ");
            frase = lector.nextLine();
            if (frase.trim().isEmpty()) {
                System.out.println("La frase no puede estar vacia.");
            }
        } while (frase.trim().isEmpty());
        return frase;
    }

    private char solicitarVocal() {
        char vocal;
        do {
            System.out.print("Ingrese una vocal: ");
            String entrada = lector.nextLine().trim();
            vocal = entrada.isEmpty() ? ' ' : entrada.charAt(0);
            if (!esVocal(vocal)) {
                System.out.println("Debe ingresar una vocal valida.");
            }
        } while (!esVocal(vocal));
        return vocal;
    }

    private char solicitarLetra() {
        char letra;
        do {
            System.out.print("Ingrese una letra: ");
            String entrada = lector.nextLine().trim();
            letra = entrada.isEmpty() ? ' ' : entrada.charAt(0);
            if (!Character.isLetter(letra)) {
                System.out.println("Debe ingresar una letra valida.");
            }
        } while (!Character.isLetter(letra));
        return letra;
    }

    private boolean esVocal(char caracter) {
        char minuscula = Character.toLowerCase(caracter);
        return "aeiouáéíóú".indexOf(minuscula) >= 0;
    }
}
