public class Programa2_Ordenacion2D {

    public static void main(String[] args) {
        int[][] matriz = {
            {9, 2, 7},
            {4, 8, 1},
            {6, 3, 5}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int filaAOrdenar = 1; // Ordenar la segunda fila (índice 1)
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        imprimirMatriz(matriz);
    }

    public static void ordenarFila(int[][] matriz, int fila) {
        if (fila >= 0 && fila < matriz.length) {
            Arrays.sort(matriz[fila]);
        } else {
            System.out.println("La fila especificada no existe.");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
