package com.zurcacielos.algoritmos.dospunteros;

public class SumaDe3 {
    // Esta función recorre un arreglo de enteros ordenados y devuelve el índice de los
    // tres elementos que suman el objetivo. Si no los encuentra, devuelve null
    // utiliza la técnica de la ventana corrediza
    public static int[] tresSuma(int[] nums, int objetivo) {
        // recorre el arreglo
        for (int i = 0; i < nums.length - 2; i++) {
            // inicializa los índices de la ventana, desde el próximo elemento al último
            int izquierdo = i + 1, derecho = nums.length - 1;
            // Recorre el arreglo para encontrar la suma de dos, que más el actual nos dé el objetivo.
            while (izquierdo < derecho) {
                // calcula la suma de los tres elementos
                int suma = nums[i] + nums[izquierdo] + nums[derecho];
                // si la suma es igual al objetivo, devuelve los índices
                if (suma == objetivo) {
                    return new int[] { i, izquierdo, derecho };
                }
                // si la suma es menor al objetivo, mueve el índice izquierdo
                else if (suma < objetivo) {
                    izquierdo++;
                }
                // si la suma es mayor al objetivo, mueve el índice derecho
                else {
                    derecho--;
                }
            }
        }
        // si no se encontraron los índices, devuelve null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 8, 11, 15 };
        int objetivo = 30;
        int[] resultado = tresSuma(nums, objetivo);
        if (resultado != null) {
            System.out.println("[" + resultado[0] + ", " + resultado[1] + ", " + resultado[2] + "]");
        } else {
            System.out.println("No se encontraron los índices");
        }
    }
}
