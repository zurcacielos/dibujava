package com.zurcacielos.algoritmos.arreglo;

/*
Este algoritmo recorre el arreglo una vez para encontrar la mayor diferencia entre dos elementos, donde el segundo elemento es mayor que el primero. La estrategia se basa en mantener un seguimiento del valor mínimo encontrado hasta el momento y calcular la diferencia entre el elemento actual y ese valor mínimo en cada iteración. Si esta diferencia es mayor que la máxima diferencia encontrada hasta ese punto, actualiza el valor de la máxima diferencia. Además, si el elemento actual es menor que el valor mínimo guardado, actualiza el valor mínimo. De esta forma, el algoritmo asegura que siempre considera las mejores combinaciones posibles de valores dentro del arreglo en un solo recorrido, logrando una eficiencia de O(n).

 No serviría recorrer el arreglo de derecha a izquierda. La razón principal es que el objetivo del algoritmo es mantener el valor mínimo encontrado hasta el punto actual (mientras recorres el arreglo de izquierda a derecha) y luego comparar cada valor con ese mínimo para calcular la diferencia.
 */
public class MaximaDiferenciaEntreDosElementos {
    // max difference in array
    public static int diferenciaMaxima(int[] a) {
        int n = a.length;
        int difMax = a[1] - a[0];
        int valorMinimo = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - valorMinimo > difMax) {
                difMax = a[i] - valorMinimo;
            }
            if (a[i] < valorMinimo) {
                valorMinimo = a[i];
            }
        }
        return difMax;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(diferenciaMaxima(nums));
    }
}