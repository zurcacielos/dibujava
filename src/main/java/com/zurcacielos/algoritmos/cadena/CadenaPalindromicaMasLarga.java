package com.zurcacielos.algoritmos.cadena;

// conocido en inglés como LongestPalindromicSubstring
// estrategia:
// se recorre cada elemento, se expande hacia su derecha e izquierda
// también se toma el próximo elemento y si es igual se expande a la derecha e izquierda de ambos
// y la longitud más larga gana.
public class CadenaPalindromicaMasLarga {
    // Devuelve la cadena palindrómica más larga en una cadena usando dos punteros
    public static String cadenaPalindromicaMasLarga(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        int inicio = 0, fin = 0; // punteros para guardar los índices de la cadena palindrómica más larga
        for (int i = 0; i < n; i++) {
            // se calculan 2 longitudes
            int largoImpar = expandirDesdeCentro(s, i, i); // palíndromos de longitud impar, con un solo caracter en el centro
            int largoPar = expandirDesdeCentro(s, i, i + 1); // palíndromos de longitud par, con dos caracteres en el centro
            int largo = Math.max(largoImpar, largoPar); // se toma la longitud máxima
            // si la longitud es mayor que la longitud actual, se actualizan los índices
            if (largo > fin - inicio) {
                inicio = i - (largo - 1) / 2;
                fin = i + largo / 2;
            }
        }
        return s.substring(inicio, fin + 1);
    }

    // función auxiliar para expandir desde el centro hacia los extremos para
    // encontrar la longitud de la cadena palindrómica
    public static int expandirDesdeCentro(String s, int izq, int der) {
        while (izq >= 0 && der < s.length() && s.charAt(izq) == s.charAt(der)) {
            izq--;
            der++;
        }
        return der - izq - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(cadenaPalindromicaMasLarga(s));

        String s2 = "cbbd";
        System.out.println(cadenaPalindromicaMasLarga(s2));
    }
}
