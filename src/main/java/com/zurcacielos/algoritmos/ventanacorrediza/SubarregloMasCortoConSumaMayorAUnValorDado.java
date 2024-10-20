package com.zurcacielos.algoritmos.ventanacorrediza;

// conocido en inglés como SmallestSubarrayWithSumGreaterThanAGivenValue
public class SubarregloMasCortoConSumaMayorAUnValorDado {
    // Devuelve la longitud del menor subarreglo con suma mayor al objetivo.
    // Si no hay dicho subarreglo, devuelve longMaximaAExplorar+1
    static int masCortoConSuma(int[] arr, int longMaximaAExplorar, int objetivo)
    {
        // inicializa variables
        int sumaActual = 0, longitudMin = longMaximaAExplorar + 1;

        // inicializa posicion de dedos
        int izquierdo = 0, derecho = 0;

        // mientras derecho pueda moverse a la derecha
        while (derecho < longMaximaAExplorar) {
            // agregar elementos en tanto la suma sea menor igual al objetivo, y mover derecho
            while (sumaActual <= objetivo && derecho < longMaximaAExplorar)
                sumaActual += arr[derecho++];

            // si la suma se hizo más grande que el objetivo
            while (sumaActual > objetivo && izquierdo < longMaximaAExplorar) {
                // actualizar longitud minima si es necesario
                if (derecho - izquierdo < longitudMin)
                    longitudMin = derecho - izquierdo;

                // remover elemento del inicio y mover izquierdo
                sumaActual -= arr[izquierdo++];
            }
        }
        return longitudMin;
    }

    // Rutina principal que testea la función principal
    public static void main(String[] args)
    {
        String mensajeDeError = "No se encontro un subarreglo que cumpla las condiciones";
        int[] arr1 = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        int n1 = arr1.length;
        int res1 = masCortoConSuma(arr1, n1, x);
        if (res1 == n1 + 1)
            System.out.println(mensajeDeError);
        else
            System.out.println(res1);

        int[] arr2 = { 1, 10, 5, 2, 7 };
        int n2 = arr2.length;
        x = 9;
        int res2 = masCortoConSuma(arr2, n2, x);
        if (res2 == n2 + 1)
            System.out.println(mensajeDeError);
        else
            System.out.println(res2);

        int[] arr3
                = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
        int n3 = arr3.length;
        x = 280;
        int res3 = masCortoConSuma(arr3, n3, x);
        if (res3 == n3 + 1)
            System.out.println(mensajeDeError);
        else
            System.out.println(res3);
    }
}
