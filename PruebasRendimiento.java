package Algoritmos;

public class PruebasRendimiento {
    /**
     * Mide el tiempo de ejecución de un algoritmo de ordenamiento.
     */
    public static void medirTiempoOrdenamiento(String nombre, int[] datos, Runnable algoritmo) {
        int[] copia = datos.clone();
        long inicio = System.nanoTime();
        algoritmo.run();
        long fin = System.nanoTime();
        System.out.println(nombre + " - Tiempo: " + (fin - inicio) + " ns");
    }
}