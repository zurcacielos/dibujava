package com.zurcacielos.algoritmos.mapadispersivo;

import java.util.HashMap;
import java.util.stream.IntStream;

public class SumaDeDos {
    // Esta función recorre un arreglo de enteros y devuelve el índice de los
    // dos elementos que suman el objetivo. Si no los encuentra, devuelve null
    public static int[] dosSuma(int[] nums, int objetivo) {
        // crea un mapa dispersivo para guardar los elementos y sus índices
        HashMap<Integer, Integer> mapa = new HashMap<>();
        // recorre el arreglo
        for (int i = 0; i < nums.length; i++) {
            // calcula el complemento del elemento actual
            int complemento = objetivo - nums[i];
            // si el complemento ya está en el mapa, devuelve los índices
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            // si no, guarda el elemento y su índice en el mapa
            mapa.put(nums[i], i);
        }
        // si no se encontraron los índices, devuelve null
        return null;
    }

    /**
     * Hace lo mismo pero con streams.
     * Sería riesgoso usar un map y modificarlo dentro del stream por thread safety
     * pero al ser una función estática, y no de instancia compartida, cada código
     * que lo llama corre en su propio thread.
     */
    public static int[] twoSumStream(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return IntStream.range(0, nums.length)
                .mapToObj(i -> {
                    int comp = target - nums[i];
                    if (map.containsKey(comp)) {
                        return new int[]{map.get(comp), i};
                    }
                    map.put(nums[i], i);
                    return null;
                })
                .filter(result -> result != null)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        int[] nums = {10, 6, 2, 7, 11, 15};
        int objetivo = 9;
        int[] resultado = dosSuma(nums, objetivo);
        if (resultado != null) {
            System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron los índices");
        }
    }

}
