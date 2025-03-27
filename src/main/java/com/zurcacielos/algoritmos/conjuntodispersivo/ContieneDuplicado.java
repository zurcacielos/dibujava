package com.zurcacielos.algoritmos.conjuntodispersivo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Contains Duplicate - Leetcode 217- Blind 75
public class ContieneDuplicado {
    // esta función recorre un arreglo de enteros y devuelve verdadero si contiene al menos un
    // número duplicado, falso en caso contrario
    public static boolean contieneDuplicado(int[] nums) {
        // crea un conjunto dispersivo para guardar los elementos
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Corta al primer duplicado
            }
        }
        return false;
    }

    // esto hace lo mismo pero es thread safe
    public static boolean contieneDuplicadoSync(int[] nums) {
        Set<Integer> set = Collections.synchronizedSet(new HashSet<>()); // ✔️ Thread-safe
        for (int num : nums) {
            if (!set.add(num)) { // Operación atómica (bloquea el set)
                return true;
            }
        }
        return false;
    }

    // usando streams - paso a paso
    // es thread-safe en forma natural pero no corta al primer duplicado
    public static boolean contieneDuplicadoStreamToSet(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet())
                .size() < nums.length;
    }

    // usando streams
    // es thread-safe en forma natural, pero distinct va a procesar todos los elementos
    public static boolean contieneDuplicadoSyncStreamDistinct(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        int[] numsUnicos = { 10, 6, 2, 7, 11, 15 };
        int[] numsDuplicados = { 10, 6, 2, 7, 11, 15, 11 };

        System.out.println(contieneDuplicado(numsUnicos));
        System.out.println(contieneDuplicado(numsDuplicados));
    }
}
