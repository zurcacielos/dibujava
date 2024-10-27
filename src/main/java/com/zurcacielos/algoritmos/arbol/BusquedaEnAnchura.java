package com.zurcacielos.algoritmos.arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Arbol binario - Recorrido por niveles - BFS - Leetcode 102
public class BusquedaEnAnchura {
    // definicion del nodo de arbol binario
    public static class NodoDeArbol {
        int valor;
        NodoDeArbol izquierdo;
        NodoDeArbol derecho;

        NodoDeArbol() {
        }

        NodoDeArbol(int valor) {
            this.valor = valor;
        }

        NodoDeArbol(int valor, NodoDeArbol izquierdo, NodoDeArbol derecho) {
            this.valor = valor;
            this.izquierdo = izquierdo;
            this.derecho = derecho;
        }
    }

    // BFS
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

    public static void main(String[] args) {
        NodoDeArbol raiz = new NodoDeArbol(3);
        raiz.izquierdo = new NodoDeArbol(9);
        raiz.derecho = new NodoDeArbol(20);
        raiz.derecho.izquierdo = new NodoDeArbol(15);
        raiz.derecho.derecho = new NodoDeArbol(7);
        List<List<Integer>> resultado = busquedaEnAnchura(raiz);
        for (List<Integer> nivel : resultado) {
            for (int valor : nivel) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
