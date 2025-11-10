package Grafos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

interface Validador {
    String id();               
    String descripcion();        
    boolean acepta(String input);
}

final class ValidadorBasico implements Validador {
    private final String id;
    private final String desc;
    private final java.util.function.Function<String, Boolean> fn;

    ValidadorBasico(String id, String desc, java.util.function.Function<String, Boolean> fn) {
        this.id = id;
        this.desc = desc;
        this.fn = fn;
    }
    @Override public String id() { return id; }
    @Override public String descripcion() { return desc; }
    @Override public boolean acepta(String input) { return fn.apply(input); }
}

public final class ControladorDFAs {

    private static final Map<Integer, Validador> REGISTRO = new LinkedHashMap<>();
    static {
        REGISTRO.put(1, new ValidadorBasico(
                "A01",
                "Declaración simple: validar a*b+c",
                Grafos.nBA01::acepta 
        ));

        REGISTRO.put(2, new ValidadorBasico(
                "A02",
                "Declaración simple: validar ab+ca",
                Grafos.nBA02::acepta 
        ));

        REGISTRO.put(3, new ValidadorBasico(
                "A03",
                "Declaración simple: validar a+/b+/c+",
                Grafos.nBA03::acepta 
        ));

        
        REGISTRO.put(4, new ValidadorBasico(
                "A04",
                "Declaración simple: Numeros decimales",
                Grafos.nBA04::acepta 
        ));
    
    
        REGISTRO.put(5, new ValidadorBasico(
                "A05",
                "Declaración simple: identificador = entero ;  (ignora espacios/comas/operadores básicos)",
                Grafos.nBA05::acepta 
        ));

        REGISTRO.put(6, new ValidadorBasico(
                "A06",
                "Palabras reservadas {for, if, else, ifelse, foreach} + sufijo opcional WS* '(' para for/if/foreach",
                Grafos.nBA06::acepta 
        ));

        REGISTRO.put(7, new ValidadorBasico(
                "A07",
                "Password: ≥1 mayúscula, ≥1 minúscula, ≥1 dígito, ≥1 especial; sin espacios; longitud [4..20]",
                s -> Grafos.nBA07.validarClave(s, 4, 20) // adaptador con long. mínima
        ));
    }

    private ControladorDFAs() {}

public static void run(Scanner sc) {
    banner();
    while (true) {
        mostrarMenu();
        System.out.print("Selecciona una opción (número) o '0' para salir: ");
        String sel = sc.nextLine().trim();
        if (sel.equals("0")) {
            System.out.println("Saliendo. ¡Éxitos!");
            return;
        }
        Integer idx = parseEntero(sel);
        if (idx == null || !REGISTRO.containsKey(idx)) {
            System.out.println("⚠ Opción inválida.\n");
            continue;
        }

        Validador v = REGISTRO.get(idx);
        System.out.printf("Has seleccionado [%s] %s%n", v.id(), v.descripcion());
        System.out.println("Ingresa cadenas a validar. Comandos: ':back' para volver, ':help' para ayuda.\n");

        while (true) {
            System.out.print("› ");
            String input = sc.nextLine();
            if (input == null) input = "";
            input = input.replace("\r", "");
            String trimmed = input.trim();

            if (trimmed.equalsIgnoreCase(":back")) {
                System.out.println();
                break;
            }
            if (trimmed.equalsIgnoreCase(":help")) {
                ayuda();
                continue;
            }
            if (trimmed.isEmpty()) {
                System.out.println("⚠ (cadena vacía) — Ingresa texto o ':back'.");
                continue;
            }

            boolean ok;
            try {
                ok = REGISTRO.get(idx).acepta(input);
            } catch (Throwable ex) {
                ok = false;
                System.out.println("✖ Error ejecutando el validador: " + ex.getClass().getSimpleName()
                        + (ex.getMessage() != null ? " — " + ex.getMessage() : ""));
            }
            System.out.printf("  ⇒ %s%n%n", ok ? "✔ ACEPTA" : "✖ RECHAZA");
        }
    }
}
    // ===== utilitarios =====

    private static void banner() {
        System.out.println("============================================");
        System.out.println("    - Controlador de Autómatas -");
        System.out.println("============================================\n");
    }

    private static void mostrarMenu() {
        System.out.println("MENÚ:");
        REGISTRO.forEach((k, v) ->
                System.out.printf("  %d) [%s] %s%n", k, v.id(), v.descripcion()));
        System.out.println();
    }

    private static void ayuda() {
        System.out.println("""
                Comandos disponibles dentro del validador:
                  :back   -> volver al menú principal
                  :help   -> ver esta ayuda

                Escribe la cadena exactamente como se quiere validar.
                """);
    }

    private static Integer parseEntero(String s) {
        try { return Integer.valueOf(s); }
        catch (NumberFormatException e) { return null; }
    }
}

