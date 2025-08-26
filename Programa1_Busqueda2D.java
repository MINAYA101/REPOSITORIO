public class Programa1_Busqueda2D {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int valorBuscado = 5;
        int[] posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("El valor " + valorBuscado + " se encontró en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en la matriz.");
        }

        valorBuscado = 10;
        posicion = buscarValor(matriz, valorBuscado);

        if (posicion[0] != -1) {
            System.out.println("El valor " + valorBuscado + " se encontró en la posición: [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encontró en la matriz.");
        }
    }

    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
