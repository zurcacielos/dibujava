package com.zurcacielos.algoritmos.ventanacorrediza;

/**
 * Se te proporciona un array de enteros 'prices' donde prices[i] es el precio de moneda en el día i.
 *
 * Puedes elegir un único día para comprar un Moneda y un día diferente en el futuro para venderlo.
 *
 * Devuelve el máximo beneficio que puedes obtener. Puedes elegir no realizar ninguna transacción,
 * en cuyo caso el beneficio sería 0.
 *
 * Ejemplo 1:
 *
 * Input: prices = [10,1,5,6,7,1]
 * Output: 6
 * Explicación: Comprar prices[1] y vender prices[4], beneficio = 7 - 1 = 6.
 *
 * Ejemplo 2:
 *
 * Input: prices = [10,8,7,5,2]
 * Output: 0
 * Explicación: No se pueden realizar transacciones rentables, por lo que el beneficio máximo es 0.
 *
 * Restricciones:
 * 1 <= prices.length <= 100
 * 0 <= prices[i] <= 100
 */
public class MejorMomentoParaComprarYVenderAcciones {
    public static int maxProfit(int[] precios) {
        int l = 0, r = 1;
        int maxP = 0;

        while (r < precios.length) {
            if (precios[l] < precios[r]) {
                int profit = precios[r] - precios[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = {10,1,7,6,7,1};
        System.out.println(maxProfit(prices));
    }
}
