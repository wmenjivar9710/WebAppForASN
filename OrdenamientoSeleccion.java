package Algoritmos;

public class OrdenamientoSeleccion {
    /**
     * Ordena un arreglo usando el algoritmo de selección.
     * @param arreglo Arreglo de enteros a ordenar.
     */
    public static void ordenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            int temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}