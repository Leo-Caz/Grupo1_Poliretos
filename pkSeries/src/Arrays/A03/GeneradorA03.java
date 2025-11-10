package Arrays.A03;

public class GeneradorA03 {

    public void g1_graficarFuncion(String nombre) {
        
        char[] letras = nombre.replace(" ", "").toCharArray();
        int maxY = letras.length * 2; // Altura del plano

        System.out.println("\nPLANO DE COORDENADAS POSITIVO (f(x) = 2x)\n");

        
        for (int y = maxY; y >= 0; y--) {
            System.out.printf("%2d | ", y); // Eje Y
            boolean encontrado = false;

            // Eje X con las letras representando puntos
            for (int x = 0; x < letras.length; x++) {
                int fx = 2 * x; // f(x) = 2x
                if (fx == y) {
                    System.out.print(letras[x]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) System.out.print(" ");
            System.out.println();
        }

         System.out.print("   +");
        for (int i = 0; i < letras.length; i++) {
            System.out.print("--");
        }
        System.out.println(">");
        System.out.print("     ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println("\n");
    }
}

