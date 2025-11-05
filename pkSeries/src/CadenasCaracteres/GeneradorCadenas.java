package CadenasCaracteres;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GeneradorCadenas {

    // ========== C01: CONTAR VOCALES ==========
    
    public int g1_contarVocalesFor(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public int g1_contarVocalesWhile(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        int i = 0;
        
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
            i++;
        }
        return contador;
    }

    public int g1_contarVocalesDoWhile(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        int i = 0;
        
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (vocales.indexOf(c) != -1) {
                    contador++;
                }
                i++;
            } while (i < frase.length());
        }
        return contador;
    }

    // ========== C02: CONTAR LETRAS ==========
    
    public int g1_contarLetrasFor(String frase) {
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        return contador;
    }

    public int g1_contarLetrasWhile(String frase) {
        int contador = 0;
        int i = 0;
        
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
            i++;
        }
        return contador;
    }

    public int g1_contarLetrasDoWhile(String frase) {
        int contador = 0;
        int i = 0;
        
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.isLetter(c)) {
                    contador++;
                }
                i++;
            } while (i < frase.length());
        }
        return contador;
    }

    // ========== C03: ELIMINAR VOCAL ==========
    
    public String g1_eliminarVocalFor(String frase, char vocal) {
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        
        if (vocales.indexOf(vocal) == -1) {
            return "El carácter ingresado no es una vocal válida";
        }
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String g1_eliminarVocalWhile(String frase, char vocal) {
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        int i = 0;
        
        if (vocales.indexOf(vocal) == -1) {
            return "El carácter ingresado no es una vocal válida";
        }
        
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
                resultado.append(c);
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_eliminarVocalDoWhile(String frase, char vocal) {
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        int i = 0;
        
        if (vocales.indexOf(vocal) == -1) {
            return "El carácter ingresado no es una vocal válida";
        }
        
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.toLowerCase(c) != Character.toLowerCase(vocal)) {
                    resultado.append(c);
                }
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }

    // ========== C04: ELIMINAR LETRA ==========
    
    public String g1_eliminarLetraFor(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String g1_eliminarLetraWhile(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultado.append(c);
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_eliminarLetraDoWhile(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                    resultado.append(c);
                }
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }

    // ========== C05: INVERTIR CON VOCALES MAYÚSCULAS ==========
    
    public String g1_invertirConVocalesMayusculasFor(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouáéíóú";
        
        for (int i = 0; i < invertida.length(); i++) {
            char c = invertida.charAt(i);
            if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(Character.toLowerCase(c));
            }
        }
        return resultado.toString();
    }

    public String g1_invertirConVocalesMayusculasWhile(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouáéíóú";
        int i = 0;
        
        while (i < invertida.length()) {
            char c = invertida.charAt(i);
            if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(Character.toLowerCase(c));
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_invertirConVocalesMayusculasDoWhile(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        String vocales = "aeiouáéíóú";
        int i = 0;
        
        if (invertida.length() > 0) {
            do {
                char c = invertida.charAt(i);
                if (vocales.indexOf(Character.toLowerCase(c)) != -1) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                i++;
            } while (i < invertida.length());
        }
        return resultado.toString();
    }

    // ========== C06: INVERTIR CON LETRAS MAYÚSCULAS ==========
    
    public String g1_invertirConLetrasMayusculasFor(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < invertida.length(); i++) {
            char c = invertida.charAt(i);
            if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String g1_invertirConLetrasMayusculasWhile(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        while (i < invertida.length()) {
            char c = invertida.charAt(i);
            if (Character.isLetter(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                resultado.append(c);
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_invertirConLetrasMayusculasDoWhile(String frase) {
        StringBuilder invertida = new StringBuilder(frase).reverse();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        if (invertida.length() > 0) {
            do {
                char c = invertida.charAt(i);
                if (Character.isLetter(c)) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(c);
                }
                i++;
            } while (i < invertida.length());
        }
        return resultado.toString();
    }

    // ========== C07: MAYÚSCULAS SIN J ==========
    
    public String g1_mayusculasSinJFor(String frase) {
        String mayusculas = frase.toUpperCase();
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < mayusculas.length(); i++) {
            char c = mayusculas.charAt(i);
            if (c != 'J') {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String g1_mayusculasSinJWhile(String frase) {
        String mayusculas = frase.toUpperCase();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        while (i < mayusculas.length()) {
            char c = mayusculas.charAt(i);
            if (c != 'J') {
                resultado.append(c);
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_mayusculasSinJDoWhile(String frase) {
        String mayusculas = frase.toUpperCase();
        StringBuilder resultado = new StringBuilder();
        int i = 0;
        
        if (mayusculas.length() > 0) {
            do {
                char c = mayusculas.charAt(i);
                if (c != 'J') {
                    resultado.append(c);
                }
                i++;
            } while (i < mayusculas.length());
        }
        return resultado.toString();
    }

    // ========== C08: ANAGRAMAS ==========
    
    public void g1_juegoAnagramas(Scanner lector) {
        Map<String, String> anagramas = new HashMap<>();
        anagramas.put("delira", "lidera");
        anagramas.put("ballena", "llenaba");
        anagramas.put("alondra", "ladrona");
        anagramas.put("españa", "apañes");
        anagramas.put("enrique", "quieren");
        
        String[] palabras = anagramas.keySet().toArray(new String[0]);
        Random random = new Random();
        String palabra = palabras[random.nextInt(palabras.length)];
        String anagramaCorrecto = anagramas.get(palabra);
        
        System.out.println("Anagrama de: " + palabra);
        System.out.println("Tienes 3 intentos");
        
        int intento = 1;
        boolean adivinado = false;
        
        while (intento <= 3 && !adivinado) {
            System.out.print("Intento " + intento + ": ");
            String respuesta = lector.nextLine();
            
            if (respuesta.equalsIgnoreCase(anagramaCorrecto)) {
                System.out.println("¡Correcto! El anagrama es: " + anagramaCorrecto);
                adivinado = true;
            } else {
                System.out.println("Incorrecto");
                intento++;
            }
        }
        
        if (!adivinado) {
            System.out.println("La respuesta correcta era: " + anagramaCorrecto);
        }
    }

    // ========== C09: ALTERNAR MAYÚSCULAS/MINÚSCULAS ==========
    
    public String g1_alternarMayusculasMinusculasFor(String frase) {
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (mayuscula) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                mayuscula = !mayuscula;
            } else {
                resultado.append(c);
                if (c == ' ') {
                    mayuscula = true;
                }
            }
        }
        return resultado.toString();
    }

    public String g1_alternarMayusculasMinusculasWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;
        int i = 0;
        
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (mayuscula) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                mayuscula = !mayuscula;
            } else {
                resultado.append(c);
                if (c == ' ') {
                    mayuscula = true;
                }
            }
            i++;
        }
        return resultado.toString();
    }

    public String g1_alternarMayusculasMinusculasDoWhile(String frase) {
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;
        int i = 0;
        
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(i);
                if (Character.isLetter(c)) {
                    if (mayuscula) {
                        resultado.append(Character.toUpperCase(c));
                    } else {
                        resultado.append(Character.toLowerCase(c));
                    }
                    mayuscula = !mayuscula;
                } else {
                    resultado.append(c);
                    if (c == ' ') {
                        mayuscula = true;
                    }
                }
                i++;
            } while (i < frase.length());
        }
        return resultado.toString();
    }
}