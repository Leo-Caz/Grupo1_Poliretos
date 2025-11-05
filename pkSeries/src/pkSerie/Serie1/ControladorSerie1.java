package pkSerie.Serie1;

import appinfo.InformacionGrupo;
import java.util.Scanner;

public class ControladorSerie1 {
    private final InformacionGrupo infoGrupo;
    private final GeneradorSerie1 generador = new GeneradorSerie1();
    private final Scanner lector;

    public ControladorSerie1(InformacionGrupo infoGrupo, Scanner lector) {
        this.infoGrupo = infoGrupo;
        this.lector = lector;
    }

    public void run() {
        System.out.println("=== Serie 1 (Grupo " + infoGrupo.getNumeroGrupo() + ") ===");
        int terminos = solicitarTerminos();

        System.out.println();
        System.out.println("Series con " + terminos + " termino(s):");

        System.out.println("S1 con for: " + generador.g1_crearSerieNumericasS1For(terminos));
        System.out.println("S1 con while: " + generador.g1_crearSerieNumericasS1While(terminos));
        System.out.println("S1 con dowhile: " + generador.g1_crearSerieNumericasS1DoWhile(terminos));

        System.out.println("S2 con for: " + generador.g1_crearSerieNumericasS2For(terminos));
        System.out.println("S2 con while: " + generador.g1_crearSerieNumericasS2While(terminos));
        System.out.println("S2 con dowhile: " + generador.g1_crearSerieNumericasS2DoWhile(terminos));

        System.out.println("S3 con for: " + generador.g1_crearSerieNumericasS3For(terminos));
        System.out.println("S3 con while: " + generador.g1_crearSerieNumericasS3While(terminos));
        System.out.println("S3 con dowhile: " + generador.g1_crearSerieNumericasS3DoWhile(terminos));

        System.out.println("S4 con for: " + generador.g1_crearSerieNumericasS4For(terminos));
        System.out.println("S4 con while: " + generador.g1_crearSerieNumericasS4While(terminos));
        System.out.println("S4 con dowhile: " + generador.g1_crearSerieNumericasS4DoWhile(terminos));

        System.out.println("S5 con for: " + generador.g1_crearSerieNumericasS5For(terminos));
        System.out.println("S5 con while: " + generador.g1_crearSerieNumericasS5While(terminos));
        System.out.println("S5 con dowhile: " + generador.g1_crearSerieNumericasS5DoWhile(terminos));

        System.out.println("S6 con for: " + generador.g1_crearSerieNumericasS6For(terminos));
        System.out.println("S6 con while: " + generador.g1_crearSerieNumericasS6While(terminos));
        System.out.println("S6 con dowhile: " + generador.g1_crearSerieNumericasS6DoWhile(terminos));

        System.out.println("S7 con for: " + generador.g1_crearSerieNumericasS7For(terminos));
        System.out.println("S7 con while: " + generador.g1_crearSerieNumericasS7While(terminos));
        System.out.println("S7 con dowhile: " + generador.g1_crearSerieNumericasS7DoWhile(terminos));

        System.out.println("S8 con for: " + generador.g1_crearSerieNumericasS8For(terminos));
        System.out.println("S8 con while: " + generador.g1_crearSerieNumericasS8While(terminos));
        System.out.println("S8 con dowhile: " + generador.g1_crearSerieNumericasS8DoWhile(terminos));

        System.out.println("S9 con for: " + generador.g1_crearSerieNumericasS9For(terminos));
        System.out.println("S9 con while: " + generador.g1_crearSerieNumericasS9While(terminos));
        System.out.println("S9 con dowhile: " + generador.g1_crearSerieNumericasS9DoWhile(terminos));

        System.out.println("S10 con for: " + generador.g1_crearSerieNumericasS10For(terminos));
        System.out.println("S10 con while: " + generador.g1_crearSerieNumericasS10While(terminos));
        System.out.println("S10 con dowhile: " + generador.g1_crearSerieNumericasS10DoWhile(terminos));

        System.out.println("S11 con for: " + generador.g1_crearSerieNumericasS11For(terminos));
        System.out.println("S11 con while: " + generador.g1_crearSerieNumericasS11While(terminos));
        System.out.println("S11 con dowhile: " + generador.g1_crearSerieNumericasS11DoWhile(terminos));

        System.out.println("S12 con for: " + generador.g1_crearSerieNumericasS12For(terminos));
        System.out.println("S12 con while: " + generador.g1_crearSerieNumericasS12While(terminos));
        System.out.println("S12 con dowhile: " + generador.g1_crearSerieNumericasS12DoWhile(terminos));
    }

    private int solicitarTerminos() {
        int valor = 0;
        do {
            System.out.print("\nIngrese la cantidad de terminos a generar: ");
            while (!lector.hasNextInt()) {
                System.out.print("Ingrese un numero entero valido: ");
                lector.next();
            }
            valor = lector.nextInt();
            lector.nextLine();
        } while (valor <= 0);
        return valor;
    }
}
