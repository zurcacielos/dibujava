package com.zurcacielos.java;

import java.text.Normalizer;

public class CompararSinAcentos {
    public static void main(String[] args) {
        String palabra1 = "canción";
        String palabra2 = "cancion";

        // Normalizamos y removemos diacríticos
        String palabra1Normalizada = removerDiacriticos(palabra1);
        String palabra2Normalizada = removerDiacriticos(palabra2);

        // Comparar sin importar diacríticos
        if (palabra1Normalizada.equalsIgnoreCase(palabra2Normalizada)) {
            System.out.println("Las palabras son iguales (ignorando acentos).");
        } else {
            System.out.println("Las palabras son diferentes.");
        }
    }

    // Método para normalizar y remover diacríticos
    public static String removerDiacriticos(String palabra) {
        // Normalizar la cadena
        String normalizada = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        // Remover diacríticos (caracteres no ASCII)
        return normalizada.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}

