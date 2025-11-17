package Algoritmos;

public class BusquedaSecuencial {
    /**
     * Realiza una búsqueda secuencial en un arreglo.
     * @param arreglo Arreglo de enteros donde buscar.
     * @param objetivo Valor a encontrar.
     * @return Índice del valor si se encuentra, -1 si no.
     */
    public static int buscar(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }
}