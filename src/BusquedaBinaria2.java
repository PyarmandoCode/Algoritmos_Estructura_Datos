
//Aquí tienes un ejemplo de búsqueda binaria en un arreglo en Java. Este algoritmo asume que el arreglo está ordenado de forma ascendente. Si el elemento está en el arreglo, la función devuelve el índice; si no, devuelve -1.


import java.util.Arrays;
public class BusquedaBinaria2 {
    public static void main(String[] args) {
        // Arreglo ordenado
        int[] arreglo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        // Elemento a buscar
        int elemento = 14;

        // Llamada al método de búsqueda binaria
        int resultado = busquedaBinaria(arreglo, elemento);

        // Mostrar resultado
        if (resultado == -1) {
            System.out.println("El elemento no está en el arreglo.");
        } else {
            System.out.println("El elemento se encuentra en el índice: " + resultado);
        }
    }

    // Método de búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Verifica si el elemento está en el medio
            if (arreglo[medio] == elemento) {
                return medio;
            }

            // Si el elemento es mayor, ignora la mitad izquierda
            if (arreglo[medio] < elemento) {
                inicio = medio + 1;
            } 
            // Si el elemento es menor, ignora la mitad derecha
            else {
                fin = medio - 1;
            }
        }

        // Si no se encuentra el elemento
        return -1;
    }
}


//Explicación:
//Variables inicio y fin: Estas definen los límites de la porción del arreglo en la que estamos buscando.

//Cálculo del medio: medio = inicio + (fin - inicio) / 2. Esto asegura que el índice del medio esté bien calculado incluso para valores grandes.

//Condiciones:

//Si el valor medio es igual al elemento, se devuelve el índice.
//Si el valor medio es menor que el elemento, se descarta la mitad izquierda.
//Si el valor medio es mayor que el elemento, se descarta la mitad derecha.
//Bucle: El bucle continúa hasta que inicio supera a fin, lo que indica que el elemento no está presente.