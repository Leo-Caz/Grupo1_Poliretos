package CadenasCaracteres.C09;

public class GeneradorC09 {

    public String g1_alternarMayusculasMinusculasFor(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (i % 2 == 0) resultado.append(Character.toUpperCase(c));
            else resultado.append(Character.toLowerCase(c));
        }
        return resultado.toString();
    }

    public String g1_alternarMayusculasMinusculasWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (i % 2 == 0) resultado.append(Character.toUpperCase(c));
            else resultado.append(Character.toLowerCase(c));
            i++;
        }
        return resultado.toString();
    }

    public String g1_alternarMayusculasMinusculasDoWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (i % 2 == 0) resultado.append(Character.toUpperCase(c));
                else resultado.append(Character.toLowerCase(c));
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }
}
