package Grafos;

import java.util.Map;

public class nBA07 {
    private static final int S0000 = 0;  // nada visto
    private static final int SU000 = 1;  // U
    private static final int SL000 = 2;  // L
    private static final int SUL00 = 3;  // U L
    private static final int SD000 = 4;  // D
    private static final int SUD00 = 5;  // U D
    private static final int SLD00 = 6;  // L D
    private static final int SULD0 = 7;  // U L D
    private static final int SS000 = 8;  // S
    private static final int SUS00 = 9;  // U S
    private static final int SLS00 = 10; // L S
    private static final int SULS0 = 11; // U L S
    private static final int SDS00 = 12; // D S
    private static final int SUDS0 = 13; // U D S
    private static final int SLDS0 = 14; // L D S
    private static final int SULDS = 15; // U L D S  (ACEPTA)
    private static final int TRAP  = 16;

    // ===== Alfabeto (columnas) =====
    // U: Upper, L: Lower, D: Digit, S: Character Special (no letra/no dígito/no whitespace), X: inválido (whitespace/ctrl)
    private static final Map<Character, Integer> ALFABETO = Map.of(
        'U', 0,
        'L', 1,
        'D', 2,
        'S', 3,
        'X', 4
    );

    // ===== Matriz de transiciones =====
    //          U       L       D       S       X
    private static final int[][] MatrizTransiciones = {
    /*S0000*/ { SU000, SL000, SD000, SS000, TRAP },
    /*SU000*/ { SU000, SUL00, SUD00, SUS00, TRAP },
    /*SL000*/ { SUL00, SL000, SLD00, SLS00, TRAP },
    /*SUL00*/ { SUL00, SUL00, SULD0, SULS0, TRAP },
    /*SD000*/ { SUD00, SLD00, SD000, SDS00, TRAP },
    /*SUD00*/ { SUD00, SULD0, SUD00, SUDS0, TRAP },
    /*SLD00*/ { SULD0, SLD00, SLD00, SLDS0, TRAP },
    /*SULD0*/ { SULD0, SULD0, SULD0, SULDS, TRAP },
    /*SS000*/ { SUS00, SLS00, SDS00, SS000, TRAP },
    /*SUS00*/ { SUS00, SULS0, SUDS0, SUS00, TRAP },
    /*SLS00*/ { SULS0, SLS00, SLDS0, SLS00, TRAP },
    /*SULS0*/ { SULS0, SULS0, SULDS, SULS0, TRAP },
    /*SDS00*/ { SUDS0, SLDS0, SDS00, SDS00, TRAP },
    /*SUDS0*/ { SUDS0, SULDS, SUDS0, SUDS0, TRAP },
    /*SLDS0*/ { SULDS, SLDS0, SLDS0, SLDS0, TRAP },
    /*SULDS*/ { SULDS, SULDS, SULDS, SULDS, TRAP },
    /*TRAP */ { TRAP,  TRAP,  TRAP,  TRAP,  TRAP }
    };

    private static final boolean[] ACEPTA = new boolean[17];
    static {
        ACEPTA[SULDS] = true;
    }

    private nBA07() {}

    private static Integer clasificar(char ch) {
        if (Character.isUpperCase(ch)) return ALFABETO.get('U');
        if (Character.isLowerCase(ch)) return ALFABETO.get('L');
        if (Character.isDigit(ch))     return ALFABETO.get('D');
        if (!Character.isWhitespace(ch) && !Character.isISOControl(ch)) return ALFABETO.get('S');
        return ALFABETO.get('X'); // whitespace u otros no permitidos
    }

    public static boolean validarClave(String s, int minLen, int maxLen) {
        if (s == null) return false;
        int len = s.length();
        if (len < minLen || len > maxLen) return false;

        int q = S0000;
        for (int i = 0; i < len; i++) {
            Integer col = clasificar(s.charAt(i));
            if (col == null) return false;
            q = MatrizTransiciones[q][col];
            if (q == TRAP) return false; // rechazo temprano
        }
        return ACEPTA[q];
    }
    public static void main(String[] args) {
        String[] ok = { "Bebesita23$", "ClaveSegura2025@", "Heloxd3KJ&", "Ala34%hj" };
        String[] no = { "", "aaaa", "AAAA", "1111", "!!!!", "Aa!!", "aa1!", "AA1!", "Aa11", "Aa 1 " };

        System.out.println("=== ACEPTA ===");
        for (String s : ok)  System.out.printf("%-16s -> %s%n", '"' + s + '"', validarClave(s, 8, 64));

        System.out.println("\n=== RECHAZA ===");
        for (String s : no)  System.out.printf("%-16s -> %s%n", '"' + s + '"', validarClave(s, 4, 64));
    }
}


