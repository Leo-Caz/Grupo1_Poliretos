package CadenasCaracteres.C03;

public class GeneradorC03 {

    public String g1_eliminarVocalesFor(String frase) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (vocales.indexOf(c) == -1) resultado += c;
        }
        return resultado;
    }

    public String g1_eliminarVocalesWhile(String frase) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            if (vocales.indexOf(frase.charAt(i)) == -1) resultado += frase.charAt(i);
            i++;
        }
        return resultado;
    }

    public String g1_eliminarVocalesDoWhile(String frase) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        String resultado = "";
        int i = 0;
        if (frase.length() > 0) {
            do {
                if (vocales.indexOf(frase.charAt(i)) == -1) resultado += frase.charAt(i);
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}
