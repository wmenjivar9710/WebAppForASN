package Algoritmos;

public class OrdenamientoInsercion {
    /**
     * Ordena un arreglo usando el algoritmo de inserción.
     * @param arreglo Arreglo de enteros a ordenar.
     */
    public static void ordenar(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }
}
