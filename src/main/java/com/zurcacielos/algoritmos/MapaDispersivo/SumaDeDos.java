package com.zurcacielos.algoritmos.MapaDispersivo;

import java.util.HashMap;

public class SumaDeDos {
    // Ésta función recorre un arreglo de enteros y devuelve el índice de los
    // dos elementos que suman el objetivo. Si no los encuentra, devuelve null
    public static int[] dosSuma(int[] nums, int objetivo) {
        // crea un mapa dispersivo para guardar los elementos y sus índices
        HashMap<Integer, Integer> mapa = new HashMap<>();
        // recorre el arreglo
        for (int i = 0; i < nums.length; i++) {
            // calcula el complemento del elemento actual
            int complemento = objetivo - nums[i];
            // si el complemento ya está en el mapa, devuelve los indices
            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }
            // si no, guarda el elemento y su indice en el mapa
            mapa.put(nums[i], i);
        }
        // si no se encontraron los indices, devuelve null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 6, 2, 7, 11, 15 };
        int objetivo = 9;
        int[] resultado = dosSuma(nums, objetivo);
        if (resultado != null) {
            System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron los indices");
        }
    }

}
