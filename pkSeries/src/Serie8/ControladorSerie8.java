package Serie8;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorSerie8 {
    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie8 generador = new GeneradorSerie8();

    public ControladorSerie8(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 8 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        System.out.println();

        ejecutarA01();
        ejecutarA02();
        ejecutarA03();
        ejecutarA04();
        ejecutarA05();
        ejecutarA06();
        ejecutarA07();
    }

    private void ejecutarA01() {
        System.out.println("--- A01: Validar patron a*b+c ---");
        String entrada = solicitarCadena("Ingrese una cadena para validar a*b+c: ");
        boolean valido = generador.g1_validarA01(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA02() {
        System.out.println("--- A02: Validar patron ab+ca ---");
        String entrada = solicitarCadena("Ingrese una cadena para validar ab+ca: ");
        boolean valido = generador.g1_validarA02(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA03() {
        System.out.println("--- A03: Validar patron a+/b+/c+ ---");
        String entrada = solicitarCadena("Ingrese una cadena para validar a+/b+/c+: ");
        boolean valido = generador.g1_validarA03(entrada);
        mostrarResultado(entrada, valido);

        System.out.println("--- A03b: Validar patron 1+/0+1* ---");
        entrada = solicitarCadena("Ingrese una cadena para validar 1+/0+1*: ");
        valido = generador.g1_validarA03b(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA04() {
        System.out.println("--- A04: Validar numero decimal ---");
        String entrada = solicitarCadena("Ingrese un numero decimal: ");
        boolean valido = generador.g1_validarA04NumeroDecimal(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA05() {
        System.out.println("--- A05: Validar declaracion de variable Java ---");
        String entrada = solicitarCadena("Ingrese una declaracion (solo nombre, sin tipo): ");
        boolean valido = generador.g1_validarA05VariableJava(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA06() {
        System.out.println("--- A06: Validar palabra reservada de control ---");
        String entrada = solicitarCadena("Ingrese for/if/else/ifelse/foreach: ");
        boolean valido = generador.g1_validarA06LenguajeControl(entrada);
        mostrarResultado(entrada, valido);
    }

    private void ejecutarA07() {
        System.out.println("--- A07: Validar clave segura ---");
        String entrada = solicitarCadena("Ingrese una clave: ");
        boolean valido = generador.g1_validarA07ClaveSegura(entrada);
        mostrarResultado(entrada, valido);
    }

    private String solicitarCadena(String mensaje) {
        System.out.print(mensaje);
        return lector.nextLine().trim();
    }

    private void mostrarResultado(String entrada, boolean valido) {
        System.out.println("Cadena: \"" + entrada + "\" -> " + (valido ? "ACEPTADA" : "RECHAZADA"));
        System.out.println();
    }
}
