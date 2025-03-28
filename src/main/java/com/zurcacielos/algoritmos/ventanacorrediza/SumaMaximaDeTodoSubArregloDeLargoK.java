package com.zurcacielos.algoritmos.ventanacorrediza;

public class SumaMaximaDeTodoSubArregloDeLargoK {

    //Complejidad de tiempo: O(n), donde n es el tamaño del arreglo de entrada.
    //Complejidad de espacio: O(1)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largoVen = 3; // largo fijo ventana
        int largoArreglo = arr.length;
        int sumaVentana = 0; // suma de la ventana actual

        // calcula suma de la primer ventana
        for (int i = 0; i < largoVen; i++) {
            sumaVentana += arr[i];
        }

        // inicializa suma máxima
        int sumaMaxima = sumaVentana;

        // desplaza la ventana de largo fijo hacia la derecha
        for (int derecho = largoVen; derecho < largoArreglo; derecho++) {
            // calcula el valor de nueva ventana
            // le suma el elemento que entra a la ventana por la derecha
            // y le resta el que quedo fuera a la izquierda
            sumaVentana += arr[derecho] - arr[derecho - largoVen];
            // si la suma es mayor que la que ya teníamos, la guarda
            sumaMaxima = Math.max(sumaMaxima, sumaVentana);
        }
        System.out.println(sumaMaxima);
    }

}
