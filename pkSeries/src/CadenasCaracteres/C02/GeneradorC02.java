package CadenasCaracteres.C02;

public class GeneradorC02 {

    public int g1_contarLetrasFor(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') contador++;
        }
        return contador;
    }

    public int g1_contarLetrasWhile(String frase) {
        int contador = 0, i = 0;
        while (i < frase.length()) {
            if (frase.charAt(i) != ' ') contador++;
            i++;
        }
        return contador;
    }

    public int g1_contarLetrasDoWhile(String frase) {
        int contador = 0, i = 0;
        if (frase.length() > 0) {
            do {
                if (frase.charAt(i) != ' ') contador++;
                i++;
            } while (i < frase.length());
        }
        return contador;
    }
}
