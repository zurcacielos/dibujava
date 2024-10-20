package com.zurcacielos.algoritmos.programaciondinamica;

// conocido en inglés como PalindromicSubstrings
public class CadenasPalindromicas {
    // Devuelve la cantidad de subcadenas palíndromas en una cadena
    public static int subcadenasPalindromicas(String s) {
        int n = s.length();
        int contador = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            contador++;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                contador++;
            }
        }
        for (int longitud = 3; longitud <= n; longitud++) {
            for (int i = 0; i < n - longitud + 1; i++) {
                int j = i + longitud - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subcadenasPalindromicas(s));

        String s2 = "aaa";
        System.out.println(subcadenasPalindromicas(s2));
    }
}
