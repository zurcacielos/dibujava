package com.zurcacielos.algoritmos.retroceso;

// Leetcode 79 - Buscar palabra en grilla
public class BuscarPalabraEnGrilla {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visitado = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean encontrado = bep(board, visitado, i, j, word, 0);
                if (encontrado) {
                    return true;
                }
            }
        }
        return false;
    }

    // Busqueda en profundiad - retroceso
    private boolean bep(char[][] board, boolean[][] visitado, int i, int j, String word, int index) {
        // si llego al final de la palabra entonces la encontró
        if (index == word.length()) {
            return true;
        }
        // si se sale de los límites de la grilla o ya visitó la celda o la letra no coincide
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visitado[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        // marcar la celda como visitada
        visitado[i][j] = true;
        // buscar en las 4 direcciones
        if (bep(board, visitado, i + 1, j, word, index + 1) || bep(board, visitado, i - 1, j, word, index + 1)
                || bep(board, visitado, i, j + 1, word, index + 1) || bep(board, visitado, i, j - 1, word, index + 1)) {
            return true;
        }
        // en ninguna dirección encontró la palabra, entonces desmarcar la celda como no visitada y retornar falso
        visitado[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        BuscarPalabraEnGrilla buscarPalabraEnGrilla = new BuscarPalabraEnGrilla();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(buscarPalabraEnGrilla.exist(board, word));
    }

}
