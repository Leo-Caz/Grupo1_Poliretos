package Grafos;

import java.util.Map;

public class nBA04 {
    private static final int Q0 = 0;
    private static final int Q1 = 1;
    private static final int Q2 = 2;
    private static final int Q3 = 3;

    private static final Map<Character, Integer> alfabeto = new java.util.HashMap<>(); static {
        alfabeto.put('0', 0);
        alfabeto.put('1', 1);
        alfabeto.put('2', 2);
        alfabeto.put('3', 3);
        alfabeto.put('4', 4);
        alfabeto.put('5', 5);
        alfabeto.put('6', 6);
        alfabeto.put('7', 7);
        alfabeto.put('8', 8);
        alfabeto.put('9', 9);
        alfabeto.put('.', 10);
    }
    //     0    1    2    3    4    5    6    7    8    9    .
    private static final int[][] MatrizTransiciones = {
        { Q0,  Q0,  Q0,  Q0,  Q0,  Q0,  Q0,  Q0,  Q0,  Q0, Q1 }, 
        { Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2, Q3 },
        { Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2,  Q2, Q3 },
        { Q3,  Q3,  Q3,  Q3,  Q3,  Q3,  Q3,  Q3,  Q3,  Q3, Q3 }
    };
    private static final boolean[] aceptacion = {
        false, false, true, false
    };
     private nBA04() {}
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
            if (q == Q3) return false;               // rechazo temprano
        }
        return aceptacion[q];
    }
    public static void main(String[] args) {
    String[] acepta = { "0.0", "2.5", "10.000", "000.123", ".5", "9.9", "1234567890.1"};

    String[] rechaza = {
       "", ".", "2", "2.", "..", "1..2", "a", "1.2.3", " 2.5", "2.5 "
    };

    System.out.println("=== ACEPTA ===");
    for (String s : acepta) {
        System.out.printf("%-8s -> %s%n", s, acepta(s));
    }

    System.out.println("\n=== RECHAZA ===");
    for (String s : rechaza) {
        System.out.printf("%-8s -> %s%n", s, acepta(s));
    }
}
}
