//El algoritmo funciona dividiendo el arreglo en subarreglos y luego ordenando estos subarreglos recursivamente. Utiliza un elemento llamado pivote para hacer las particiones del arreglo.

public class QuickSort {
    public static void main(String[] args) {
        int[] arreglo = {10, 7, 8, 9, 1, 5};

        System.out.println("Arreglo antes de ser ordenado:");
        imprimirArreglo(arreglo);

        // Llamada al método de QuickSort
        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("\nArreglo después de ser ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método principal de QuickSort
    public static void quickSort(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            // Encuentra el pivote de partición
            int indicePivote = particion(arreglo, bajo, alto);

            // Ordena los elementos antes y después de la partición
            quickSort(arreglo, bajo, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, alto);
        }
    }

    // Método para realizar la partición del arreglo
    public static int particion(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto]; // Elige el último elemento como pivote
        int i = (bajo - 1); // Índice del elemento más pequeño

        for (int j = bajo; j < alto; j++) {
            // Si el elemento actual es menor o igual que el pivote
            if (arreglo[j] <= pivote) {
                i++;

                // Intercambia arreglo[i] con arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Intercambia el pivote con el elemento en arreglo[i + 1]
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temp;

        return i + 1; // Retorna el índice del pivote
    }

    // Método para imprimir el arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}


// Explicación:
// Método quickSort(int[] arreglo, int bajo, int alto): Este es el método principal de QuickSort. Si el índice inferior (bajo) es menor que el superior (alto), realiza la partición y ordena recursivamente las dos mitades del arreglo.
// Método particion(int[] arreglo, int bajo, int alto): Este método selecciona el último elemento como pivote y organiza los elementos menores al pivote a su izquierda, y los mayores a su derecha. Finalmente, coloca el pivote en su posición correcta.
// Intercambio de elementos: Se realiza un intercambio entre los elementos menores o iguales al pivote y los mayores usando una variable temporal temp.
// Impresión del arreglo: Se imprime el arreglo antes y después de aplicar el ordenamiento.
