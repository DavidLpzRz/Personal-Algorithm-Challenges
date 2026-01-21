import java.util.*;

public class sudoku {

    public static boolean verificarSudoku(int[][] tablero) {
        boolean verifi = true;
        HashSet<Integer> trunum = new HashSet<>();
        Collections.addAll(trunum, 1,2,3,4,5,6,7,8,9);

        HashSet<Integer> numeros = new HashSet<>();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                numeros.add(tablero[i][j]);
            }
            if (!numeros.equals(trunum)) {
                verifi = false;
            }
            numeros.clear();
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                numeros.add(tablero[j][i]);
            }
            if (!numeros.equals(trunum)) {
                verifi = false;
            }
            numeros.clear();
        }

        for (int k = 0; k < tablero.length; k+=3) {
            for (int i = 0; i < tablero.length; i+=3) {
                for (int j = 0; j < 3; j++) {
                    numeros.add(tablero[i][j+k]);
                    numeros.add(tablero[i+1][j+k]);
                    numeros.add(tablero[i+2][j+k]);
                }
                if (!numeros.equals(trunum)) {
                    verifi = false;
                }
                numeros.clear();
            }
        }
        return verifi;
    }

    public static void main(String[] args) {
        int[][] tablero = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9} };

        System.out.println(verificarSudoku(tablero));
    }
}
