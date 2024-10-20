package com.zurcacielos.algoritmos.medio;

public class ProductoExceptoSiMismo {
    // esta funcion recibe un arreglo de enteros y devuelve un arreglo de enteros con el producto de
    // todos los elementos excepto el mismo en la misma posicion
    // utilizando solo dos iteraciones y sin utilizar division
    public static int[] productoExceptoSiMismo(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; // arreglo de salida

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1]; // producto de los elementos a la izquierda, guardado en array de salida
        }

        int posfijo = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= posfijo; // producto de los elementos a la derecha, multiplicado en el mismo array de salida donde ya estaba el prefijo
            posfijo *= nums[i]; // actualiza el producto de los elementos a la derecha
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] resultado = productoExceptoSiMismo(nums);
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
