package com.zurcacielos.algoritmos.programaciondinamica;

// leetcode 322 cambio en monedas
// En programación dinámica, la variable dp (abreviatura de "dynamic programming")
// se utiliza como una tabla o arreglo para almacenar los resultados de subproblemas
// ya resueltos. Esto permite evitar el cálculo repetido de los mismos subproblemas,
// mejorando así la eficiencia del algoritmo.
public class CambioEnMonedas {
    // devuelve el mínimo número de monedas para dar un cambio
    public static int cambio(int[] monedas, int cantidad) {
        int[] dp = new int[cantidad + 1];
        for (int i = 1; i <= cantidad; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < monedas.length; j++) {
                if (i >= monedas[j] && dp[i - monedas[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - monedas[j]] + 1);
                }
            }
        }
        return dp[cantidad] == Integer.MAX_VALUE ? -1 : dp[cantidad];
    }

    public static void main(String[] args) {
        int[] monedas = {1, 2, 5};
        int cantidad = 11;
        System.out.println(cambio(monedas, cantidad));
    }
}
