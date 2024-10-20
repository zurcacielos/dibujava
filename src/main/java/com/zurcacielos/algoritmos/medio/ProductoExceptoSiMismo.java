package com.zurcacielos.algoritmos.medio;

public class ProductoExceptoSiMismo {
    // esta función recibe un arreglo de enteros y devuelve un arreglo de enteros con el producto de
    // todos los elementos excepto el mismo en la misma posición
    // utilizando solo dos iteraciones y sin utilizar division
    public static int[] productoExceptoSiMismo(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; // arreglo de salida

        // 1. calcula los prefijos izquierdos, es decir, el producto de los elementos a la izquierda
        // de cada elemento
        res[0] = 1; // el primer prefijo es 1, pues no hay nada a la izquierda del 1.er elemento
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1]; // producto prefijo izquierdo por elemento actual
        }

        // 2. calcula los posfijos derechos, es decir, el producto de los elementos a la derecha de
        // cada elemento, y multiplica lo que ya está almacenado en res, para obtener el resultado
        // final "en el lugar"
        int posfijo = 1; // primer posfijo en 1, pues no hay nada a la derecha del último elemento
        // recorre de derecha a izquierda
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= posfijo; // producto del elemento actual, o sea prefijo izquierdo, por postfijo de la derecha
            posfijo *= nums[i]; // calcula posfijo de la derecha
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
