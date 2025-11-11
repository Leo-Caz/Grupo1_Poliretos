package SeriesNumericas;

public class GeneradorSerie1 {
    public String g1_crearSerieNumericasS1For(int terminos) {
        String texto = "";
        int primero = 0;
        int segundo = 1;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            texto = texto + primero;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS1While(int terminos) {
        String texto = "";
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + primero;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS1DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + primero;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS2For(int terminos) {
        String texto = "";
        int impar = 1;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            if (indice % 2 == 0) {
                texto = texto + impar;
                impar = impar + 2;
            } else {
                texto = texto + "0";
            }
        }
        return texto;
    }

    public String g1_crearSerieNumericasS2While(int terminos) {
        String texto = "";
        int contador = 0;
        int impar = 1;
        boolean mostrarCero = false;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            if (mostrarCero) {
                texto = texto + "0";
            } else {
                texto = texto + impar;
                impar = impar + 2;
            }
            mostrarCero = !mostrarCero;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS2DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int impar = 1;
        boolean mostrarCero = false;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            if (mostrarCero) {
                texto = texto + "0";
            } else {
                texto = texto + impar;
                impar = impar + 2;
            }
            mostrarCero = !mostrarCero;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS3For(int terminos) {
        String texto = "";
        int primero = 0;
        int segundo = 1;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * indice + 1;
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS3While(int terminos) {
        String texto = "";
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * contador + 1;
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS3DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * contador + 1;
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS4For(int terminos) {
        String texto = "";
        int primero = 0;
        int segundo = 1;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * (indice + 1);
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS4While(int terminos) {
        String texto = "";
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * (contador + 1);
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS4DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            int denominador = 2 * (contador + 1);
            texto = texto + primero + "/" + denominador;
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS5For(int terminos) {
        String texto = "";
        int encontrados = 0;
        int numero = 2;
        for (; encontrados < terminos; numero++) {
            if (esPrimo(numero)) {
                if (encontrados > 0) {
                    texto = texto + " ";
                }
                texto = texto + numero;
                encontrados = encontrados + 1;
            }
        }
        return texto;
    }

    public String g1_crearSerieNumericasS5While(int terminos) {
        String texto = "";
        int encontrados = 0;
        int numero = 2;
        while (encontrados < terminos) {
            if (esPrimo(numero)) {
                if (encontrados > 0) {
                    texto = texto + " ";
                }
                texto = texto + numero;
                encontrados = encontrados + 1;
            }
            numero = numero + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS5DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int encontrados = 0;
        int numero = 2;
        do {
            if (esPrimo(numero)) {
                if (encontrados > 0) {
                    texto = texto + " ";
                }
                texto = texto + numero;
                encontrados = encontrados + 1;
            }
            numero = numero + 1;
        } while (encontrados < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS6For(int terminos) {
        String texto = "";
        for (int numero = 1; numero <= terminos; numero++) {
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + (numero * numero);
        }
        return texto;
    }

    public String g1_crearSerieNumericasS6While(int terminos) {
        String texto = "";
        int numero = 1;
        while (numero <= terminos) {
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + (numero * numero);
            numero = numero + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS6DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int numero = 1;
        do {
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + (numero * numero);
            numero = numero + 1;
        } while (numero <= terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS7For(int terminos) {
        String texto = "";
        int valor = 1;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 3;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS7While(int terminos) {
        String texto = "";
        int contador = 0;
        int valor = 1;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 3;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS7DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int valor = 1;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 3;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS8For(int terminos) {
        String texto = "";
        int valor = 3;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 5;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS8While(int terminos) {
        String texto = "";
        int contador = 0;
        int valor = 3;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 5;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS8DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int valor = 3;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor + 5;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS9For(int terminos) {
        String texto = "";
        int valor = 2;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 2;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS9While(int terminos) {
        String texto = "";
        int contador = 0;
        int valor = 2;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 2;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS9DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int valor = 2;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 2;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS10For(int terminos) {
        String texto = "";
        int valor = 3;
        for (int indice = 0; indice < terminos; indice++) {
            if (indice > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 3;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS10While(int terminos) {
        String texto = "";
        int contador = 0;
        int valor = 3;
        while (contador < terminos) {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 3;
            contador = contador + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS10DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int contador = 0;
        int valor = 3;
        do {
            if (contador > 0) {
                texto = texto + " ";
            }
            texto = texto + valor;
            valor = valor * 3;
            contador = contador + 1;
        } while (contador < terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS11For(int terminos) {
        String texto = "";
        int acumulado = 0;
        for (int numero = 1; numero <= terminos; numero++) {
            acumulado = acumulado + numero;
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + acumulado;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS11While(int terminos) {
        String texto = "";
        int numero = 1;
        int acumulado = 0;
        while (numero <= terminos) {
            acumulado = acumulado + numero;
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + acumulado;
            numero = numero + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS11DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int numero = 1;
        int acumulado = 0;
        do {
            acumulado = acumulado + numero;
            if (numero > 1) {
                texto = texto + " ";
            }
            texto = texto + acumulado;
            numero = numero + 1;
        } while (numero <= terminos);
        return texto;
    }

    public String g1_crearSerieNumericasS12For(int terminos) {
        String texto = "";
        for (int numero = 1; numero <= terminos; numero++) {
            if (numero > 1) {
                texto = texto + " ";
            }
            int valor = numero * (numero + 1);
            texto = texto + valor;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS12While(int terminos) {
        String texto = "";
        int numero = 1;
        while (numero <= terminos) {
            if (numero > 1) {
                texto = texto + " ";
            }
            int valor = numero * (numero + 1);
            texto = texto + valor;
            numero = numero + 1;
        }
        return texto;
    }

    public String g1_crearSerieNumericasS12DoWhile(int terminos) {
        String texto = "";
        if (terminos <= 0) {
            return texto;
        }
        int numero = 1;
        do {
            if (numero > 1) {
                texto = texto + " ";
            }
            int valor = numero * (numero + 1);
            texto = texto + valor;
            numero = numero + 1;
        } while (numero <= terminos);
        return texto;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int divisor = 3; divisor * divisor <= numero; divisor = divisor + 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
