package com.zurcacielos.algoritmos.pila;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Paréntesis válidos
 * <p>
 * Se le proporciona una cadena 's' que contiene los siguientes caracteres: '(', ')', '{', '}', '[' y ']'.
 * <p>
 * La cadena de entrada 's' es válida si y solo si:
 * 1. Cada paréntesis de apertura se cierra con el mismo tipo de paréntesis
 * 2. Los paréntesis de apertura se cierran en el orden correcto
 * 3. Cada paréntesis de cierre tiene un paréntesis de apertura correspondiente del mismo tipo
 * <p>
 * Devuelve 'true' si 's' es una cadena válida y 'false' en caso contrario.
 * <p>
 * Ejemplo 1:
 * Entrada: s = "[]"
 * Salida: true
 * <p>
 * Ejemplo 2:
 * Entrada: s = "([{}])"
 * Salida: true
 * <p>
 * Ejemplo 3:
 * Entrada: s = "[(])"
 * Salida: false
 * Explicación: Los paréntesis no se cierran en el orden correcto.
 * <p>
 * Restricciones:
 * 1 <= s.length <= 1000
 * 's' consiste únicamente en paréntesis: '()[]{}'
 */
public class ParentesisValidos {
    // Espacio/Tiempo: O(N^2), O(N)
    public boolean esValidoFuerzaBruta(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    // Espacio/Tiempo: O(N), O(N)
    public boolean esValido(String s) {
        Stack<Character> pila = new Stack<>();
        Map<Character, Character> cerradoAbierto = new HashMap<>();
        cerradoAbierto.put(')', '(');
        cerradoAbierto.put(']', '[');
        cerradoAbierto.put('}', '{');

        // por cada caracter, si es de cierre, el ultimo de la pila debe ser el de apertura
        // si la pila esta vaca o no es el mismo, no es valido
        for (char c : s.toCharArray()) {
            if (cerradoAbierto.containsKey(c)) {
                if (!pila.isEmpty() && pila.peek() == cerradoAbierto.get(c)) {
                    pila.pop();
                } else {
                    return false;
                }
            } else {
                pila.push(c);
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(new ParentesisValidos().esValido(s));
    }

}
