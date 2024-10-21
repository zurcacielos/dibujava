package com.zurcacielos.algoritmos.mapadispersivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KElementosMasFrecuentesEnLaLista {
    // esta función recorre un arreglo de enteros y devuelve los k elementos más
    // frecuentes en la lista, utilizando ordenamiento por cubetas/baldes (bucket sort)
    // complejidad de tiempo: O(n)
    // complejidad de espacio: O(n)
    public static int[] kElementosMasFrecuentes(int[] nums, int k) {
        // crea un mapa dispersivo para guardar los elementos y sus frecuencias
        HashMap<Integer, Integer> mapa = new HashMap<>();
        // 1. Creación del mapa de frecuencias
        for (int num : nums) {
            // si el elemento ya está en el mapa, incrementa su frecuencia
            if (mapa.containsKey(num)) {
                mapa.put(num, mapa.get(num) + 1);
            }
            // si no, guarda el elemento y su frecuencia en el mapa
            else {
                mapa.put(num, 1);
            }
        }

        // 2. Organización en cubetas/baldes
        // crea un arreglo de listas para guardar los elementos por frecuencia
        // se crea del tamaño de la lista más uno, para incluir el "frecuencia cero"
        // no va a haber más frecuencias/baldes que la cantidad de números
        List<Integer>[] baldes = new List[nums.length + 1];
        // recorre el mapa
        for (int num : mapa.keySet()) {
            // obtiene la frecuencia del elemento
            int frecuencia = mapa.get(num);
            // si la lista de frecuencias en la posición de la frecuencia es nula, la
            // inicializa
            if (baldes[frecuencia] == null) {
                baldes[frecuencia] = new ArrayList<>();
            }
            // agrega el elemento a la lista de frecuencias
            baldes[frecuencia].add(num);
        }
        // crea un arreglo para guardar los k elementos más frecuentes
        int[] resultado = new int[k];
        // inicializa el índice del resultado
        int indice = 0;
        // recorre las cubetas/baldes de frecuencias en orden inverso
        for (int i = baldes.length - 1; i >= 0; i--) {
            // si la lista de frecuencias en la posición i no es nula
            if (baldes[i] != null) {
                // recorre los elementos en la lista de frecuencias
                for (int num : baldes[i]) {
                    // agrega el elemento al resultado
                    resultado[indice++] = num;
                    // si ya se han agregado k elementos al resultado, devuelve el resultado
                    if (indice == k) {
                        return resultado;
                    }
                }
            }
        }
        // si no se encontraron los k elementos más frecuentes, devuelve null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] resultado = kElementosMasFrecuentes(nums, k);
        if (resultado != null) {
            for (int i = 0; i < resultado.length; i++) {
                System.out.print(resultado[i] + " ");
            }
        } else {
            System.out.println("No se encontraron los elementos");
        }
    }

}
