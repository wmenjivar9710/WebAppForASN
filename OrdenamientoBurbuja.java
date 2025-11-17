package Algoritmos;

public class OrdenamientoBurbuja {
    /**
     * Ordena un arreglo usando el algoritmo de burbuja.
     * @param arreglo Arreglo de enteros a ordenar.
     */
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
