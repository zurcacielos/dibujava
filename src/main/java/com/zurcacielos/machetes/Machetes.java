package com.zurcacielos.machetes;

import com.zurcacielos.algoritmos.arbol.NodoDeArbol;

import java.util.*;

// recordatorio rapido de estructuras de datos y algoritmos
public class Machetes {
    // este metodo implementa una búsqueda en anchura de árbol binario
    // el metodo recibe un nodo de árbol y devuelve una lista de listas de enteros
    // que contiene los valores de los nodos de árbol
    // en cada nivel
    public static List<List<Integer>> busquedaEnAnchura(NodoDeArbol raiz) {
        List<List<Integer>> resultado = new ArrayList<>();
        if (raiz == null) {
            return resultado;
        }
        Queue<NodoDeArbol> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            int n = cola.size();
            List<Integer> nivel = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                NodoDeArbol nodo = cola.poll();
                nivel.add(nodo.valor);
                if (nodo.izquierdo != null) {
                    cola.add(nodo.izquierdo);
                }
                if (nodo.derecho != null) {
                    cola.add(nodo.derecho);
                }
            }
            resultado.add(nivel);
        }
        return resultado;
    }





}
