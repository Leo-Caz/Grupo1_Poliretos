package Arrays.A05;

import java.util.Random;

public class GeneradorA05 {

    public void g1_matrizAleatoria(String nombreCompleto) {
        String texto = nombreCompleto.replace(" ", "");
        int n = texto.length();
        char[][] matriz = new char[n][n];
        Random random = new Random();

        System.out.println("\nMATRIZ ALEATORIA CON NOMBRE (Grupo 1)");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // escoger una letra aleatoria del nombre
                char letra = texto.charAt(random.nextInt(texto.length()));
                // simular colisión con 15% de probabilidad
                if (random.nextDouble() < 0.15) letra = '*';
                matriz[i][j] = letra;
                System.out.print(letra + " ");
                try {
                    Thread.sleep(70); // delay para animar la carga
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
        }
    }
}
