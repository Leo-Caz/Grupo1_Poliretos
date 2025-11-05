package Grafos;

import java.util.List;
import java.util.Map;

public class nBA01 {

    // ===== Estados =====
    private static final int Q0 = 0;
    private static final int Q1 = 1;
    private static final int Q2 = 2;
    private static final int Q3 = 3;
    private static final int Q4 = 4;
    private static final int Q5 = 5; // aceptación
    private static final int Q6 = 6; // estado de rechazo

    // ===== Alfabeto =====
    private static final Map<Character, Integer> alfabeto = Map.of(
        'a', 0,
        'b', 1,
        'c', 2,
        '*', 3,
        '+', 4
    );
    //    a    b    c    *    +
    private static final int[][] MatrizTransiciones = {
        { Q1,  Q0,  Q0,  Q0,  Q0 }, 
        { Q1,  Q0,  Q0,  Q2,  Q0 },
        { Q1,  Q3,  Q0,  Q0,  Q0 },
        { Q1,  Q0,  Q0,  Q0,  Q4 },
        { Q1,  Q0,  Q5,  Q0,  Q0 },
        { Q6,  Q6,  Q6,  Q6,  Q6 }, // aceptación
        { Q6,  Q6,  Q6,  Q6,  Q6 }  // rechazo
    };
    // ===== Vector de aceptación =====
    private static final boolean[] aceptacion = {
        false, false, false, false, false, true
    };
    private nBA01() {}
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
            if (q == Q6) return false;          
        }
        return aceptacion[q];
    }
    public static void main(String[] args) {
        List<String> ok = List.of(
            "a*b+c", "aba*b+c", "a*b+a*b+c", "aaaa*bbbba*b+a*b+c"
        );
        List<String> no = List.of("", "a", "b", "c", "ab+c", "a*+c", "a*b", "a*b+",
            "a*b+cc", "a*b+c+a*b+c", "a**b+c", "x", "a*b+c x"
        );

        System.out.println("=== ACEPTA ===");
        ok.forEach(s -> System.out.printf("%-12s -> %s%n", s, acepta(s)));

        System.out.println("\n=== RECHAZA ===");
        no.forEach(s -> System.out.printf("%-12s -> %s%n", s, acepta(s)));
    }
}


