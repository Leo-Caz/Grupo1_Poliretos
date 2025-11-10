package CadenasCaracteres.C01;

public class GeneradorC01 {

    // === C01: CONTAR VOCALES ===

    public int g1_contarVocalesFor(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (vocales.indexOf(c) != -1) contador++;
        }
        return contador;
    }

    public int g1_contarVocalesWhile(String frase) {
        int contador = 0, i = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        while (i < frase.length()) {
            if (vocales.indexOf(frase.charAt(i)) != -1) contador++;
            i++;
        }
        return contador;
    }

    public int g1_contarVocalesDoWhile(String frase) {
        int contador = 0, i = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        if (frase.length() > 0) {
            do {
                if (vocales.indexOf(frase.charAt(i)) != -1) contador++;
                i++;
            } while (i < frase.length());
        }
        return contador;
    }
}
