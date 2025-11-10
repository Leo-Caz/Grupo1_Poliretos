package CadenasCaracteres.C06;

public class GeneradorC06 {

    public String g1_invertirConLetrasMayusculasFor(String frase) {
        StringBuilder invertida = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida.append(Character.toUpperCase(frase.charAt(i)));
        }
        return invertida.toString();
    }

    public String g1_invertirConLetrasMayusculasWhile(String frase) {
        StringBuilder invertida = new StringBuilder();
        int i = frase.length() - 1;
        while (i >= 0) {
            invertida.append(Character.toUpperCase(frase.charAt(i)));
            i--;
        }
        return invertida.toString();
    }

    public String g1_invertirConLetrasMayusculasDoWhile(String frase) {
        StringBuilder invertida = new StringBuilder();
        int i = frase.length() - 1;
        if (frase.length() > 0) {
            do {
                invertida.append(Character.toUpperCase(frase.charAt(i)));
                i--;
            } while (i >= 0);
        }
        return invertida.toString();
    }
}
