package Grafos;

import java.util.Map;

public class nBA03 {
    private static final int Q0 = 0;
    private static final int Q1 = 1;
    private static final int Q2 = 2;
    private static final int Q3 = 3;
    private static final int Q4 = 4;

    private static final Map<Character, Integer> alfabeto = Map.of(
        'a', 0,
        'b', 1,
        'c', 2
    );
    //    a    b    c
    private static final int[][] MatrizTransiciones = {
        { Q1,  Q2,  Q3 },
        { Q1,  Q4,  Q4 },
        { Q4,  Q2,  Q4 },
        { Q4,  Q4,  Q3 },
        { Q4,  Q4,  Q4 } 
    };
    private static final boolean[] aceptacion = {
        false, true, true, true, false
    };
    private nBA03() {}
    /**
     * Verifica si s pertenece al patrón literal con tu alfabeto {a,b,c,*,+}.
     */
    public static boolean acepta(String s) {
        if (s == null || s.isEmpty()) return false;

        int q = Q0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer col = alfabeto.get(ch);
            if (col == null) return false;           // símbolo fuera del alfabeto
            q = MatrizTransiciones[q][col];
            if (q == Q4) return false;               // rechazo temprano
        }
        return aceptacion[q];
    }
    public static void main(String[] args) {
    String[] acepta = {
        "a", "aa", "aaaa",
        "b", "bbb", "bbbbbb",
        "c", "cc", "ccccc"
    };

    String[] rechaza = {
        "",        // vacía (no es +)
        "ab", "ba",
        "ac", "ca",
        "bc", "cb",
        "aab", "bba", "cca",
        "abc", "bca", "cab"
    };

    System.out.println("=== ACEPTA (esperado: true) ===");
    for (String s : acepta) {
        System.out.printf("%-8s -> %s%n", s, acepta(s));
    }

    System.out.println("\n=== RECHAZA (esperado: false) ===");
    for (String s : rechaza) {
        System.out.printf("%-8s -> %s%n", s, acepta(s));
    }
}
}
