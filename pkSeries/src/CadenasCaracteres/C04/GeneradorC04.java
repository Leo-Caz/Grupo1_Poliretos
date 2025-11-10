package CadenasCaracteres.C04;

public class GeneradorC04 {

    public String g1_eliminarLetraFor(String frase, char letra) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) resultado += frase.charAt(i);
        }
        return resultado;
    }

    public String g1_eliminarLetraWhile(String frase, char letra) {
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            if (frase.charAt(i) != letra) resultado += frase.charAt(i);
            i++;
        }
        return resultado;
    }

    public String g1_eliminarLetraDoWhile(String frase, char letra) {
        String resultado = "";
        int i = 0;
        if (frase.length() > 0) {
            do {
                if (frase.charAt(i) != letra) resultado += frase.charAt(i);
                i++;
            } while (i < frase.length());
        }
        return resultado;
    }
}
