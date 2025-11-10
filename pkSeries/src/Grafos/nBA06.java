package Grafos;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class nBA06 {
/**
 * A06) Valida cadenas del lenguaje L = {for, if, else, ifelse, foreach}
 * Reglas:
 *  - for/if/foreach: aceptan con o sin sufijo `WS* '(' WS*`.
 *  - else/ifelse: aceptan solo la palabra (WS* alrededor permitido).
 *  - WS = { espacio, tab, \n, \r }
 *
 * Ejemplos válidos: "for(", "for (", "  foreach (   ", "if", "else", "ifelse"
 */
    private static final Set<String> KW_PAREN = Set.of("for", "if", "foreach"); // admiten '('
    private static final Set<String> KW_SOLO  = Set.of("else", "ifelse");       // solo WS al final

    private static final int Q0 = 0;   
    private static final int QP = 1;   
    private static final int QT = 2;  

    private static final Map<Character, Integer> ALFABETO = Map.of(
        'W', 0,
        '(', 1,
        'X', 2
    );

    //      W     (     X
    private static final int[][] MatrizTransiciones = {
    /*Q0*/ { Q0,   QP,   QT },
    /*QP*/ { QP,   QT,   QT },
    /*QT*/ { QT,   QT,   QT }
    };

    private static final boolean[] ACEPTA_PAREN = { false, true,  false }; // Q0,QP,QT
    private static final boolean[] ACEPTA_SOLO  = { true,  false, false };

    private nBA06() {}
    public static boolean acepta(String s) {
        if (s == null) return false;
        final String str = s.toLowerCase(Locale.ROOT);

        int i = 0, n = str.length();

        while (i < n && isWS(str.charAt(i))) i++;

        final int start = i;
        while (i < n && isLetterAZ(str.charAt(i))) i++;
        if (i == start) return false; // no hubo letras => no hay keyword

        final String kw = str.substring(start, i);

        final boolean necesitaParen;
        if (KW_PAREN.contains(kw)) {
            necesitaParen = true;
        } else if (KW_SOLO.contains(kw)) {
            necesitaParen = false;
        } else {
            return false; // no pertenece al lenguaje
        }

        while (i < n && isWS(str.charAt(i))) i++;

        int q = Q0;
        for (; i < n; i++) {
            final char ch = str.charAt(i);
            final Integer col = colOf(ch);     
            if (col == null) return false;     
            q = MatrizTransiciones[q][col];
            if (q == QT) return false;         // rechazo temprano
        }
        return necesitaParen ? ACEPTA_PAREN[q] : ACEPTA_SOLO[q];
    }

    private static Integer colOf(char ch) {
        if (isWS(ch))  return ALFABETO.get('W');
        if (ch == '(') return ALFABETO.get('(');
        return ALFABETO.get('X'); 
    }
    private static boolean isLetterAZ(char ch) {
        return ch >= 'a' && ch <= 'z'; // enunciado: l = {a..z}
    }
    private static boolean isWS(char ch) {
        return ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r';
    }

    public static void main(String[] args) {
        final String[] ok = {
            "for(", "for (", "   for (   ",
            "if(", "if (",
            "foreach(", "foreach   (   ",
            "else", "  else   ",
            "ifelse", " ifelse   "
        };
        final String[] no = {
            "", "fo", "for", "for )", "for x", "else(", "ifelse(", "foreach", "if", "foreach )", "for( x"
        };
        System.out.println("=== ACEPTA ===");
        for (String s : ok) {
            System.out.printf("%-18s -> %s%n", '"' + s + '"', acepta(s));
        }
        System.out.println("\n=== RECHAZA ===");
        for (String s : no) {
            System.out.printf("%-18s -> %s%n", '"' + s + '"', acepta(s));
        }
    }
}

