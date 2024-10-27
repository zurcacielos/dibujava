package com.zurcacielos.algoritmos.programaciondinamica;

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
        // i es la cantidad para la cual se está calculando el número mínimo de monedas.
        for (int cantActual = 1; cantActual <= cantidad; cantActual++) {
            dp[cantActual] = Integer.MAX_VALUE;
            // recorre todas las denominaciones de monedas para
            // determinar cuál es la cantidad mínima de monedas necesarias
            // para formar la cantidad cantActual, solo probando monedas menores a cantActual
            for (int j = 0; j < monedas.length; j++) {
                int monedaActual = monedas[j];
                // número mínimo de monedas necesarias para formar la cantidad restante (cant - monedaActual).
                int monedasNecesariasParaCantRestante = dp[cantActual - monedaActual];
                if (monedaActual < cantActual && monedasNecesariasParaCantRestante != Integer.MAX_VALUE) {
                    // número mínimo de monedas necesarias para formar la cantidad actual
                    dp[cantActual] = Math.min(dp[cantActual], monedasNecesariasParaCantRestante + 1);
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
