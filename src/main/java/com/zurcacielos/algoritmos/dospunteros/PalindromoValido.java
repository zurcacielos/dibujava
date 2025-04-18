package com.zurcacielos.algoritmos.dospunteros;

// Ingles: ValidPalindrome - LeetCode 125
public class PalindromoValido {

    // este metodo deja solo letras o digitos, y compara esa cadena con si misma invertida
    // usamos la funcion isLetterOrDigit
    // O(n) O(n)
    public boolean esPalindromoInversion(String s) {
        StringBuilder nuevaCadena = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                nuevaCadena.append(Character.toLowerCase(c));
            }
        }
        return nuevaCadena.toString().equals(nuevaCadena.reverse().toString());
    }

    // solución optima con dos punteros
    // O(n) O(1)
    public static boolean esPalindromo(String s) {
        int izq = 0, der = s.length() - 1;

        while (izq < der) {
            // Saltear caracteres inválidos evitando que los punteros estén sobre ellos.
            while (izq < der && !alphaNum(s.charAt(izq))) {
                izq++;
            }
            while (der > izq && !alphaNum(s.charAt(der))) {
                der--;
            }
            if (Character.toLowerCase(s.charAt(izq)) != Character.toLowerCase(s.charAt(der))) {
                return false;
            }
            izq++; der--; // siempre acercar los punteros antes de la próxima vuelta
        }
        return true;
    }

    // esto es más performante
    public static boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(a + " : " + esPalindromo(a));

        a = "abcdcba5";
        System.out.println(a + " : " + esPalindromo(a));

        a = "abcdedcba";
        System.out.println(a + " : " + esPalindromo(a));
    }
}