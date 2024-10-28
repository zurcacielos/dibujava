package com.zurcacielos.java;

public class ExpresionesRegulares {
    // ejemplo del uso de expresiones regulares en java
    public static void main(String[] args) {
        String s = "hola mundo";
        // reemplazar todas las ocurrencias de la letra 'o' por 'x'
        String resultado = s.replaceAll("o", "x");
        System.out.println(resultado);

        // reemplazar todas las ocurrencias de la letra 'o' por 'x' y 'a' por 'y'
        resultado = s.replaceAll("[oa]", "xy");
        System.out.println(resultado);

        // reemplazar todas las ocurrencias de la letra 'o' por 'x' y 'a' por 'y'
        // pero solo si la letra 'o' o 'a' está seguida de una 'l'
        resultado = s.replaceAll("[oa]l", "xy");
        System.out.println(resultado);

        // reemplazar todas las ocurrencias de la letra 'o' por 'x' y 'a' por 'y'
        // pero solo si la letra 'o' o 'a' está seguida de una 'l' o 'm'
        resultado = s.replaceAll("[oa][lm]", "xy");
        System.out.println(resultado);

    }

    // este método usa pattern.compile y pattern.match de java.util.regex
    // para validar si una cadena de texto es un numero entero
    public static boolean esEntero(String s) {
        // crea un patrón que busca un número entero
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("^-?\\d+$");
        // crea un matcher con el texto a validar
        java.util.regex.Matcher m = p.matcher(s);
        // devuelve si el texto coincide con el patrón
        return m.matches();
    }

    // este método usa regex para remover de una cadena los espacios, y símbolos - + y números
    public static String removerEspaciosYSimbolos(String s) {
        // reemplaza todos los espacios, símbolos - + y números por una cadena vacía
        return s.replaceAll("[\\s\\-\\+0-9]", "");
    }


}
