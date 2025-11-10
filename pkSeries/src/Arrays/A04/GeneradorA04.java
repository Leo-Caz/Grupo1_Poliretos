package Arrays.A04;

public class GeneradorA04 {

    public void g1_formarX(String nombre, String apellido) {
        String texto = (nombre + " " + apellido).replace(" ", "");
        int n = texto.length();

        System.out.println("\nMATRIZ EN FORMA DE X ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(nombre.charAt(i % nombre.length()) + " ");
                } else if (j == n - 1 - i) {
                    System.out.print(apellido.charAt(i % apellido.length()) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
