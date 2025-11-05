package Serie8;

import java.util.regex.Pattern;

public class GeneradorSerie8 {
    private static final Pattern PATRON_A01 = Pattern.compile("^a+b+c$");
    private static final Pattern PATRON_A02 = Pattern.compile("^ab+ca$");
    private static final Pattern PATRON_A03 = Pattern.compile("^(a+|b+|c+)$");
    private static final Pattern PATRON_A03B = Pattern.compile("^(1+|0+1*)$");
    private static final Pattern PATRON_A04 = Pattern.compile("^[+-]?((\\d+\\.\\d+)|(\\d+\\.)|(\\.\\d+)|(\\d+))$");
    private static final Pattern PATRON_A05 = Pattern.compile("^[a-zA-Z_][a-zA-Z0-9_]*$");
    private static final Pattern PATRON_A06 = Pattern.compile("^(for|if|else|ifelse|foreach)\\(?$");

    public boolean g1_validarA01(String entrada) {
        return entrada != null && PATRON_A01.matcher(entrada).matches();
    }

    public boolean g1_validarA02(String entrada) {
        return entrada != null && PATRON_A02.matcher(entrada).matches();
    }

    public boolean g1_validarA03(String entrada) {
        return entrada != null && PATRON_A03.matcher(entrada).matches();
    }

    public boolean g1_validarA03b(String entrada) {
        return entrada != null && PATRON_A03B.matcher(entrada).matches();
    }

    public boolean g1_validarA04NumeroDecimal(String entrada) {
        return entrada != null && PATRON_A04.matcher(entrada).matches();
    }

    public boolean g1_validarA05VariableJava(String entrada) {
        return entrada != null && PATRON_A05.matcher(entrada).matches();
    }

    public boolean g1_validarA06LenguajeControl(String entrada) {
        return entrada != null && PATRON_A06.matcher(entrada).matches();
    }

    public boolean g1_validarA07ClaveSegura(String entrada) {
        if (entrada == null || entrada.isEmpty()) {
            return false;
        }
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracterEspecial = false;

        for (char c : entrada.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            } else {
                caracterEspecial = true;
            }
        }
        return mayuscula && minuscula && numero && caracterEspecial;
    }
}
