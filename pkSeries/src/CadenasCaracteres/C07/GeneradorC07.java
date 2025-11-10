package CadenasCaracteres.C07;

public class GeneradorC07 {

    public String g1_mayusculasSinJFor(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) == 'j') resultado.append(c);
            else resultado.append(Character.toUpperCase(c));
        }
        return resultado.toString();
    }

    public String g1_mayusculasSinJWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) == 'j') resultado.append(c);
            else resultado.append(Character.toUpperCase(c));
            i++;
        }
        return resultado.toString();
    }

    public String g1_mayusculasSinJDoWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.toLowerCase(c) == 'j') resultado.append(c);
                else resultado.append(Character.toUpperCase(c));
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }
}
