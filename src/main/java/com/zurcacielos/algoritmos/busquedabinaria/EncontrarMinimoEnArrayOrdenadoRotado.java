package com.zurcacielos.algoritmos.busquedabinaria;

// en ingles Find Minimum In Rotated Sorted Array
// l = izquierdo, r = derecho, m = medio
public class EncontrarMinimoEnArrayOrdenadoRotado {
    public int encontrarMinimo(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        // aca mueve primero el l hacia el m+1
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(new EncontrarMinimoEnArrayOrdenadoRotado().encontrarMinimo(nums));

        // aca mueve primero el r hacia el m
        nums = new int[] {0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(new EncontrarMinimoEnArrayOrdenadoRotado().encontrarMinimo(nums));
    }
}
