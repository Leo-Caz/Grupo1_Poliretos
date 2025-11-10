package Figuras;

public class GeneradorFiguras {


    public String figuraF1(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append("\n");
        }
        return sb.toString();
    }


    public String figuraF2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            sb.append("*".repeat(i)).append("\n");
        }
        return sb.toString();
    }


    public String figuraF3(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }


    public String figuraF4(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }


    public String figuraF5(int n) {
        StringBuilder sb = new StringBuilder();
        // parte superior
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }

        for (int i = n - 1; i >= 1; i--) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(2 * i - 1));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String figuraF6(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String figuraF7(int n) {
        StringBuilder sb = new StringBuilder();
        // parte superior
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*");
            if (i > 1) {
                sb.append(" ".repeat(2 * i - 3));
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = n - 1; i >= 1; i--) {
            sb.append(" ".repeat(n - i));
            sb.append("*");
            if (i > 1) {
                sb.append(" ".repeat(2 * i - 3));
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String figuraF8(int n) {
        StringBuilder sb = new StringBuilder();
        int espacios = 0;
        for (int i = n; i >= 1; i--) {
            sb.append(" ".repeat(espacios));
            sb.append("*".repeat(i));
            sb.append("\n");
            espacios++;
        }
        return sb.toString();
    }

    public String figuraF9(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                sb.append("*".repeat(n));
            } else {
                sb.append("*");
                sb.append(" ".repeat(n - 2));
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public String figuraF10(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i));
            for (int j = 0; j < 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
