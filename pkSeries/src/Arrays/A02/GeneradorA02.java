package Arrays.A02;

public class GeneradorA02 {

    public void g1_dibujarIniciales(String iniciales, int tamaño, char caracter) {
        // Recorremos cada inicial
        for (int i = 0; i < iniciales.length(); i++) {
            char letra = iniciales.charAt(i);

            System.out.println("\nLetra: " + letra);
            // Dibujar la letra como un cuadrado básico
            for (int fila = 0; fila < tamaño; fila++) {
                for (int col = 0; col < tamaño; col++) {
                    if (fila == 0 || fila == tamaño - 1 || col == 0 || col == tamaño - 1) {
                        System.out.print(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(); // Espacio entre letras
        }
    }
}
