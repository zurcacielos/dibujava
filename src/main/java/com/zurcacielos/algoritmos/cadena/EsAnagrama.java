package com.zurcacielos.algoritmos.cadena;

import java.util.Arrays;

/**
 * Un anagrama es una cadena que contiene exactamente los mismos caracteres que otra cadena,
 * pero el orden de los caracteres puede ser diferente.
 * Ejemplo 1:
 * Entrada: s = "racecar", t = "carrace"
 * Salida: true
 * Ejemplo 2:
 * Entrada: s = "jar", t = "jam"
 * Salida: false
 */
public class EsAnagrama {

    // Ordena y compara.
    // Tiempo O(n log(n))
    // Espacio O(n) por los array de caracteres sChars, tChars
    // Asumimos el ordenamiento no lleva más espacio.
    public static boolean esAnagrama(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    // Tiempo O(n)
    // Espacio O(1) ya que el array cantidades es de tamaño fijo
    public static boolean esAnagramaOptimo(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] cantidades = new int[26]; // letras minúsculas en ingles

        for (int i = 0; i < s.length(); i++) {
            // A uno le resta a otro le suma
            cantidades[s.charAt(i) - 'a']++; // le resta a en ascii para enviarlo a base cero
            cantidades[t.charAt(i) - 'a']--;
        }

        for (int c : cantidades) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String s2 = "gramana";
        String noEsAnagrama = "graman"; // este no es anagrama de los otros

        System.out.println(esAnagrama(s, s2));
        System.out.println(esAnagrama(s, noEsAnagrama));

        System.out.println(esAnagramaOptimo(s, s2));
        System.out.println(esAnagramaOptimo(s, noEsAnagrama));

    }
}
