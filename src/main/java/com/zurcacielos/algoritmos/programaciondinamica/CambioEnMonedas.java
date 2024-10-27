package com.zurcacielos.algoritmos.programaciondinamica;

import java.util.Arrays;

// leetcode 322 cambio en monedas
// En programación dinámica, la variable dp (abreviatura de "dynamic programming")
// se utiliza como una tabla o arreglo para almacenar los resultados de subproblemas
// ya resueltos. Esto permite evitar el cálculo repetido de los mismos subproblemas,
// mejorando así la eficiencia del algoritmo.
public class CambioEnMonedas {
    // Devuelve el mínimo número de monedas para dar un cambio
    // Utiliza un enfoque de programación dinámica de abajo hacia arriba.
    // En este enfoque, la función comienza resolviendo los subproblemas más pequeños
    // y utiliza sus soluciones para construir soluciones a subproblemas más grandes
    public static int cambio(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] monedas = {1, 2, 5};
        int cantidad = 7;
        System.out.println(cambio(monedas, cantidad));
    }
}
