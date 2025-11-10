package BarrasAnimaciones;

public class GeneradorAnimaciones {

    public void barraCargaBasica(int pasos) {
        for (int i = 0; i <= pasos; i++) {
            int porcentaje = (100 * i) / pasos;
            String barra = "[" + "=".repeat(i) + " ".repeat(pasos - i) + "] " + porcentaje + "%";
            System.out.print("\r" + barra);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
        System.out.println("\n¡Carga completa!");
    }

    public void spinnerAnimado(int vueltas) {
        char[] spinner = {'|', '/', '-', '\\'};
        int totalPasos = vueltas * spinner.length;
        for (int i = 0; i < totalPasos; i++) {
            System.out.print("\rProcesando " + spinner[i % spinner.length]);
            try { Thread.sleep(120); } catch (InterruptedException e) { }
        }
        System.out.print("\rListo           \n");
    }

    public void barraCargaInversa(int pasos) {
        for (int i = pasos; i >= 0; i--) {
            int porcentaje = (100 * i) / pasos;
            String barra = "[" + "=".repeat(i) + " ".repeat(pasos - i) + "] " + porcentaje + "%";
            System.out.print("\r" + barra);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
        System.out.println("\n¡Carga inversa completa!");
    }

    public void barraPingPong(int ciclos) {
        int longitud = 20;
        int posicion = 0;
        int direccion = 1;
        int totalPasos = ciclos * longitud * 2;
        for (int i = 0; i < totalPasos; i++) {
            StringBuilder sb = new StringBuilder("[");
            for (int j = 0; j < longitud; j++) {
                sb.append(j == posicion ? "*" : " ");
            }
            sb.append("]");
            System.out.print("\r" + sb.toString());
            posicion += direccion;
            if (posicion == 0 || posicion == longitud - 1) {
                direccion = -direccion;
            }
            try { Thread.sleep(80); } catch (InterruptedException e) { }
        }
        System.out.println("\n¡Animación ping-pong terminada!");
    }

    public void barraSimbolosAlternados(int pasos) {
        char[] simbolos = {'*', '-'};
        for (int i = 0; i <= pasos; i++) {
            StringBuilder sb = new StringBuilder("[");
            for (int j = 0; j < i; j++) {
                sb.append(simbolos[j % simbolos.length]);
            }
            for (int j = i; j < pasos; j++) {
                sb.append(" ");
            }
            sb.append("] ");
            sb.append((100 * i) / pasos).append("%");
            System.out.print("\r" + sb.toString());
            try { Thread.sleep(100); } catch (InterruptedException e) { }
        }
        System.out.println("\n¡Carga alternada completa!");
    }
}
