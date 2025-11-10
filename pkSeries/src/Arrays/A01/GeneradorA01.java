package Arrays.A01;

public class GeneradorA01 {

    public void g1_cargarPalabras(String[] palabras, int[] porcentajes) {
        System.out.println("\n=== RESULTADO DE CARGA ===");
        for (int i = 0; i < palabras.length; i++) {
            int porcentaje = porcentajes[i];
            int longitudBarra = 15; // longitud visual
            int llenado = (porcentaje * longitudBarra) / 100;

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < longitudBarra; j++) {
                if (j < llenado) barra.append("=");
                else barra.append(" ");
            }
            barra.append("]");

            System.out.printf("%s %3d%% %s%n", barra, porcentaje, palabras[i]);
        }
    }
}
