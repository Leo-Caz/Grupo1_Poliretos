package Grafos;

import java.util.Map;
import java.util.Set;

public class nBA05 {
    private static final int Q0 = 0;
    private static final int Q1 = 1;
    private static final int Q2 = 2;
    private static final int Q3 = 3;
    private static final int Q4 = 4;
    private static final int Q5 = 5; 

    private static final Set<Character> IGNORAR = Set.of(
        ' ', ',', '*', '(', ')', '.', '+', '-', '/'
    );

    private static int identifier(char ch){
        if (Character.isLetter(ch) && ch != 'ñ') return alfabeto.get('l');
        if (Character.isDigit(ch)) return alfabeto.get('n');
        if (ch == '_'|| ch == '$') return alfabeto.get('_');
        if (ch == '=') return alfabeto.get('=');
        if (ch == ';') return alfabeto.get(';');
        return -1;
    }

    private static final Map<Character, Integer> alfabeto = new java.util.HashMap<>(); static {
        alfabeto.put('l', 0); // letra
        alfabeto.put('n', 1); // dígito    
        alfabeto.put('_', 2); // signos
        alfabeto.put(';', 3); // punto y coma
        alfabeto.put('=', 4); // igual
    }
    
    private static final int[][] MatrizTransiciones = {
    //    0    1    2    3     4
        { Q1,  Q5,  Q5,  Q5,  Q5}, 
        { Q1,  Q1,  Q1,  Q4,  Q2},
        { Q5,  Q3,  Q5,  Q5,  Q5},
        { Q5,  Q3,  Q5,  Q4,  Q5},
        { Q5,  Q5,  Q5,  Q5,  Q5}, 
        { Q5,  Q5,  Q5,  Q5,  Q5},
    };
    private static final boolean[] aceptacion = {
        false, false, true, false, true, false
    };
    private nBA05() {}
    /**
     * Verifica si s pertenece al patrón literal con tu alfabeto {a,b,c,*,+}.
     */
    public static boolean acepta(String s) {
        if (s == null || s.isEmpty()) return false;
        int q = Q0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (IGNORAR.contains(ch)) continue;
            Integer col = identifier(ch);
            if (col < 0) return false;           // símbolo fuera del alfabeto
            q = MatrizTransiciones[q][col];
            if (q == Q5) return false;               // rechazo temprano
        }
        return aceptacion[q];
    }
    public static void main(String[] args) {
    String[] acepta = { "edad1=5;", "  edad1 = 5+67 ; ", "edad1,=5;", "edad1*(=5;)",
            "x=9;", "a1=0;"};

    String[] rechaza = {
       "", "1edad=5;", "edad;", "edad=;", "edad=5", "edad=5a;"
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