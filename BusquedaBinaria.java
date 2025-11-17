package Algoritmos;

import java.util.Arrays;

public class BusquedaBinaria {
    /**
     * Realiza una búsqueda binaria en un arreglo ordenado.
     * @param arreglo Arreglo de enteros (será ordenado internamente).
     * @param objetivo Valor a encontrar.
     * @return Índice del valor si se encuentra, -1 si no.
     */
    public static int buscar(int[] arreglo, int objetivo) {
        Arrays.sort(arreglo); // Asegura que esté ordenado
        int izquierda = 0, derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arreglo[medio] == objetivo) return medio;
            if (arreglo[medio] < objetivo) izquierda = medio + 1;
            else derecha = medio - 1;
        }
        return -1;
    }
}
