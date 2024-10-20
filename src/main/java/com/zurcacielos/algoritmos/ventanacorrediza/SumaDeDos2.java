package com.zurcacielos.algoritmos.ventanacorrediza;

public class SumaDeDos2 {
    // Esta función recorre un arreglo de enteros ordenados y devuelve el índice de los
    // dos elementos que suman el objetivo. Si no los encuentra, devuelve null
    // utiliza la técnica de la ventana corrediza
    public static int[] dosSuma(int[] nums, int objetivo) {
        // inicializa los índices de la ventana
        int izquierdo = 0, derecho = nums.length - 1;
        // recorre el arreglo
        while (izquierdo < derecho) {
            // calcula la suma de los elementos en los índices izquierdo y derecho
            int suma = nums[izquierdo] + nums[derecho];
            // si la suma es igual al objetivo, devuelve los índices
            if (suma == objetivo) {
                return new int[] { izquierdo, derecho };
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
        // si no se encontraron los índices, devuelve null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int objetivo = 9;
        int[] resultado = dosSuma(nums, objetivo);
        if (resultado != null) {
            System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron los índices");
        }
    }

}
