package CadenasCaracteres.C05;

public class GeneradorC05 {

    public String g1_invertirConVocalesMayusculasFor(String frase) {
        StringBuilder invertida = new StringBuilder();
        String vocales = "aeiouáéíóú";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                invertida.append(Character.toUpperCase(c));
            } else {
                invertida.append(c);
            }
        }
        return invertida.toString();
    }

    public String g1_invertirConVocalesMayusculasWhile(String frase) {
        StringBuilder invertida = new StringBuilder();
        String vocales = "aeiouáéíóú";
        int i = frase.length() - 1;
        while (i >= 0) {
            char c = frase.charAt(i);
            if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                invertida.append(Character.toUpperCase(c));
            } else {
                invertida.append(c);
            }
            i--;
        }
        return invertida.toString();
    }

    public String g1_invertirConVocalesMayusculasDoWhile(String frase) {
        StringBuilder invertida = new StringBuilder();
        String vocales = "aeiouáéíóú";
        int i = frase.length() - 1;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                    invertida.append(Character.toUpperCase(c));
                } else {
                    invertida.append(c);
                }
                i--;
            } while (i >= 0);
        }
        return invertida.toString();
    }
}
