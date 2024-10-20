package com.zurcacielos.algoritmos.conjuntodispersivo;

import java.util.HashSet;

public class ContieneDuplicado {
    // esta funcion recorre un arreglo de enteros y devuelve verdadero si contiene al menos un
    // n[umero duplicado, falso en caso contrario
    public static boolean contieneDuplicado(int[] nums) {
        // crea un conjunto dispersivo para guardar los elementos
        HashSet<Integer> conjunto = new HashSet<>();
        // recorre el arreglo
        for (int num : nums) {
            // si el elemento ya está en el conjunto, devuelve verdadero
            if (conjunto.contains(num)) {
                return true;
            }
            // si no, guarda el elemento en el conjunto
            conjunto.add(num);
        }
        // si no se encontraron duplicados, devuelve falso
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 6, 2, 7, 11, 15 };
        System.out.println(contieneDuplicado(nums));

        int[] nums2 = { 10, 6, 2, 7, 11, 15, 11 };
        System.out.println(contieneDuplicado(nums2));
    }
}
