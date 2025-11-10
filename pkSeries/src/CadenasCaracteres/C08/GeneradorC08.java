package CadenasCaracteres.C08;

import java.util.Arrays;

public class GeneradorC08 {

    public boolean g1_sonAnagramas(String palabra1, String palabra2) {
        char[] a = palabra1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = palabra2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
