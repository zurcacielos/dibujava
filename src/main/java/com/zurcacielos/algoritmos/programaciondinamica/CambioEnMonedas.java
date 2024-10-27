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
    public static int cambio(int[] monedas, int cantidad) {
        int[] dp = new int[cantidad + 1];
        Arrays.fill(dp, cantidad + 1);
        dp[0] = 0;
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 0; j < monedas.length; j++) {
                if (monedas[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - monedas[j]] + 1);
                }
            }
        }
        return dp[cantidad] > cantidad ? -1 : dp[cantidad];
    }

    public static void main(String[] args) {
        int[] monedas = {1, 2, 5};
        int cantidad = 7;
        System.out.println(cambio(monedas, cantidad));
    }
}
