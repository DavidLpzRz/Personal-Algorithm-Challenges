public class large {

    public static int calcularCaminoMasLargo(int[][] matriz) {
        int suma = matriz[0][0];
        int a = 0;
        int b = 0;
        int ultFila = matriz.length - 1;
        int ultCol = matriz[0].length - 1;

        while (a != ultFila || b != ultCol) {
            if (a == ultFila) {
                b++;
                suma += matriz[a][b];
            }
            else if (b == ultCol) {
                a++;
                suma += matriz[a][b];
            }
            else {
                int derecha = matriz[a][b+1];
                int abajo = matriz[a+1][b];

                if (derecha >= abajo) {
                    suma += derecha;
                    b++;
                } else {
                    suma += abajo;
                    a++;
                }
            }
        }
        
        return suma;
    }

    static void main() {
        int[][] matriz = {
                {2, 3, 1},
                {1, 7, 1},
                {4, 6, 5}
        };

        System.out.println(calcularCaminoMasLargo(matriz));
    }
}
