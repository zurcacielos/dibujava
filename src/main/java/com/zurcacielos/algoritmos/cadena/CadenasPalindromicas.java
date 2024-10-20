package com.zurcacielos.algoritmos.cadena;

// conocido en inglés como PalindromicSubstrings
public class CadenasPalindromicas {
    // devuelve la cantidad de subcadenas que son palíndromos
    // expandiendo desde el centro
    public static int subcadenasPalindromicas(String s) {
        int n = s.length();
        int contador = 0;
        for (int i = 0; i < n; i++) {
            // se calculan 2 longitudes
            int largoImpar = expandirDesdeCentro(s, i, i); // palíndromos de longitud impar, con un solo caracter en el centro
            int largoPar = expandirDesdeCentro(s, i, i + 1); // palíndromos de longitud par, con dos caracteres en el centro
            contador += largoImpar + largoPar;
        }
        return contador;
    }

    // función auxiliar para expandir desde el centro hacia los extremos para
    // contar el número de subcadenas palindrómicas
    public static int expandirDesdeCentro(String s, int izq, int der) {
        int contador = 0;
        while (izq >= 0 && der < s.length() && s.charAt(izq) == s.charAt(der)) {
            izq--;
            der++;
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subcadenasPalindromicas(s));

        String s2 = "aaa";
        System.out.println(subcadenasPalindromicas(s2));
    }
}
