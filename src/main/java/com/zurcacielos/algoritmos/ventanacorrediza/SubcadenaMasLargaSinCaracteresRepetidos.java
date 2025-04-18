package com.zurcacielos.algoritmos.ventanacorrediza;

import java.util.HashSet;

public class SubcadenaMasLargaSinCaracteresRepetidos {
    // Método que encuentra la subcadena más larga sin caracteres repetidos
    // usando la técnica de ventana corrediza con un conjunto dispersivo
    public static int longitudDeLaSubcadenaMasLarga(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(longitudDeLaSubcadenaMasLarga(s1)); // 3

        String s2 = "bbbbb";
        System.out.println(longitudDeLaSubcadenaMasLarga(s2)); // 1

        String s3 = "pwwkew";
        System.out.println(longitudDeLaSubcadenaMasLarga(s3)); // 3
    }
}
