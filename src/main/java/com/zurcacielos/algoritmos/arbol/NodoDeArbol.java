package com.zurcacielos.algoritmos.arbol;

// definicion del nodo de arbol binario
public class NodoDeArbol {
    public int valor;
    public NodoDeArbol izquierdo;
    public NodoDeArbol derecho;

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
