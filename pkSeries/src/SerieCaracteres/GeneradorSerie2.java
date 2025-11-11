package SerieCaracteres;

public class GeneradorSerie2 {

    public String g1_generarS1ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            g1_agregarElemento(texto, indice % 2 == 0 ? "+" : "-");
        }
        return texto.toString();
    }

    public String g1_generarS1ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            g1_agregarElemento(texto, indice % 2 == 0 ? "+" : "-");
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS1ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            g1_agregarElemento(texto, indice % 2 == 0 ? "+" : "-");
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS2ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        int anterior = 1;
        int actual = 1;
        for (int indice = 0; indice < terminos; indice++) {
            int longitud;
            if (indice <= 1) {
                longitud = 1;
            } else {
                longitud = anterior + actual;
                anterior = actual;
                actual = longitud;
            }
            g1_agregarElemento(texto, g1_repetirCaracterConFor('+', longitud));
        }
        return texto.toString();
    }

    public String g1_generarS2ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int anterior = 1;
        int actual = 1;
        int indice = 0;
        while (indice < terminos) {
            int longitud;
            if (indice <= 1) {
                longitud = 1;
            } else {
                longitud = anterior + actual;
                anterior = actual;
                actual = longitud;
            }
            g1_agregarElemento(texto, g1_repetirCaracterConWhile('+', longitud));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS2ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int anterior = 1;
        int actual = 1;
        int indice = 0;
        do {
            int longitud;
            if (indice <= 1) {
                longitud = 1;
            } else {
                longitud = anterior + actual;
                anterior = actual;
                actual = longitud;
            }
            g1_agregarElemento(texto, g1_repetirCaracterConDoWhile('+', longitud));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS3ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        int candidato = 2;
        for (int generados = 0; generados < terminos; generados++) {
            boolean encontrado = false;
            for (int numero = candidato; !encontrado; numero++) {
                if (g1_esPrimoConFor(numero)) {
                    g1_agregarElemento(texto, g1_repetirCaracterConFor('+', numero));
                    candidato = numero + 1;
                    encontrado = true;
                }
            }
        }
        return texto.toString();
    }

    public String g1_generarS3ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int generados = 0;
        int candidato = 2;
        while (generados < terminos) {
            int numero = candidato;
            boolean encontrado = false;
            while (!encontrado) {
                if (g1_esPrimoConWhile(numero)) {
                    g1_agregarElemento(texto, g1_repetirCaracterConWhile('+', numero));
                    candidato = numero + 1;
                    encontrado = true;
                } else {
                    numero++;
                }
            }
            generados++;
        }
        return texto.toString();
    }

    public String g1_generarS3ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int generados = 0;
        int candidato = 2;
        do {
            int numero = candidato;
            boolean encontrado = false;
            do {
                if (g1_esPrimoConDoWhile(numero)) {
                    g1_agregarElemento(texto, g1_repetirCaracterConDoWhile('+', numero));
                    candidato = numero + 1;
                    encontrado = true;
                } else {
                    numero++;
                }
            } while (!encontrado);
            generados++;
        } while (generados < terminos);
        return texto.toString();
    }

    public String g1_generarS4ConFor(int terminos) {
        char[] simbolos = {'+', '-', '*', '/'};
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
        }
        return texto.toString();
    }

    public String g1_generarS4ConWhile(int terminos) {
        char[] simbolos = {'+', '-', '*', '/'};
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS4ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        char[] simbolos = {'+', '-', '*', '/'};
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS5ConFor(int terminos) {
        char[] simbolos = {'\\', '|', '/', '-'};
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
        }
        return texto.toString();
    }

    public String g1_generarS5ConWhile(int terminos) {
        char[] simbolos = {'\\', '|', '/', '-'};
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS5ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        char[] simbolos = {'\\', '|', '/', '-'};
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            g1_agregarElemento(texto, String.valueOf(simbolos[indice % simbolos.length]));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS6ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            char letra = (char) ('a' + (indice % 26));
            g1_agregarElemento(texto, String.valueOf(letra));
        }
        return texto.toString();
    }

    public String g1_generarS6ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            char letra = (char) ('a' + (indice % 26));
            g1_agregarElemento(texto, String.valueOf(letra));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS6ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            char letra = (char) ('a' + (indice % 26));
            g1_agregarElemento(texto, String.valueOf(letra));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS7ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = (indice + 1) * 2;
            g1_agregarElemento(texto, g1_repetirCaracterConFor(letra, longitud));
        }
        return texto.toString();
    }

    public String g1_generarS7ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = (indice + 1) * 2;
            g1_agregarElemento(texto, g1_repetirCaracterConWhile(letra, longitud));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS7ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            char letra = (char) ('a' + (indice % 26));
            int longitud = (indice + 1) * 2;
            g1_agregarElemento(texto, g1_repetirCaracterConDoWhile(letra, longitud));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS8ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = indice * 2 + 1;
            g1_agregarElemento(texto, g1_repetirCaracterConFor(letra, longitud));
        }
        return texto.toString();
    }

    public String g1_generarS8ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = indice * 2 + 1;
            g1_agregarElemento(texto, g1_repetirCaracterConWhile(letra, longitud));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS8ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            char letra = (char) ('a' + (indice % 26));
            int longitud = indice * 2 + 1;
            g1_agregarElemento(texto, g1_repetirCaracterConDoWhile(letra, longitud));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    public String g1_generarS9ConFor(int terminos) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < terminos; indice++) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = g1_calcularLongitudS9(indice);
            g1_agregarElemento(texto, g1_repetirCaracterConFor(letra, longitud));
        }
        return texto.toString();
    }

    public String g1_generarS9ConWhile(int terminos) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < terminos) {
            char letra = (char) ('a' + (indice % 26));
            int longitud = g1_calcularLongitudS9(indice);
            g1_agregarElemento(texto, g1_repetirCaracterConWhile(letra, longitud));
            indice++;
        }
        return texto.toString();
    }

    public String g1_generarS9ConDoWhile(int terminos) {
        if (terminos <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            char letra = (char) ('a' + (indice % 26));
            int longitud = g1_calcularLongitudS9(indice);
            g1_agregarElemento(texto, g1_repetirCaracterConDoWhile(letra, longitud));
            indice++;
        } while (indice < terminos);
        return texto.toString();
    }

    private void g1_agregarElemento(StringBuilder texto, String elemento) {
        if (texto.length() > 0) {
            texto.append(" ");
        }
        texto.append(elemento);
    }

    private String g1_repetirCaracterConFor(char simbolo, int cantidad) {
        StringBuilder texto = new StringBuilder();
        for (int indice = 0; indice < cantidad; indice++) {
            texto.append(simbolo);
        }
        return texto.toString();
    }

    private String g1_repetirCaracterConWhile(char simbolo, int cantidad) {
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        while (indice < cantidad) {
            texto.append(simbolo);
            indice++;
        }
        return texto.toString();
    }

    private String g1_repetirCaracterConDoWhile(char simbolo, int cantidad) {
        if (cantidad <= 0) {
            return "";
        }
        StringBuilder texto = new StringBuilder();
        int indice = 0;
        do {
            texto.append(simbolo);
            indice++;
        } while (indice < cantidad);
        return texto.toString();
    }

    private boolean g1_esPrimoConFor(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean g1_esPrimoConWhile(int numero) {
        if (numero < 2) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    private boolean g1_esPrimoConDoWhile(int numero) {
        if (numero < 2) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        int divisor = 2;
        boolean esPrimo = true;
        do {
            if (numero % divisor == 0) {
                esPrimo = false;
            } else {
                divisor++;
            }
        } while (esPrimo && divisor * divisor <= numero);
        return esPrimo;
    }

    private int g1_calcularLongitudS9(int indice) {
        if (indice < 3) {
            return 1;
        }
        return indice - 1;
    }
}
