package Algoritmos;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] datosPequenos = generarDatos(10);
        int[] datosMedianos = generarDatos(1000);
        int[] datosGrandes = generarDatos(100000);

        System.out.println("=== PRUEBAS CON DATOS PEQUEÑOS ===");
        ejecutarPruebas(datosPequenos);

        System.out.println("\n=== PRUEBAS CON DATOS MEDIANOS ===");
        ejecutarPruebas(datosMedianos);

        System.out.println("\n=== PRUEBAS CON DATOS GRANDES ===");
        ejecutarPruebas(datosGrandes);
    }

    private static void ejecutarPruebas(int[] datos) {
        PruebasRendimiento.medirTiempoOrdenamiento("Burbuja", datos, () -> OrdenamientoBurbuja.ordenar(datos.clone()));
        PruebasRendimiento.medirTiempoOrdenamiento("Inserción", datos, () -> OrdenamientoInsercion.ordenar(datos.clone()));
        PruebasRendimiento.medirTiempoOrdenamiento("Selección", datos, () -> OrdenamientoSeleccion.ordenar(datos.clone()));

        int objetivo = datos[datos.length / 2];
        PruebasRendimiento.medirTiempoOrdenamiento("Búsqueda Secuencial", datos, () -> BusquedaSecuencial.buscar(datos.clone(), objetivo));
        PruebasRendimiento.medirTiempoOrdenamiento("Búsqueda Binaria", datos, () -> BusquedaBinaria.buscar(datos.clone(), objetivo));
    }

    private static int[] generarDatos(int tamaño) {
        Random rand = new Random();
        int[] datos = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            datos[i] = rand.nextInt(100000);
        }
        return datos;
    }
}