package Serie3;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorSerie3 {
    private final InformacionGrupo infoGrupo;
    private final Scanner lector;
    private final GeneradorSerie3 generador = new GeneradorSerie3();

    public ControladorSerie3(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 3 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        int niveles = solicitarNiveles();
        System.out.println();

        mostrarFigura("F1 con for", generador.g1_generarF1ConFor(niveles));
        mostrarFigura("F1 con while", generador.g1_generarF1ConWhile(niveles));
        mostrarFigura("F1 con do while", generador.g1_generarF1ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F2 con for", generador.g1_generarF2ConFor(niveles));
        mostrarFigura("F2 con while", generador.g1_generarF2ConWhile(niveles));
        mostrarFigura("F2 con do while", generador.g1_generarF2ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F3 con for", generador.g1_generarF3ConFor(niveles));
        mostrarFigura("F3 con while", generador.g1_generarF3ConWhile(niveles));
        mostrarFigura("F3 con do while", generador.g1_generarF3ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F4 con for", generador.g1_generarF4ConFor(niveles));
        mostrarFigura("F4 con while", generador.g1_generarF4ConWhile(niveles));
        mostrarFigura("F4 con do while", generador.g1_generarF4ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F5 con for", generador.g1_generarF5ConFor(niveles));
        mostrarFigura("F5 con while", generador.g1_generarF5ConWhile(niveles));
        mostrarFigura("F5 con do while", generador.g1_generarF5ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F6 con for", generador.g1_generarF6ConFor(niveles));
        mostrarFigura("F6 con while", generador.g1_generarF6ConWhile(niveles));
        mostrarFigura("F6 con do while", generador.g1_generarF6ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F7 con for", generador.g1_generarF7ConFor(niveles));
        mostrarFigura("F7 con while", generador.g1_generarF7ConWhile(niveles));
        mostrarFigura("F7 con do while", generador.g1_generarF7ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F8 con for", generador.g1_generarF8ConFor(niveles));
        mostrarFigura("F8 con while", generador.g1_generarF8ConWhile(niveles));
        mostrarFigura("F8 con do while", generador.g1_generarF8ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F9 con for", generador.g1_generarF9ConFor(niveles));
        mostrarFigura("F9 con while", generador.g1_generarF9ConWhile(niveles));
        mostrarFigura("F9 con do while", generador.g1_generarF9ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F10 con for", generador.g1_generarF10ConFor(niveles));
        mostrarFigura("F10 con while", generador.g1_generarF10ConWhile(niveles));
        mostrarFigura("F10 con do while", generador.g1_generarF10ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F11 con for", generador.g1_generarF11ConFor(niveles));
        mostrarFigura("F11 con while", generador.g1_generarF11ConWhile(niveles));
        mostrarFigura("F11 con do while", generador.g1_generarF11ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F12 con for", generador.g1_generarF12ConFor(niveles));
        mostrarFigura("F12 con while", generador.g1_generarF12ConWhile(niveles));
        mostrarFigura("F12 con do while", generador.g1_generarF12ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F13 con for", generador.g1_generarF13ConFor(niveles));
        mostrarFigura("F13 con while", generador.g1_generarF13ConWhile(niveles));
        mostrarFigura("F13 con do while", generador.g1_generarF13ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F14 con for", generador.g1_generarF14ConFor(niveles));
        mostrarFigura("F14 con while", generador.g1_generarF14ConWhile(niveles));
        mostrarFigura("F14 con do while", generador.g1_generarF14ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F15 con for", generador.g1_generarF15ConFor(niveles));
        mostrarFigura("F15 con while", generador.g1_generarF15ConWhile(niveles));
        mostrarFigura("F15 con do while", generador.g1_generarF15ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F16 con for", generador.g1_generarF16ConFor(niveles));
        mostrarFigura("F16 con while", generador.g1_generarF16ConWhile(niveles));
        mostrarFigura("F16 con do while", generador.g1_generarF16ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F17 con for", generador.g1_generarF17ConFor(niveles));
        mostrarFigura("F17 con while", generador.g1_generarF17ConWhile(niveles));
        mostrarFigura("F17 con do while", generador.g1_generarF17ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F18 con for", generador.g1_generarF18ConFor(niveles));
        mostrarFigura("F18 con while", generador.g1_generarF18ConWhile(niveles));
        mostrarFigura("F18 con do while", generador.g1_generarF18ConDoWhile(niveles));
        System.out.println();

        mostrarFigura("F19 con for", generador.g1_generarF19ConFor(niveles));
        mostrarFigura("F19 con while", generador.g1_generarF19ConWhile(niveles));
        mostrarFigura("F19 con do while", generador.g1_generarF19ConDoWhile(niveles));
    }

    private int solicitarNiveles() {
        int niveles = 0;
        do {
            System.out.print("Ingrese el tamano/numero de niveles para las figuras: ");
            while (!lector.hasNextInt()) {
                System.out.print("Ingrese un numero entero valido: ");
                lector.next();
            }
            niveles = lector.nextInt();
            lector.nextLine();
            if (niveles <= 0) {
                System.out.println("El numero debe ser mayor que cero.");
            }
        } while (niveles <= 0);
        return niveles;
    }

    private void mostrarFigura(String etiqueta, String figura) {
        System.out.println(etiqueta + ":");
        System.out.println(figura.isEmpty() ? "(sin contenido)" : figura);
    }
}
